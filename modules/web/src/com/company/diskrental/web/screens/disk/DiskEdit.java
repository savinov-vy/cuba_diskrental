package com.company.diskrental.web.screens.disk;

import com.haulmont.cuba.gui.screen.*;
import com.company.diskrental.entity.Disk;

@UiController("diskrental_Disk.edit")
@UiDescriptor("disk-edit.xml")
@EditedEntityContainer("diskDc")
@LoadDataBeforeShow
public class DiskEdit extends StandardEditor<Disk> {
}