/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.JobApplicationStatus;
import java.io.File;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class JobApplication {
    @Id
    private long id;
    private Date created;
    private String workExperience;
    private List<String> languages;
    private String whyThisJob;
    private String aboutApplicant;
    private List<File> attachments;
    private JobInterview interview;
    private JobApplicationStatus applicationStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getWhyThisJob() {
        return whyThisJob;
    }

    public void setWhyThisJob(String whyThisJob) {
        this.whyThisJob = whyThisJob;
    }

    public String getAboutApplicant() {
        return aboutApplicant;
    }

    public void setAboutApplicant(String aboutApplicant) {
        this.aboutApplicant = aboutApplicant;
    }

    public List<File> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<File> attachments) {
        this.attachments = attachments;
    }

    public JobInterview getInterview() {
        return interview;
    }

    public void setInterview(JobInterview interview) {
        this.interview = interview;
    }

    public JobApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(JobApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
    
    

}
