package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController  {
    @GetMapping("/abc")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Welcome TO");
    }
}
