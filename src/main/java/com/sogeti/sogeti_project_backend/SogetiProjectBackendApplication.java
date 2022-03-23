package com.sogeti.sogeti_project_backend;

import com.sogeti.sogeti_project_backend.service.MailService;
import com.sogeti.sogeti_project_backend.utils.Mail;
import javafx.application.Application;
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

        Mail mail = new Mail();
        mail.setMailFrom("svanteomax@gmail.com");
        mail.setMailTo("mohamud99@gmail.com");
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\nwww.sogeti.com");

        ApplicationContext ctx = SpringApplication.run(SogetiProjectBackendApplication.class, args);
        MailService mailService = (MailService) ctx.getBean("mailService");
        mailService.sendEmail(mail);
    }
}
