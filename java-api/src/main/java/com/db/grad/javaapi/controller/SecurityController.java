package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.dto.Bond;
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

    @GetMapping("/securities/{issuerName}")
    public List<Security> getSecurityByIssuerName(@PathVariable(value = "issuerName") String issuerName){
        return securityService.getSecurityByIssuerName(issuerName);
    }

    @GetMapping("/securities")
    public List<Bond> getBond(){
        return securityService.getBond();
    }


    @GetMapping("/securities/{issuerName}/get5daysbonds")
    public List<Security> getSecurityBy5DaysBonds(@PathVariable(value = "issuerName") String issuerName){
        return securityService.getSecurityBy5DaysBonds(issuerName);
    }

    @GetMapping("/securities/get5daysbonds/{dateRequest}")
    public List<Bond> getSecurityBy5DaysBondsDate(@PathVariable(value = "dateRequest") String dateRequest){
        return securityService.getSecurityBy5DaysBondsDate(dateRequest);
    }

}
