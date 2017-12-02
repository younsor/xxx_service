package com.smallbn.web.dto;

public class DtoDomain
{
    public String domain;
    public String name;
    public String loginLogoUrl;
    public String onsiteLogoUrl;
    public String pageTitle;
    public String copyright;

    public String getDomain()
    {
        return domain;
    }

    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLoginLogoUrl()
    {
        return loginLogoUrl;
    }

    public void setLoginLogoUrl(String loginLogoUrl)
    {
        this.loginLogoUrl = loginLogoUrl;
    }

    public String getOnsiteLogoUrl()
    {
        return onsiteLogoUrl;
    }

    public void setOnsiteLogoUrl(String onsiteLogoUrl)
    {
        this.onsiteLogoUrl = onsiteLogoUrl;
    }

    public String getPageTitle()
    {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle)
    {
        this.pageTitle = pageTitle;
    }

    public String getCopyright()
    {
        return copyright;
    }

    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }
}
