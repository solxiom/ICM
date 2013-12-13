/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

/**
 *
 * @author kavan
 */
public class AdditionalOrderInfo {

    private long id;
    private Feedback feedback;
    private String interpreterGneder;
    private String responsibleName;
    private String responsiblePhoneNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public String getInterpreterGneder() {
        return interpreterGneder;
    }

    public void setInterpreterGneder(String interpreterGneder) {
        this.interpreterGneder = interpreterGneder;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getResponsiblePhoneNumber() {
        return responsiblePhoneNumber;
    }

    public void setResponsiblePhoneNumber(String responsiblePhoneNumber) {
        this.responsiblePhoneNumber = responsiblePhoneNumber;
    }
    
    
}
