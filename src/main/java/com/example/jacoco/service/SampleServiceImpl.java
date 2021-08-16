package com.example.jacoco.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
    public String getTestMessage() {
        return "Test";
    }

    public int getBranchValue(int input) {
        if(input < 0) {
            return -1;
        } else if(input == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
