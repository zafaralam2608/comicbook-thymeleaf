drop table PICTURE;
create table
    PICTURE
        (
            ID int primary key,
            IMAGE blob
        );

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
