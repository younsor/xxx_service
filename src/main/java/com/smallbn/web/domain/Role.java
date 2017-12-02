package com.smallbn.web.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
public class Role implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int               id;

    private String            name;

    @Column(name = "registration_time")
    private Timestamp         registrationTime;

    @Column(name = "tenant_id")
    private int               tenantId;

    private String            type;

    @Column(name = "update_time")
    private Timestamp         updateTime;

    @Column(name = "user_id")
    private int               userId;

    public Role()
    {}

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Timestamp getRegistrationTime()
    {
        return this.registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime)
    {
        this.registrationTime = registrationTime;
    }

    public int getTenantId()
    {
        return this.tenantId;
    }

    public void setTenantId(int tenantId)
    {
        this.tenantId = tenantId;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Timestamp getUpdateTime()
    {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime)
    {
        this.updateTime = updateTime;
    }

    public int getUserId()
    {
        return this.userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

}