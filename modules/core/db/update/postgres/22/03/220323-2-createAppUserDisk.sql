alter table DISKRENTAL_APP_USER_DISK add constraint FK_DISKRENTAL_APP_USER_DISK_ON_APP_USER foreign key (APP_USER_ID) references SEC_USER(ID);
alter table DISKRENTAL_APP_USER_DISK add constraint FK_DISKRENTAL_APP_USER_DISK_ON_DISK foreign key (DISK_ID) references DISKRENTAL_DISK(ID);
create index IDX_DISKRENTAL_APP_USER_DISK_ON_APP_USER on DISKRENTAL_APP_USER_DISK (APP_USER_ID);
create index IDX_DISKRENTAL_APP_USER_DISK_ON_DISK on DISKRENTAL_APP_USER_DISK (DISK_ID);
