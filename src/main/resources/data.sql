drop table PROFILE;
create table
    PROFILE
        (
        ID int primary key,
        CALLSIGN varchar unique,
        NAME varchar,
        ALIAS varchar,
        PICTURE blob,
        CREATED date,
        UPDATED date
        );

insert into
    PROFILE(ID,CALLSIGN,NAME,ALIAS,PICTURE)
    values
        (100000,'batman','Batman','Bruce Wayne',file_read('classpath:/static/images/batman')),
        (100001,'superman','Superman','Clark Kent',file_read('classpath:/static/images/superman')),
        (100002,'wonderwoman','Wonder Woman','Diana Prince',file_read('classpath:/static/images/wonderwoman')),
        (100003,'aquaman','Aquaman','Arthur Curry',file_read('classpath:/static/images/aquaman')),
        (100004,'flash','Flash','Barry Allen',file_read('classpath:/static/images/flash')),
        (100005,'hawkgirl','Hawkgirl','Sheira Hall',file_read('classpath:/static/images/hawkgirl')),
        (100006,'martianmanhunter','Martian Manhunter','Jonn Jonzz',file_read('classpath:/static/images/martianmanhunter')),
        (100007,'captainamerica','Captain America','Steve Rogers',file_read('classpath:/static/images/captainamerica')),
        (100008,'ironman','Iron Man','Tony Stark',file_read('classpath:/static/images/ironman')),
        (100009,'thor','Thor','Thor Odinson',file_read('classpath:/static/images/thor')),
        (100010,'blackwidow','Black Widow','Natasha Romanoff',file_read('classpath:/static/images/blackwidow')),
        (100011,'hulk','Hulk','Bruce Banner',file_read('classpath:/static/images/hulk')),
        (100012,'hawkeye','Hawkeye','Clint Barton',file_read('classpath:/static/images/hawkeye')),
        (100013,'deadpool','Deadpool','Wade Wilson',file_read('classpath:/static/images/deadpool')),
        (100014,'doctorstrange','Doctor Strange','Stephen Strange',file_read('classpath:/static/images/doctorstrange')),
        (100015,'daredevil','Daredevil','Matt Murdock',file_read('classpath:/static/images/daredevil')),
        (100016,'spiderman','Spider-man','Peter Parker',file_read('classpath:/static/images/spiderman')),
        (100017,'greenarrow','Green Arrow','Oliver Queen',file_read('classpath:/static/images/greenarrow')),
        (100018,'cyborg','Cyborg','Victor Stone',file_read('classpath:/static/images/cyborg')),
        (100019,'greenlantern','Green Lantern','Hal Jordan',file_read('classpath:/static/images/greenlantern'));
