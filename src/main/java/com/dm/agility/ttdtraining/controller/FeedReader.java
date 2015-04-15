/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining.controller;

import com.dm.agility.ttdtraining.service.RSSReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Gamal_sabdelmeged
 */
@Controller
public class FeedReader {

    @RequestMapping("/")
    public @ResponseBody
    String home() {
        return "Hello World!";
    }
    
    @Autowired
    private RSSReader reader;

    @RequestMapping(value = "/readGooglenews.do", produces = MediaType.TEXT_XML_VALUE)
    public @ResponseBody
    String readGoogleNews() {
        return reader.readGoogleNews();
    }

}
