
-- ROLE DEFINITIONS
INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_MODERATOR');
INSERT INTO roles (name) VALUES ('ROLE_BUSINESS_ADMIN');

-- PRIVILEGES
INSERT INTO user_privileges (name) VALUES ('WRITE');
INSERT INTO user_privileges (name) VALUES ('READ');
INSERT INTO user_privileges (name) VALUES ('UPDATE');
INSERT INTO user_privileges (name) VALUES ('DELETE');
INSERT INTO user_privileges (name) VALUES ('CRUD');

-- OPERATION PROVIDERS
INSERT INTO operation_providers ("type") VALUES
    ('SURGEON'),
    ('ANESTHESIOLOGIST'),
    ('CERTIFIED_NURSE'),
    ('OP_ROOM_NURSE'),
    ('SURGICAL_TECH');

-- ASSETS
INSERT INTO assets (name, type) VALUES
    ('Scalpel', 'SURGICAL_INSTRUMENT'),
    ('MRI Machine', 'MACHINE'),
    ('Anesthesia Machine', 'EQUIPMENT'),
    ('Surgical Mask', 'OTHER_ESSENTIAL_TOOL');

-- USERS
INSERT INTO users (username, email, password) VALUES ('user', 'user@example.com', '$2a$10$tSo99B0YpDTP77hyiowGt.19qEEHT..Ml1wo3cI9bhbnhQs.mIsbu');//password: user

-- USER ROLES
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);

-- OPERATION ROOMS
INSERT INTO operation_rooms (room_nr, building_block, floor, state, type) VALUES
  (100, 'A1', '1st', 'STERILE', 'GENERAL_SURGERY'),
  (101, 'A2', '1st', 'MAINTENANCE', 'CARDIAC_SURGERY'),
  (102, 'B1', '2nd', 'AWAITING_CLEANING', 'NEURO_SURGERY'),
  (103, 'B2', '2nd', 'UNDER_STERILISATION', 'PLASTIC_SURGERY'),
  (104, 'C1', '3rd', 'STERILE', 'EMERGENCY_SURGERY'),
  (105, 'C2', '3rd', 'MAINTENANCE', 'GENERAL_SURGERY'),
  (106, 'D1', '4th', 'AWAITING_CLEANING', 'CARDIAC_SURGERY'),
  (107, 'D2', '4th', 'UNDER_STERILISATION', 'NEURO_SURGERY'),
  (108, 'E1', '5th', 'STERILE', 'PLASTIC_SURGERY'),
  (109, 'E2', '5th', 'MAINTENANCE', 'EMERGENCY_SURGERY');

-- ROOM INVENTORY
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (1, 1, 5);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (2, 2, 6);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (3, 3, 7);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (4, 4, 8);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (1, 5, 9);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (2, 6, 10);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (3, 7, 11);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (4, 8, 12);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (1, 9, 13);
INSERT INTO room_inventory (asset_id, room_id, count) VALUES (2, 10, 14);

-- PATIENTS
INSERT INTO patients (name, nin) VALUES
  ('John Doe', '1234567890'),
  ('Jane Smith', '2345678901'),
  ('Robert Brown', '3456789012'),
  ('Emily Johnson', '4567890123'),
  ('William Davis', '5678901234'),
  ('Olivia Wilson', '6789012345'),
  ('James Miller', '7890123456'),
  ('Sophia Garcia', '8901234567'),
  ('Michael Martinez', '9012345678'),
  ('Isabella Anderson', '0123456789');

-- TEAM MEMBERS
INSERT INTO team_members (name, opprovider_id) VALUES
  ('Dr. Alice', 'ANESTHESIOLOGIST'),
  ('Dr. Bob', 'SURGEON'),
  ('Nurse Carla', 'ANESTHESIOLOGIST'),
  ('Nurse Dan', 'SURGEON'),
  ('Technician Eva', 'CERTIFIED_NURSE'),
  ('Dr. Frank', 'CERTIFIED_NURSE'),
  ('Dr. Grace', 'ANESTHESIOLOGIST'),
  ('Nurse Henry', 'SURGICAL_TECH'),
  ('Nurse Isla', 'SURGICAL_TECH'),
  ('Technician Jack', 'OP_ROOM_NURSE');

-- PRE-OPERATIVE ASSESSMENTS
INSERT INTO pre_operative_assessments (name) VALUES
  ('Cardiac Check'),
  ('Respiratory Evaluation'),
  ('Full Blood Panel'),
  ('Imaging Scan'),
  ('Pre-op Interview'),
  ('Physical Assessment'),
  ('Medical History'),
  ('Consent Form'),
  ('COVID-19 Test'),
  ('Nutritional Assessment');

-- ASSESSMENTS
INSERT INTO assesments (team_member_id, patient_id, pre_op_a_id, start_date) VALUES
  (1, 1, 'Cardiac Check', CURRENT_TIMESTAMP),
  (2, 2, 'Respiratory Evaluation', CURRENT_TIMESTAMP),
  (3, 3, 'Full Blood Panel', CURRENT_TIMESTAMP),
  (4, 4, 'Imaging Scan', CURRENT_TIMESTAMP),
  (5, 5, 'Pre-op Interview', CURRENT_TIMESTAMP),
  (6, 6, 'Physical Assessment', CURRENT_TIMESTAMP),
  (7, 7, 'Medical History', CURRENT_TIMESTAMP),
  (8, 8, 'Consent Form', CURRENT_TIMESTAMP),
  (9, 9, 'COVID-19 Test', CURRENT_TIMESTAMP),
  (10, 10, 'Nutritional Assessment', CURRENT_TIMESTAMP);
