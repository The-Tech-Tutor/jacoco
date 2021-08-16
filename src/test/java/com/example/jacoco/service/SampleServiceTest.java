package com.example.jacoco.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleServiceTest {
    private SampleService sampleService = new SampleServiceImpl();

    @Test
    void testGet() {
        String message = sampleService.getTestMessage();
        assertEquals("Test", message);
    }

    @Test
    void testBranchValueBelowZero() {
        int branchValue = sampleService.getBranchValue(-4);
        assertEquals(-1, branchValue);
    }

    @Test
    void testBranchValueIsZero() {
        int branchValue = sampleService.getBranchValue(0);
        assertEquals(0, branchValue);
    }

    @Test
    void testBranchValueAboveZero() {
        int branchValue = sampleService.getBranchValue(10);
        assertEquals(1, branchValue);
    }
}
