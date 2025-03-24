package com.example.dependencyinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        System.out.println("Hallo main");
        System.setProperty("java.awt.headless","false");
        SpringApplication.run(Main.class, args);
    }
    @Override
    public void run(String... args){
        System.out.println("Hallo CommandLineRunner");
    }
}