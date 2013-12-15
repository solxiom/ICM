/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class TimeData {

    private int startTime;
    private int endTime;
    private int actualStartTime;
    private int actualEndTime;
    private Date startDate;
    private Date endDate;
    private int duration;
    
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(int actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public int getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(int actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
