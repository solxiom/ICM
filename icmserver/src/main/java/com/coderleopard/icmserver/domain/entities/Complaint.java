/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.ComplaintStatus;
import com.coderleopard.icmserver.domain.enums.ComplaintType;
import com.coderleopard.icmserver.domain.interfaces.Commentable;
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
public class Complaint implements Commentable {


    private UUID uniqueComplaintNumber;    
    private Date created;
    private Date closed;
    private ComplaintType complaintType;
    private ComplaintStatus complaintStatus;
    private List<Comment> comments;

    public UUID getUniqueComplaintNumber() {
        return uniqueComplaintNumber;
    }

    public void setUniqueComplaintNumber(UUID uniqueComplaintNumber) {
        this.uniqueComplaintNumber = uniqueComplaintNumber;
    }
 
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public ComplaintType getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(ComplaintType complaintType) {
        this.complaintType = complaintType;
    }

    public ComplaintStatus getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(ComplaintStatus complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    @Override
    public String getCommentableId() {
        return this.uniqueComplaintNumber + "";
    }

    @Override
    public List<Comment> getComments() {

        return this.comments;
    }

    @Override
    public void addComment(Comment comment) {
        if (this.comments == null) {
            this.comments = new LinkedList<>();
        }
        this.comments.add(comment);
    }
}
