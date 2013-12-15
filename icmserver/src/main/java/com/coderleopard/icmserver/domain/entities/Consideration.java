/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.JobType;
import com.coderleopard.icmserver.domain.interfaces.JobEvent;
import java.util.UUID;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class Consideration implements JobEvent {


    private UUID considerationNumber;
    private String decisionText;
    private String decisionJustification;
    private TimeData timeData;
    private JobType jobType;
    private String jobDescription;

    public UUID getConsiderationNumber() {
        return considerationNumber;
    }

    public void setConsiderationNumber(UUID considerationNumber) {
        this.considerationNumber = considerationNumber;
    }

    public String getDecisionText() {
        return decisionText;
    }

    public void setDecisionText(String decisionText) {
        this.decisionText = decisionText;
    }

    public String getDecisionJustification() {
        return decisionJustification;
    }

    public void setDecisionJustification(String decisionJustification) {
        this.decisionJustification = decisionJustification;
    }

    @Override
    public TimeData getTimeData() {
        return timeData;
    }

    @Override
    public void setTimeData(TimeData timeData) {
        this.timeData = timeData;
    }

    @Override
    public JobType getJobType() {
        return jobType;
    }

    @Override
    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    @Override
    public String getJobDescription() {
        return jobDescription;
    }

    @Override
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
