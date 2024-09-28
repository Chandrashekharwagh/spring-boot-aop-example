package com.example.controller;

import com.example.service.WorkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {

    private final WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/work")
    public String doWork() throws InterruptedException {
        return workService.doWork();
    }

    @GetMapping("/other-work")
    public String doOtherWork() {
        return workService.doOtherWork();
    }
}
