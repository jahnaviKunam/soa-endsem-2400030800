package com.klef.ms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DriverController {

    @GetMapping("/drivers")
    public String getDrivers() {
        return "Driver Service is running";
    }
}