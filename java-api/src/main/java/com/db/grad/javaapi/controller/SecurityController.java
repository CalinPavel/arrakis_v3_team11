package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.dto.Bond;
import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.SecurityHandler;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class SecurityController {

    private SecurityHandler securityService;

    private final FirebaseAuth firebaseAuth;

    @Autowired
    public SecurityController(SecurityHandler sh, FirebaseAuth firebaseAuth){securityService = sh;
        this.firebaseAuth = firebaseAuth;
    }

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
    public ResponseEntity<?> getSecurityBy5DaysBondsDate(@PathVariable(value = "dateRequest") String dateRequest , @RequestHeader("Authorization") String authorizationHeader){

        if (authorizationHeader != null && authorizationHeader.startsWith("Basic ")) {
            String base64Credentials = authorizationHeader.substring("Basic ".length()).trim();
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));
            String[] usernamePassword = credentials.split(":");
            String email = usernamePassword[0];
            String password = usernamePassword[1];

            try {
                FirebaseToken decodedToken = firebaseAuth.verifyIdToken(password);
                System.out.println("Valid!");
            } catch (FirebaseAuthException e) {
                return ResponseEntity.badRequest().body("Invalid token: " + e.getMessage());
            }
        }
        List<Bond> bonds = securityService.getSecurityBy5DaysBondsDate(dateRequest);
        return ResponseEntity.ok(bonds);
    }

}
