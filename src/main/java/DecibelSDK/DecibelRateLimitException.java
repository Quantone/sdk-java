/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DecibelSDK;

import java.util.Date;

/**
 *
 * @author Philip Mortiboy at Decibel Music Systems Ltd
 */
public class DecibelRateLimitException extends DecibelException {
    private int requestLimit;
    
    private String timePeriod;
    
    private Date expires;
    
    public DecibelRateLimitException(String message){
        super(message);
    }
}
