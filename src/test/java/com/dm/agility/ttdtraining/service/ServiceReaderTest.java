/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining.service;

import com.dm.agility.ttdtraining.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Gamal_sabdelmeged
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ServiceReaderTest {
    
    
    
    @Autowired
    private RSSReader reader;
    
    @Test
    public void testReadService(){
        String rss = reader.readGoogleNews();
        Assert.assertTrue(rss.contains("<rss version=\"2.0\">"));
    }
    
    @Autowired
    private RSSMailSender rssms;
    
    @Test
    public void testSendFeedInMail(){
        
        String[] emails = {"gmal.shaban@gmail.com"};
        
        Integer status = rssms.sendFeedTo(emails,reader.readGoogleNews());
        
        Assert.assertEquals("response status must be 200 ", 200, status.intValue());
    }
}
