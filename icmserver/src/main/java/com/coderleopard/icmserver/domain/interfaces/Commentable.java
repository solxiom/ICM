/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

import com.coderleopard.icmserver.domain.entities.Comment;
import java.util.List;

/**
 *
 * @author kavan
 */
public interface Commentable {

    public String getCommentableId();

    public List<Comment> getComments();

    public void addComment(Comment comment);
}
