package com.smallbn.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smallbn.web.domain.Tenant;
import com.smallbn.web.dto.DtoDomain;
import com.smallbn.web.repo.RepoTenant;

@Service
public class SrvDomain
{
    private static final Logger log = LoggerFactory.getLogger(SrvDomain.class);

    @Autowired
    private RepoTenant          repoTenant;

    public DtoDomain getDomainInfo(String domain)
    {
        Tenant tenant = repoTenant.findTenantByDomain(domain);

        DtoDomain dtoDomain = new DtoDomain();
        dtoDomain.setDomain(tenant.getDomain());
        dtoDomain.setName(tenant.getName());
        dtoDomain.setCopyright(tenant.getCopyright());
        dtoDomain.setLoginLogoUrl(tenant.getLoginLogoUrl());
        dtoDomain.setOnsiteLogoUrl(tenant.getOnsiteLogoUrl());
        dtoDomain.setPageTitle(tenant.getPageTitle());

        return dtoDomain;
    }
}
