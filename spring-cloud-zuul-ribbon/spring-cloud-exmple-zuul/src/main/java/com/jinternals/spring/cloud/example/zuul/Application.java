package com.jinternals.spring.cloud.example.zuul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

import static org.springframework.boot.SpringApplication.run;

@EnableZuulProxy
@SpringBootApplication
@EnableRetry
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
    }

}
