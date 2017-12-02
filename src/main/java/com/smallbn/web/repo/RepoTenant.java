package com.smallbn.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smallbn.web.domain.Tenant;

public interface RepoTenant extends JpaRepository<Tenant, Integer>
{
    Tenant findTenantById(Integer id);

    Tenant findTenantByDomain(String domain);
}
