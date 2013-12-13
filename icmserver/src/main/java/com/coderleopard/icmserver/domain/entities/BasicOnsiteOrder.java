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
public class BasicOnsiteOrder implements Order {

    private long id;
    private Address orderAddress;
    private Customer customer;
    private Interpreter interpreter;
    private String description;
    private OrderStatus orderStatus;
    private OrderType orderType;
    private List<String> languages;
    private List<Complaint> complaints;
    private List<Comment> comments;
    private JobType jobType;
    private TimeData timeData;
    private AdditionalOrderInfo additionalInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(Address orderAddress) {
        this.orderAddress = orderAddress;
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
    public List<String> getLanguages() {
        return languages;
    }

    @Override
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public AdditionalOrderInfo getAdditionalInfo() {
        return additionalInfo;
    }

    @Override
    public void setAdditionalInfo(AdditionalOrderInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
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
