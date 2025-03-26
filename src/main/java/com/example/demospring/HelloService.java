package com.example.demospring;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public void sayHello() {
        System.out.println("Hello World");
    }
}
