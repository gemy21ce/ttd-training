/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Gamal_sabdelmeged
 */
@Service
public class RSSMailSenderImpl implements RSSMailSender {

    @Override
    public Integer sendFeedTo(String[] emails, String readGoogleNews) {
        
        return 200;
    }
    
}