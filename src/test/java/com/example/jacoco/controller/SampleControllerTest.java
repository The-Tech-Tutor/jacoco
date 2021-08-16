package com.example.jacoco.controller;

import com.example.jacoco.service.SampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SampleController.class)
public class SampleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SampleService sampleService;

    @Test
    public void getTestMessage() throws Exception {
        when(sampleService.getTestMessage()).thenReturn("Test");
        MvcResult mvcResult = this.mockMvc.perform(get("/test")).andDo(print()).andExpect(status().is(200)).andReturn();
        assertEquals("Test", mvcResult.getResponse().getContentAsString());
    }
}
