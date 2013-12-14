/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.JobInterviewType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class JobInterview {
    @Id
    private long id;
    private double interviewPoints;
    private String description;
    private JobInterviewType interviewType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getInterviewPoints() {
        return interviewPoints;
    }

    public void setInterviewPoints(double interviewPoints) {
        this.interviewPoints = interviewPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobInterviewType getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(JobInterviewType interviewType) {
        this.interviewType = interviewType;
    }
    
    
}
