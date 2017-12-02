package com.smallbn.web.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int               id;

    private String            account;

    @Column(name = "logo_url")
    private String            logoUrl;

    private String            mobile;

    private String            name;

    private String            password;

    @Column(name = "registration_time")
    private Timestamp         registrationTime;

    @Column(name = "role_id")
    private int               roleId;

    private byte              status;

    @Column(name = "tenant_id")
    private int               tenantId;

    @Column(name = "update_time")
    private Timestamp         updateTime;

    public User()
    {}

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAccount()
    {
        return this.account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getLogoUrl()
    {
        return this.logoUrl;
    }

    public void setLogoUrl(String logoUrl)
    {
        this.logoUrl = logoUrl;
    }

    public String getMobile()
    {
        return this.mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Timestamp getRegistrationTime()
    {
        return this.registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime)
    {
        this.registrationTime = registrationTime;
    }

    public int getRoleId()
    {
        return this.roleId;
    }

    public void setRoleId(int roleId)
    {
        this.roleId = roleId;
    }

    public byte getStatus()
    {
        return this.status;
    }

    public void setStatus(byte status)
    {
        this.status = status;
    }

    public int getTenantId()
    {
        return this.tenantId;
    }

    public void setTenantId(int tenantId)
    {
        this.tenantId = tenantId;
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