/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.JobApplicationStatus;
import com.coderleopard.icmserver.domain.interfaces.Commentable;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class JobApplication implements Commentable {

    private UUID uniqueId;
    private Date created;
    private String workExperience;
    private List<String> languages;
    private String whyThisJob;
    private String aboutApplicant;
    private List<File> attachments;
    private JobInterview interview;
    private JobApplicationStatus applicationStatus;
    private List<Comment> comments;

    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
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

    @Override
    public String getCommentableId() {
        return this.uniqueId + "";
    }

    @Override
    public List<Comment> getComments() {
        return this.comments;
    }

    @Override
    public void addComment(Comment comment) {
        if(this.comments == null){
            this.comments = new LinkedList<>();
        }
        this.comments.add(comment);
        
    }
    
    

}
