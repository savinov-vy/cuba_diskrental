-- begin DISKRENTAL_DISK
create table DISKRENTAL_DISK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end DISKRENTAL_DISK
-- begin DISKRENTAL_APP_USER_DISK
create table DISKRENTAL_APP_USER_DISK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    APP_USER_ID uuid,
    DISK_ID uuid,
    --
    primary key (ID)
)^
-- end DISKRENTAL_APP_USER_DISK
-- begin SEC_USER
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'diskrental_AppUser' where DTYPE is null ^
-- end SEC_USER
