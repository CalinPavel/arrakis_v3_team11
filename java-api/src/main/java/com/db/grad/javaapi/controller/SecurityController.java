package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.SecurityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class SecurityController {

    private SecurityHandler securityService;

    @Autowired
    public SecurityController(SecurityHandler sh){securityService = sh;}

    @GetMapping("/securities")
    public List<Security> getAllSecurities() {
        return securityService.getAllSecurities();
    }

    @GetMapping("/securities/{issuerName}")
    public List<Security> getSecurityByIssuerName(@PathVariable(value = "issuerName") String issuerName){
        return securityService.getSecurityByIssuerName(issuerName);
    }

    @GetMapping("/securities/{issuerName}/get5daysbods")
    public List<Security> getSecurityBy5DaysBods(@PathVariable(value = "issuerName") String issuerName){
        return securityService.getSecurityBy5DaysBods(issuerName);
    }

    @GetMapping("/securities/get5daysbods/{dateRequest}")
    public List<Security> getSecurityBy5DaysBodsDate(@PathVariable(value = "dateRequest") String dateRequest){
        return securityService.getSecurityBy5DaysBodsDate(dateRequest);
    }

}
