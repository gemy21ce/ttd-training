/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.agility.ttdtraining;
import cucumber.api.java.en.Given;

/**
 *
 * @author Gamal_sabdelmeged
 */
public class sam {
    
    Integer input;
    
    @Given("^the input \"([^\"]*)\"$")
    public void input(Integer int1) throws Throwable {
        input = int1;
    }
    
}
