package com.company.diskrental.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "DISKRENTAL_DISK")
@Entity(name = "diskrental_Disk")
@NamePattern("%s|name")
public class Disk extends StandardEntity {
    private static final long serialVersionUID = -86297049387902269L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "disk")
    private List<AppUserDisk> userDisk;

    public List<AppUserDisk> getUserDisk() {
        return userDisk;
    }

    public void setUserDisk(List<AppUserDisk> userDisk) {
        this.userDisk = userDisk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}