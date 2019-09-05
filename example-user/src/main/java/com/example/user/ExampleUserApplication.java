package com.example.user;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.user.mapper")
public class ExampleUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleUserApplication.class, args);
    }

}
