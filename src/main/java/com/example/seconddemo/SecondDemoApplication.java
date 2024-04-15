package com.example.seconddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SecondDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Login login = new Login();
        login.saySomething();
    }
}
