// MongoDB initialization script
// Creates the cep database and events_current collection with indexes

db = db.getSiblingDB('cep');

// Create collections
db.createCollection('events_current');
db.createCollection('events_history');
db.createCollection('maintain_rules');
db.createCollection('scripts');

// Indexes for events_current
db.events_current.createIndex({ "identifier": 1 }, { unique: true });
db.events_current.createIndex({ "domainId": 1, "severity": -1 });
db.events_current.createIndex({ "domainId": 1, "node": 1, "eventType": 1 });
db.events_current.createIndex({ "domainId": 1, "alertKey": 1, "eventType": 1 });
db.events_current.createIndex({ "lastOccurrence": -1 });
db.events_current.createIndex({ "status": 1, "domainId": 1 });

// Indexes for events_history
db.events_history.createIndex({ "identifier": 1 });
db.events_history.createIndex({ "domainId": 1, "lastOccurrence": -1 });

// Indexes for maintain_rules
db.maintain_rules.createIndex({ "domainId": 1, "enabled": 1 });
db.maintain_rules.createIndex({ "node": 1, "startTime": 1, "endTime": 1 });

print('CEP database initialized successfully.');
