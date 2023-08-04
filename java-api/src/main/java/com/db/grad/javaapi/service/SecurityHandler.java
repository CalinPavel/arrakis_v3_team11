package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityHandler implements ISecurityService {

    private final SecurityRepository securityRepository;

    @Autowired
    public SecurityHandler(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    @Override
    public Security saveSecurity(Security security) {
        return securityRepository.save(security);
    }

    @Override
    public Security getSecurityById(Integer securityId) {
        return securityRepository.findById(securityId).orElse(null);
    }

    @Override
    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    @Override
    public void deleteSecurity(Integer securityId) {
        securityRepository.deleteById(securityId);
    }

    public Security getSecurityByIssuerName(String name) {
        List<Security> all = securityRepository.findAll();

        for (Security security : all) {
            if (security.getIssuerName().equalsIgnoreCase(name)) {
                return security;
            }
        }
        return null;
    }

}
