package jp.okabe.spring.boot.myapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class MyBootApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyBootApp1Application.class, args);
    }
}
