package com.jinternals.spring.cloud.example.zuul;

import com.jinternals.spring.cloud.example.zuul.filters.HeaderFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import static org.springframework.boot.SpringApplication.run;

@EnableZuulProxy
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @Bean
   public HeaderFilter headerFilter(@Value("${instanceId}") String instance){
       return new HeaderFilter(instance);
    }

}
