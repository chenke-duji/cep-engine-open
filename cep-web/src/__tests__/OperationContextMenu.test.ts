import { describe, it, expect, afterEach } from 'vitest'
import { mount } from '@vue/test-utils'
import OperationContextMenu from '@/components/OperationContextMenu.vue'
import type { Operation, AlarmEvent } from '@/types'

/**
 * The component uses <Teleport to="body">, so rendered content
 * lives in document.body — we query there, not on the wrapper.
 */
function mountMenu(operations: Operation[], selectedRows: AlarmEvent[] = []) {
  const wrapper = mount(OperationContextMenu, {
    props: {
      visible: true,
      x: 100,
      y: 100,
      operations,
      selectedCount: selectedRows.length,
      selectedRows,
    },
    attachTo: document.body,
  })
  return wrapper
}

function queryItems(selector: string): Element[] {
  return Array.from(document.body.querySelectorAll(selector))
}

/** Get the disabled state of each operation menu item. */
function getOpItemStates(): boolean[] {
  const items = queryItems('.context-menu-item')
  return items
    .filter(
      (el) =>
        !el.textContent?.includes('详细信息') &&
        !el.textContent?.includes('无可执行操作'),
    )
    .map((el) => el.classList.contains('disabled'))
}

const sampleRows: AlarmEvent[] = [
  { identifier: '1', status: 'Active', severity: 5 },
  { identifier: '2', status: 'Acked', severity: 3 },
  { identifier: '3', status: 'Cleared', severity: 0 },
]

afterEach(() => {
  document.body.innerHTML = ''
})

describe('OperationContextMenu — enableWhen evaluation', () => {
  it('enables all items when enableWhen is absent', () => {
    const ops: Operation[] = [
      { name: 'ack', menuLabel: 'Acknowledge', confirmMessage: '' },
      { name: 'clear', menuLabel: 'Clear', confirmMessage: '' },
    ]
    mountMenu(ops, sampleRows)
    expect(getOpItemStates()).toEqual([false, false])
  })

  it('enables all items when enableWhen is empty string', () => {
    const ops: Operation[] = [
      { name: 'ack', menuLabel: 'Ack', confirmMessage: '', enableWhen: '' },
    ]
    mountMenu(ops, sampleRows)
    expect(getOpItemStates()).toEqual([false])
  })

  it('enables all items when no rows are selected', () => {
    const ops: Operation[] = [
      { name: 'ack', menuLabel: 'Ack', confirmMessage: '', enableWhen: 'status=Acked' },
    ]
    mountMenu(ops, [])
    expect(getOpItemStates()).toEqual([false])
  })

  it('disables item when condition "status=Acked" and no row matches', () => {
    const ops: Operation[] = [
      { name: 'ack', menuLabel: 'Ack', confirmMessage: '', enableWhen: 'status=Acked' },
    ]
    const rows = [sampleRows[0], sampleRows[2]] // Active, Cleared
    mountMenu(ops, rows)
    expect(getOpItemStates()).toEqual([true])
  })

  it('enables item when condition "status!=Acked" and all rows satisfy it', () => {
    const ops: Operation[] = [
      { name: 'clear', menuLabel: 'Clear', confirmMessage: '', enableWhen: 'status!=Acked' },
    ]
    const rows = [sampleRows[0], sampleRows[2]] // Active, Cleared
    mountMenu(ops, rows)
    expect(getOpItemStates()).toEqual([false])
  })

  it('disables item when condition "status!=Acked" but a row is Acked', () => {
    const ops: Operation[] = [
      { name: 'clear', menuLabel: 'Clear', confirmMessage: '', enableWhen: 'status!=Acked' },
    ]
    mountMenu(ops, sampleRows) // includes Acked row
    expect(getOpItemStates()).toEqual([true])
  })

  it('evaluates numeric comparison ">" — enabled when condition met', () => {
    const ops: Operation[] = [
      { name: 'op', menuLabel: 'Op', confirmMessage: '', enableWhen: 'severity>3' },
    ]
    mountMenu(ops, [{ identifier: '1', severity: 5 }])
    expect(getOpItemStates()).toEqual([false])
  })

  it('evaluates numeric comparison ">" — disabled when condition not met', () => {
    document.body.innerHTML = ''
    const ops: Operation[] = [
      { name: 'op', menuLabel: 'Op', confirmMessage: '', enableWhen: 'severity>3' },
    ]
    mountMenu(ops, [{ identifier: '2', severity: 3 }])
    expect(getOpItemStates()).toEqual([true])
  })

  it('evaluates numeric comparison ">="', () => {
    const ops: Operation[] = [
      { name: 'op', menuLabel: 'Op', confirmMessage: '', enableWhen: 'severity>=3' },
    ]
    mountMenu(ops, [{ identifier: '1', severity: 3 }])
    expect(getOpItemStates()).toEqual([false])
  })

  it('evaluates "<=" comparison', () => {
    const ops: Operation[] = [
      { name: 'op', menuLabel: 'Op', confirmMessage: '', enableWhen: 'severity<=0' },
    ]
    mountMenu(ops, [{ identifier: '1', severity: 0 }])
    expect(getOpItemStates()).toEqual([false])
  })

  it('enables when enableWhen has an unparseable format (fallback)', () => {
    const ops: Operation[] = [
      { name: 'op', menuLabel: 'Op', confirmMessage: '', enableWhen: 'some-random-text' },
    ]
    mountMenu(ops, sampleRows)
    expect(getOpItemStates()).toEqual([false])
  })

  it('renders "no operations" when operations array is empty', () => {
    mountMenu([], [])
    expect(document.body.textContent).toContain('无可执行操作')
  })

  it('shows selection count when rows are selected', () => {
    mountMenu(
      [{ name: 'ack', menuLabel: 'Ack', confirmMessage: '' }],
      sampleRows,
    )
    expect(document.body.textContent).toContain('已选 3 条')
  })

  it('emits "select" with the operation when a menu item is clicked', async () => {
    const op: Operation = { name: 'ack', menuLabel: 'Acknowledge', confirmMessage: '' }
    const wrapper = mountMenu([op], sampleRows)
    const items = queryItems('.context-menu-item')
    const item = items.find((el) => el.textContent?.includes('Acknowledge'))!
    item.dispatchEvent(new MouseEvent('click', { bubbles: true }))
    await wrapper.vm.$nextTick()
    const selectEvents = wrapper.emitted('select')
    expect(selectEvents).toHaveLength(1)
    expect(selectEvents![0][0]).toEqual(op)
  })

  it('does not emit "select" when clicking a disabled item', async () => {
    const op: Operation = {
      name: 'ack',
      menuLabel: 'Acknowledge',
      confirmMessage: '',
      enableWhen: 'status=Acked',
    }
    const rows: AlarmEvent[] = [{ identifier: '1', status: 'Active' }]
    const wrapper = mountMenu([op], rows)
    const items = queryItems('.context-menu-item')
    const item = items.find((el) => el.textContent?.includes('Acknowledge'))!
    item.dispatchEvent(new MouseEvent('click', { bubbles: true }))
    await wrapper.vm.$nextTick()
    expect(wrapper.emitted('select')).toBeUndefined()
  })

  it('emits "detail" when the detail item is clicked', async () => {
    const wrapper = mountMenu(
      [{ name: 'ack', menuLabel: 'Ack', confirmMessage: '' }],
      sampleRows,
    )
    const items = queryItems('.context-menu-item')
    const detailItem = items.find((el) => el.textContent?.includes('详细信息'))!
    detailItem.dispatchEvent(new MouseEvent('click', { bubbles: true }))
    await wrapper.vm.$nextTick()
    expect(wrapper.emitted('detail')).toHaveLength(1)
  })

  it('has role="menu" on the container and role="menuitem" on items', () => {
    mountMenu(
      [{ name: 'ack', menuLabel: 'Ack', confirmMessage: '' }],
      sampleRows,
    )
    const menu = document.body.querySelector('.context-menu')
    expect(menu?.getAttribute('role')).toBe('menu')
    const items = document.body.querySelectorAll('[role="menuitem"]')
    expect(items.length).toBeGreaterThanOrEqual(2)
  })
})
