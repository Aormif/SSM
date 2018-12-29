package com.github.kahlkn.ispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class IspaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IspaceApplication.class, args);
    }

}

