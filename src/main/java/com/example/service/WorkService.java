package com.example.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class WorkService {

    @Cacheable("workCache")
    public String doWork() throws InterruptedException {
        // Simulate time-consuming task
        Thread.sleep(3000);
        return "Doing some cached work";
    }

    public String doOtherWork() {
        return "Doing other work";
    }
}
