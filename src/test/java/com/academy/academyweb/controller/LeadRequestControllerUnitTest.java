package com.academy.academyweb.controller;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by jasanchez on 14/02/2019.
 */



@RunWith(SpringRunner.class)
@SpringBootTest
public class LeadRequestControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private LeadRequestController leadRequestController;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetLead() throws Exception {

        mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }



    }

    @After
    public void tearDown() throws Exception {


    }

}
