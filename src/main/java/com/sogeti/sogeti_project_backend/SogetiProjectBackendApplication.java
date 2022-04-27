package com.sogeti.sogeti_project_backend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.sogeti"})
public class SogetiProjectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SogetiProjectBackendApplication.class, args);

    }
}
