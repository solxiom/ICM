/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.TimeCardEventStatus;
import com.coderleopard.icmserver.domain.interfaces.JobEvent;
import java.util.UUID;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class TimeCardEvent {

    private UUID uniqueId;
    private JobEvent jobEvent;
    private TimeCardEventStatus eventStatus;

    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }
  
    public JobEvent getJobEvent() {
        return jobEvent;
    }

    public void setJobEvent(JobEvent jobEvent) {
        this.jobEvent = jobEvent;
    }

    public TimeCardEventStatus getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(TimeCardEventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }
    
    
}
