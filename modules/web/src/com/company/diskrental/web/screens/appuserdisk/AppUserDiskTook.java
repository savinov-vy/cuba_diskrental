package com.company.diskrental.web.screens.appuserdisk;

import com.haulmont.cuba.gui.screen.*;
import com.company.diskrental.entity.AppUserDisk;

@UiController("diskrental_AppUserDiskTook.browse")
@UiDescriptor("app-user-disk-took.xml")
@LookupComponent("appUserDisksTable")
@LoadDataBeforeShow
public class AppUserDiskTook extends StandardLookup<AppUserDisk> {
}