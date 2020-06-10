drop table PROFILE;
create or replace table if not exists
    PROFILE
        (
        ID int primary key,
        NAME varchar,
        ALIAS varchar,
        PICTURE blob,
        CREATED date,
        UPDATED date
        );

merge into
    PROFILE(ID,NAME,ALIAS,PICTURE)
    key (ID)
    values
        (1000,'Batman','Bruce Wayne',file_read('classpath:/static/images/batman')),
        (1001,'Superman','Clark Kent',file_read('classpath:/static/images/superman')),
        (1002,'Wonder Woman','Diana Prince',file_read('classpath:/static/images/wonderwoman')),
        (1003,'Aquaman','Arthur Curry',file_read('classpath:/static/images/aquaman')),
        (1004,'Flash','Barry Allen',file_read('classpath:/static/images/flash')),
        /*(1005,'Hawkgirl','Sheira Hall',file_read('classpath:/static/images/hawkgirl')),
        (1006,'Martian Manhunter','J'onn J'onzz',file_read('classpath:/static/images/martianmanhunter')),*/
        (1007,'Green Arrow','Oliver Queen',file_read('classpath:/static/images/greenarrow')),
        (1008,'Cyborg','Diana Prince',file_read('classpath:/static/images/cyborg')),
        (1009,'Green Lantern','Diana Prince',file_read('classpath:/static/images/greenlantern')),
        (2000,'Captain America','Steve Rogers',file_read('classpath:/static/images/captainamerica')),
        (2001,'Iron Man','Tony Stark',file_read('classpath:/static/images/ironman')),
        (2002,'Thor','Thor Odinson',file_read('classpath:/static/images/thor')),
        (2003,'Black Widow','Natasha Romanoff',file_read('classpath:/static/images/blackwidow')),
        (2004,'Hulk','Bruce Banner',file_read('classpath:/static/images/hulk')),
        (2005,'Hawkeye','Clint Barton',file_read('classpath:/static/images/hawkeye')),
        (2006,'Deadpool','Wade Wilson',file_read('classpath:/static/images/deadpool')),
       /* (2007,'Doctor Strange','Stephen Strange',file_read('classpath:/static/images/doctorstrange')),
        (2008,'Daredevil','Matt Murdock',file_read('classpath:/static/images/daredevil')),*/
        (2009,'Spiderman','Peter Parker',file_read('classpath:/static/images/spiderman'));
