create or replace table if not exists
    PROFILE
        (
        ID int primary key,
        NAME varchar,
        ALIAS varchar,
        CREATED date,
        UPDATED date
        );

merge into
    PROFILE(ID,NAME,ALIAS)
    key (ID)
    values
        (101,'Batman','Bruce Wayne'),
        (102,'Superman','Clark Kent'),
        (103,'Wonder Woman','Diana Prince'),
        (104,'Captain America','Steve Rogers'),
        (105,'Iron Man','Tony Stark'),
        (106,'Thor','');