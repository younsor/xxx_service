package com.smallbn.web.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the tenant database table.
 * 
 */
@Entity
@NamedQuery(name = "Tenant.findAll", query = "SELECT t FROM Tenant t")
public class Tenant implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int               id;

    private String            accout;

    private BigDecimal        cash;

    @Column(name = "company_address")
    private String            companyAddress;

    @Column(name = "company_area")
    private String            companyArea;

    @Column(name = "company_contact")
    private String            companyContact;

    @Column(name = "company_mobile")
    private String            companyMobile;

    @Column(name = "company_name")
    private String            companyName;

    @Column(name = "company_telephone")
    private String            companyTelephone;

    @Column(name = "company_website")
    private String            companyWebsite;

    private String            copyright;

    private BigDecimal        cost;

    private String            domain;

    @Column(name = "is_del")
    private byte              isDel;

    @Column(name = "login_logo_url")
    private String            loginLogoUrl;

    private String            name;

    @Column(name = "onsite_logo_url")
    private String            onsiteLogoUrl;

    @Column(name = "page_title")
    private String            pageTitle;

    private String            password;

    @Column(name = "registration_time")
    private Timestamp         registrationTime;

    private byte              status;

    @Column(name = "update_time")
    private Timestamp         updateTime;

    public Tenant()
    {}

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAccout()
    {
        return this.accout;
    }

    public void setAccout(String accout)
    {
        this.accout = accout;
    }

    public BigDecimal getCash()
    {
        return this.cash;
    }

    public void setCash(BigDecimal cash)
    {
        this.cash = cash;
    }

    public String getCompanyAddress()
    {
        return this.companyAddress;
    }

    public void setCompanyAddress(String companyAddress)
    {
        this.companyAddress = companyAddress;
    }

    public String getCompanyArea()
    {
        return this.companyArea;
    }

    public void setCompanyArea(String companyArea)
    {
        this.companyArea = companyArea;
    }

    public String getCompanyContact()
    {
        return this.companyContact;
    }

    public void setCompanyContact(String companyContact)
    {
        this.companyContact = companyContact;
    }

    public String getCompanyMobile()
    {
        return this.companyMobile;
    }

    public void setCompanyMobile(String companyMobile)
    {
        this.companyMobile = companyMobile;
    }

    public String getCompanyName()
    {
        return this.companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyTelephone()
    {
        return this.companyTelephone;
    }

    public void setCompanyTelephone(String companyTelephone)
    {
        this.companyTelephone = companyTelephone;
    }

    public String getCompanyWebsite()
    {
        return this.companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite)
    {
        this.companyWebsite = companyWebsite;
    }

    public String getCopyright()
    {
        return this.copyright;
    }

    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }

    public BigDecimal getCost()
    {
        return this.cost;
    }

    public void setCost(BigDecimal cost)
    {
        this.cost = cost;
    }

    public String getDomain()
    {
        return this.domain;
    }

    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    public byte getIsDel()
    {
        return this.isDel;
    }

    public void setIsDel(byte isDel)
    {
        this.isDel = isDel;
    }

    public String getLoginLogoUrl()
    {
        return this.loginLogoUrl;
    }

    public void setLoginLogoUrl(String loginLogoUrl)
    {
        this.loginLogoUrl = loginLogoUrl;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOnsiteLogoUrl()
    {
        return this.onsiteLogoUrl;
    }

    public void setOnsiteLogoUrl(String onsiteLogoUrl)
    {
        this.onsiteLogoUrl = onsiteLogoUrl;
    }

    public String getPageTitle()
    {
        return this.pageTitle;
    }

    public void setPageTitle(String pageTitle)
    {
        this.pageTitle = pageTitle;
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

    public byte getStatus()
    {
        return this.status;
    }

    public void setStatus(byte status)
    {
        this.status = status;
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