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
);