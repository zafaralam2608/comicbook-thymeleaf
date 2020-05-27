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
        (101,'Batman','Bruce Wayne',file_read('classpath:/static/images/batman.jpeg')),
        (102,'Superman','Clark Kent',file_read('classpath:/static/images/superman.png')),
        (103,'Wonder Woman','Diana Prince',file_read('classpath:/static/images/wonderwoman.webp')),
        (104,'Captain America','Steve Rogers',file_read('classpath:/static/images/captainamerica.jpg')),
        (105,'Iron Man','Tony Stark',file_read('classpath:/static/images/ironman.png')),
        (106,'Thor','',file_read('classpath:/static/images/thor.jpg'));