package com.company.diskrental.web.screens.appuserdisk;

import com.haulmont.cuba.gui.screen.*;
import com.company.diskrental.entity.AppUserDisk;

@UiController("diskrental_AppUserDisk.browse")
@UiDescriptor("app-user-disk-browse.xml")
@LookupComponent("appUserDisksTable")
@LoadDataBeforeShow
public class AppUserDiskBrowse extends StandardLookup<AppUserDisk> {
}