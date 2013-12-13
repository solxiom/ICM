/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.JobType;
import com.coderleopard.icmserver.domain.enums.OrderStatus;
import com.coderleopard.icmserver.domain.enums.OrderType;
import com.coderleopard.icmserver.domain.interfaces.Order;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class BasicTranslationOrder implements Order {

    @Id
    private long id;
    private File document;
    private int words;
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

    public File getDocument() {
        return document;
    }

    public void setDocument(File document) {
        this.document = document;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
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
        return description;
    }

    @Override
    public void setJobDescription(String jobDescription) {
        this.description = jobDescription;
    }
}
