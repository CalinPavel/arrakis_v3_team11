package com.db.grad.javaapi;

import com.google.firebase.auth.FirebaseAuth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class JavaApiApplication {

	public JavaApiApplication() throws IOException {
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JavaApiApplication.class, args);



	}

}
