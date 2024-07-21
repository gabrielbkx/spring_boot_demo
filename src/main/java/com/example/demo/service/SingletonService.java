package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    private static SingletonService instance;

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

    public String getMessage() {
        return "Singleton Instance: " + instance.hashCode();
    }
}
