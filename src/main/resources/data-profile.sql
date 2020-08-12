drop table PROFILE;
create table
    PROFILE
        (
            ID int primary key,
            CALLSIGN varchar unique,
            NAME varchar,
            ALIAS varchar,
            BASE varchar,
            DEBUT_IN varchar,
            DEBUT_ON varchar,
            UNIVERSE varchar,
            OFFICIAL varchar,
            CREATED date,
            UPDATED date
        );

insert into
    PROFILE(ID,CALLSIGN,NAME,ALIAS)
    values
        (100000,'batman','Batman','Bruce Wayne'),
        (100001,'superman','Superman','Clark Kent'),
        (100002,'wonderwoman','Wonder Woman','Diana Prince'),
        (100003,'aquaman','Aquaman','Arthur Curry'),
        (100004,'flash','Flash','Barry Allen'),
        (100005,'hawkgirl','Hawkgirl','Sheira Hall'),
        (100006,'martianmanhunter','Martian Manhunter','Jonn Jonzz'),
        (100007,'captainamerica','Captain America','Steve Rogers'),
        (100008,'ironman','Iron Man','Tony Stark'),
        (100009,'thor','Thor','Thor Odinson'),
        (100010,'blackwidow','Black Widow','Natasha Romanoff'),
        (100011,'hulk','Hulk','Bruce Banner'),
        (100012,'hawkeye','Hawkeye','Clint Barton'),
        (100013,'deadpool','Deadpool','Wade Wilson'),
        (100014,'doctorstrange','Doctor Strange','Stephen Strange'),
        (100015,'daredevil','Daredevil','Matt Murdock'),
        (100016,'spiderman','Spider-man','Peter Parker'),
        (100017,'greenarrow','Green Arrow','Oliver Queen'),
        (100018,'cyborg','Cyborg','Victor Stone'),
        (100019,'greenlantern','Green Lantern','Hal Jordan')
    ;
