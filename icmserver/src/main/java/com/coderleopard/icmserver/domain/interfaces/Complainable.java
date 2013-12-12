/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

import com.coderleopard.icmserver.domain.entities.Comment;
import com.coderleopard.icmserver.domain.entities.Complaint;
import java.util.List;

/**
 *
 * @author kavan
 */
public interface Complainable {
    
    public String getComplainableId();
    
    public List<Complaint> getComplaints();

    public void addComplaint(Complaint complaint);
    
}
