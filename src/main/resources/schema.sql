create table if not exists PROFILE
(
   ID int primary key,
   CALLSIGN varchar unique,
   NAME varchar,
   ALIAS varchar,
   CREATED date,
   UPDATED date
);

create table if not exists PICTURE
(
   ID int primary key,
   IMAGE blob
);
