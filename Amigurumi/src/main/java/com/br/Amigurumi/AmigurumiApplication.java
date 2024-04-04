package com.br.Amigurumi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.br.Amigurumi")
public class AmigurumiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmigurumiApplication.class, args);
    }
}
