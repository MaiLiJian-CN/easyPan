package com.easypan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication(scanBasePackages = ("com.easypan"))
@EnableAsync
@EnableTransactionManagement
@EnableScheduling
@SpringBootApplication
public class EasypanApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasypanApplication.class, args);
    }

}
