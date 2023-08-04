package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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

    public List<Security> getSecurityByIssuerName(String name) {
        List<Security> all = securityRepository.findAll();
        List<Security> result = new ArrayList<Security>();

        for (Security security : all) {
            if (security.getIssuerName().equalsIgnoreCase(name)) {
                result.add(security);
            }
        }
        if(result.isEmpty())
            return null;

        return result;
    }


    public List<Security> getSecurityBy5DaysBods(String name) {
        List<Security> result = new ArrayList<Security>();
        result = getSecurityByIssuerName(name);

        List<Security> out = new ArrayList<Security>();

        LocalDate currentDate = LocalDate.now();
        LocalDate fiveDaysBeforeCurrentDate = currentDate.minusDays(5);
        LocalDate fiveDaysAfterCurrentDate = currentDate.plusDays(5);


        for (Security itr : result) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(itr.getBondMaturityDate(), formatter);

            if (date.isAfter(fiveDaysBeforeCurrentDate) && date.isBefore(fiveDaysAfterCurrentDate)) {
                System.out.println("Input date is within ±5 days from the current date.");
                out.add(itr);
            }


        }

        if(out.isEmpty())
            return null;

        return out;
    }

}
