package com.hunybei.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubApplication.class, args);
    }

    public void hello1(){
        System.out.println("hello1");
    }
}
