/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.JobType;
import com.coderleopard.icmserver.domain.enums.OrderStatus;
import com.coderleopard.icmserver.domain.enums.OrderType;
import com.coderleopard.icmserver.domain.interfaces.Order;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kavan
 */
public class BasicOnlineOrder implements Order {

    private long id;
    private String orderPhoneNumber;
    private Customer customer;
    private Interpreter interpreter;
    private String description;
    private String responsibleName;
    private String responsiblePhone;
    private OrderStatus orderStatus;
    private OrderType orderType;
    private Feedback feedback;
    private List<String> languages;
    private String interpreterGender;
    private List<Complaint> complaints;
    private List<Comment> comments;
    private JobType jobType;
    private TimeData timeData;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderPhoneNumber() {
        return orderPhoneNumber;
    }

    public void setOrderPhoneNumber(String orderPhoneNumber) {
        this.orderPhoneNumber = orderPhoneNumber;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Interpreter getInterpreter() {
        return interpreter;
    }

    @Override
    public void setInterpreter(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getResponsibleName() {
        return responsibleName;
    }

    @Override
    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    @Override
    public String getResponsiblePhone() {
        return responsiblePhone;
    }

    @Override
    public void setResponsiblePhone(String responsiblePhone) {
        this.responsiblePhone = responsiblePhone;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    @Override
    public void setOrderStatus(OrderStatus status) {
        this.orderStatus = status;
    }

    @Override
    public OrderType getOrderType() {
        return orderType;
    }

    @Override
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    @Override
    public Feedback getFeedback() {
        return feedback;
    }

    @Override
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public List<String> getLanguages() {
        return languages;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String getInterpreterGender() {
        return interpreterGender;
    }

    @Override
    public void setInterpreterGender(String interpreterGender) {
        this.interpreterGender = interpreterGender;
    }

    @Override
    public List<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<Complaint> complaints) {
        this.complaints = complaints;
    }

    @Override
    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public JobType getJobType() {
        return jobType;
    }

    @Override
    public String getCommentableId() {
            return this.id + "";
    }

    @Override
    public void addComment(Comment comment) {
        if (this.comments == null) {
            comments = new LinkedList();
        }
        this.comments.add(comment);
    }

    @Override
    public String getComplainableId() {

        return this.id + "";
    }

    @Override
    public void addComplaint(Complaint complaint) {
        if (this.complaints == null) {

            this.complaints = new LinkedList();
        }
        this.complaints.add(complaint);
    }

    @Override
    public TimeData getTimeData() {
        return this.timeData;
    }

    public void setTimeData(TimeData td) {
        this.timeData = td;
    }

    @Override
    public String getJobDescription() {
        return this.description;
    }
}
