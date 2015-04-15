/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining.controller;

import com.dm.agility.ttdtraining.Application;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Gamal_sabdelmeged
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
@WebAppConfiguration
public class ReadFeedTest {
    
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    
    
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testReadGoogleFeed() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/readGooglenews.do")).andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().contentType(MediaType.TEXT_XML)).
                andExpect(MockMvcResultMatchers.content().node(Matchers.hasXPath("rss/channel")));
    }
    
}
