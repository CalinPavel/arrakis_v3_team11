package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;

import java.util.List;

public interface ISecurityService {
    Security saveSecurity(Security security);
    Security getSecurityById(Integer securityId);
    List<Security> getAllSecurities();
    void deleteSecurity(Integer securityId);
}
