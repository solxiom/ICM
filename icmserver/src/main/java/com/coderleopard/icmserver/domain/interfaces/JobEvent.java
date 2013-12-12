/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

import com.coderleopard.icmserver.domain.entities.TimeData;
import com.coderleopard.icmserver.domain.enums.JobType;

/**
 *
 * @author kavan
 */
public interface JobEvent {
    
    public TimeData getTimeData();
    
    public JobType getJobType();

    public String getJobDescription();
    
}
