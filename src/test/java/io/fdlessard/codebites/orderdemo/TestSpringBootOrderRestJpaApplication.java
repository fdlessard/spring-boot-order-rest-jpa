package io.fdlessard.codebites.orderdemo;

import org.springframework.boot.SpringApplication;

public class TestSpringBootOrderRestJpaApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringBootOrderRestJpaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
