/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.CommentType;
import com.coderleopard.icmserver.domain.interfaces.Commentable;
import java.util.Date;
import java.util.UUID;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class Comment{
    
   
    private UUID uniqueCommentId;
    private Date created;
    private Date lastUpdate;
    private String text;
    private Commentable commentable;
    private CommentType commentType;

    public UUID getUniqueCommentId() {
        return uniqueCommentId;
    }

    public void setUniqueCommentId(UUID uniqueCommentId) {
        this.uniqueCommentId = uniqueCommentId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Commentable getCommentable() {
        return commentable;
    }

    public void setCommentable(Commentable commentable) {
        this.commentable = commentable;
    }

    public CommentType getCommentType() {
        return commentType;
    }

    public void setCommentType(CommentType commentType) {
        this.commentType = commentType;
    }
    
    
    
}
