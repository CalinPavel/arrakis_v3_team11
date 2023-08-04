package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.AppUser;
import com.db.grad.javaapi.service.AppUserHandler;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class AppUserController {

    private final FirebaseAuth firebaseAuth;

    private final AppUserHandler AppUserService;


    public AppUserController(FirebaseAuth firebaseAuth, AppUserHandler appUserService) {
        this.firebaseAuth = firebaseAuth;
        AppUserService = appUserService;
    }



    @PostMapping("/validate-token")
    public ResponseEntity<String> validateToken(@RequestBody Map<String, String> requestData) {

        String idToken = requestData.get("token");
        String userEmail = requestData.get("email");


        try {
            FirebaseToken decodedToken = firebaseAuth.verifyIdToken(idToken);
            // The token is valid, and you can access the user's information
            // For example, you can access the user's UID using decodedToken.getUid()
            System.out.println("Valid!");

            if(!AppUserService.checkIfEmailAlreadyExist(userEmail)) {
                AppUser toAdd = new AppUser();
                toAdd.setUser_email_address(userEmail);
                AppUserService.saveAppUser(toAdd);
                System.out.println("User added!");
            }else{
                System.out.println("User already existing!");
            }
            return ResponseEntity.ok("Token is valid. User UID: " + decodedToken.getUid());
        } catch (FirebaseAuthException e) {
            return ResponseEntity.badRequest().body("Invalid token: " + e.getMessage());
        }
    }

}
