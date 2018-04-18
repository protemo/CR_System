package com.CompuRed.Store;


import com.CompuRed.Store.Info.InfoField;

import java.util.List;

public class Customer implements java.io.Serializable
{
    private Integer id;

    private String name;
    private String lastName;

    private List<InfoField> extraInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<InfoField> getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(List<InfoField> extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Customer(String name, String lastName)
    {
        this.setName(name);
        this.setLastName(lastName);
    }
}
