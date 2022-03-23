package com.company.diskrental.web.screens.disk;

import com.haulmont.cuba.gui.screen.*;
import com.company.diskrental.entity.Disk;

@UiController("diskrental_Disk.browse")
@UiDescriptor("disk-browse.xml")
@LookupComponent("disksTable")
@LoadDataBeforeShow
public class DiskBrowse extends StandardLookup<Disk> {
}