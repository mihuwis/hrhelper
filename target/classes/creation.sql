CREATE TABLE IF NOT EXISTS mentors(
    id INTEGER PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    nick_name TEXT,
    phone_number TEXT,
    email TEXT,
    city TEXT,
    favourite_number INTEGER
);

CREATE TABLE IF NOT EXISTS applicants(
    id INTEGER PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
    phone_number TEXT,
    email TEXT,
    application_code INTEGER
);

COPY applicants FROM '/home/mihu/codecool/sql_java/Hrapp/applicants.csv' WITH(FORMAT csv);
COPY mentors FROM '/home/mihu/codecool/sql_java/Hrapp/mentors2.csv' WITH(FORMAT csv, null 'NULL');

