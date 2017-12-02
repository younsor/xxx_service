package com.smallbn.web.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the role_type_module database table.
 * 
 */
@Entity
@Table(name = "role_type_module")
@NamedQuery(name = "RoleTypeModule.findAll", query = "SELECT r FROM RoleTypeModule r")
public class RoleTypeModule implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int               id;

    @Column(name = "module_id")
    private int               moduleId;

    @Column(name = "registration_time")
    private Timestamp         registrationTime;

    @Column(name = "role_type")
    private String            roleType;

    @Column(name = "update_time")
    private Timestamp         updateTime;

    public RoleTypeModule()
    {}

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getModuleId()
    {
        return this.moduleId;
    }

    public void setModuleId(int moduleId)
    {
        this.moduleId = moduleId;
    }

    public Timestamp getRegistrationTime()
    {
        return this.registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime)
    {
        this.registrationTime = registrationTime;
    }

    public String getRoleType()
    {
        return this.roleType;
    }

    public void setRoleType(String roleType)
    {
        this.roleType = roleType;
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