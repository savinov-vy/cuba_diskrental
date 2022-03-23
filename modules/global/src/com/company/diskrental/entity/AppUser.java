package com.company.diskrental.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "diskrental_AppUser")
@Extends(User.class)
public class AppUser extends User {
    private static final long serialVersionUID = -7842187558612947658L;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "appUser")
    private List<AppUserDisk> userDisk;

    public List<AppUserDisk> getUserDisk() {
        return userDisk;
    }

    public void setUserDisk(List<AppUserDisk> userDisk) {
        this.userDisk = userDisk;
    }
}