package com.smallbn.web.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the module database table.
 * 
 */
@Entity
@NamedQuery(name = "Module.findAll", query = "SELECT m FROM Module m")
public class Module implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int               id;

    private String            icon;

    @Column(name = "is_del")
    private byte              isDel;

    @Column(name = "level1_url")
    private String            level1Url;

    @Column(name = "level2_url")
    private String            level2Url;

    private String            name;

    @Column(name = "parent_id")
    private int               parentId;

    @Column(name = "registration_time")
    private Timestamp         registrationTime;

    private int               sort;

    @Column(name = "update_time")
    private Timestamp         updateTime;

    public Module()
    {}

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIcon()
    {
        return this.icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public byte getIsDel()
    {
        return this.isDel;
    }

    public void setIsDel(byte isDel)
    {
        this.isDel = isDel;
    }

    public String getLevel1Url()
    {
        return this.level1Url;
    }

    public void setLevel1Url(String level1Url)
    {
        this.level1Url = level1Url;
    }

    public String getLevel2Url()
    {
        return this.level2Url;
    }

    public void setLevel2Url(String level2Url)
    {
        this.level2Url = level2Url;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getParentId()
    {
        return this.parentId;
    }

    public void setParentId(int parentId)
    {
        this.parentId = parentId;
    }

    public Timestamp getRegistrationTime()
    {
        return this.registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime)
    {
        this.registrationTime = registrationTime;
    }

    public int getSort()
    {
        return this.sort;
    }

    public void setSort(int sort)
    {
        this.sort = sort;
    }

    public Timestamp getUpdateTime()
    {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime)
    {
        this.updateTime = updateTime;
    }

}