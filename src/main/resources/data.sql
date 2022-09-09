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
    
insert into
    PICTURE(ID,IMAGE)
values
    (100000,FILE_READ('classpath:/static/images/batman')),
    (100001,FILE_READ('classpath:/static/images/superman')),
    (100002,FILE_READ('classpath:/static/images/wonderwoman')),
    (100003,FILE_READ('classpath:/static/images/aquaman')),
    (100004,FILE_READ('classpath:/static/images/flash')),
    (100005,FILE_READ('classpath:/static/images/hawkgirl')),
    (100006,FILE_READ('classpath:/static/images/martianmanhunter')),
    (100007,FILE_READ('classpath:/static/images/captainamerica')),
    (100008,FILE_READ('classpath:/static/images/ironman')),
    (100009,FILE_READ('classpath:/static/images/thor')),
    (100010,FILE_READ('classpath:/static/images/blackwidow')),
    (100011,FILE_READ('classpath:/static/images/hulk')),
    (100012,FILE_READ('classpath:/static/images/hawkeye')),
    (100013,FILE_READ('classpath:/static/images/deadpool')),
    (100014,FILE_READ('classpath:/static/images/doctorstrange')),
    (100015,FILE_READ('classpath:/static/images/daredevil')),
    (100016,FILE_READ('classpath:/static/images/spiderman')),
    (100017,FILE_READ('classpath:/static/images/greenarrow')),
    (100018,FILE_READ('classpath:/static/images/cyborg')),
    (100019,FILE_READ('classpath:/static/images/greenlantern'))
;
