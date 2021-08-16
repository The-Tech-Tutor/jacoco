package com.example.jacoco.controller;

import com.example.jacoco.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @GetMapping
    public ResponseEntity getTestMessage(){
        return new ResponseEntity(sampleService.getTestMessage(), HttpStatus.OK);
    }
}
