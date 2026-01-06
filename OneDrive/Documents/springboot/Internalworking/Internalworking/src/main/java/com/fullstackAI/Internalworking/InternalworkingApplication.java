package com.fullstackAI.Internalworking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalworkingApplication implements CommandLineRunner {
    //@Autowired
    public InternalworkingApplication(RayzarPayPayment service) {
        this.service = service;
    }

    public static void main(String[] args) {
		SpringApplication.run(InternalworkingApplication.class, args);
	}

    private RayzarPayPayment service;
    @Override
    public void run(String... args) throws Exception {
        String payment = service.pay();
        System.out.println(payment);
    }
}
