/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining.service;

/**
 *
 * @author Gamal_sabdelmeged
 */
public interface RSSMailSender {

    Integer sendFeedTo(String[] emails, String readGoogleNews);

}
