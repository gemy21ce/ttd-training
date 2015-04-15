/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining.service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 *
 * @author Gamal_sabdelmeged
 */
@Service("readerService")
public class RSSReaderImpl implements RSSReader{

    @Value("${googlewebserviceURL:http://localhost:8084/samplefeed.xml}")
    private String googleNewsServiceURL;
    
    @Override
    public String readGoogleNews() {
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            
            HttpGet httpGet = new HttpGet(googleNewsServiceURL);
            
            CloseableHttpResponse response = httpclient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            
            
            return EntityUtils.toString(entity);
            
        } catch (IOException ex) {
            Logger.getLogger(RSSReaderImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
