package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
//@ComponentScan ek açıklaması, Spring tarafından taranacak üç paketi (ve alt paketleri) belirtmek için basePackages özniteliğini kullanır
@ComponentScan({"controller"}) //run class ı sonuc class ıyla farklı package de ve
//aynı hizada old için çalışabilmesi için bunu ekledik, aynı package de olsalar buna gerek yoktu.
public class SpringMvcApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
}
//runnerclass