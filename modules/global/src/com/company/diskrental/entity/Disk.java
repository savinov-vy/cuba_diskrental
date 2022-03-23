package com.company.diskrental.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "DISKRENTAL_DISK")
@Entity(name = "diskrental_Disk")
@NamePattern("%s|name")
public class Disk extends StandardEntity {
    private static final long serialVersionUID = -86297049387902269L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}