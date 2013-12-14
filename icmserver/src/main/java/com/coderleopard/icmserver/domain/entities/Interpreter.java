/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.interfaces.Employee;
import java.awt.Image;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class Interpreter implements Employee {

    private double initialLevel;
    private double onsiteLevel;
    private double onlineLevel;
    private double literaryLevel;
    private double generalLevel;
    //*****interface
    @Id
    private String socialSecurityNumber;
    private String password;
    private String email;
    private String about;
    private Image picture;
    private Address address;
    private String employeeNumber;
    private Date startDate;
    private List<TimeCardEvent> timeCardEvents;
    private TaxCard taxCard;
    private SalaryReference salaryReference;

    public double getInitialLevel() {
        return initialLevel;
    }

    public void setInitialLevel(double initialLevel) {
        this.initialLevel = initialLevel;
    }

    public double getOnsiteLevel() {
        return onsiteLevel;
    }

    public void setOnsiteLevel(double onsiteLevel) {
        this.onsiteLevel = onsiteLevel;
    }

    public double getOnlineLevel() {
        return onlineLevel;
    }

    public void setOnlineLevel(double onlineLevel) {
        this.onlineLevel = onlineLevel;
    }

    public double getLiteraryLevel() {
        return literaryLevel;
    }

    public void setLiteraryLevel(double literaryLevel) {
        this.literaryLevel = literaryLevel;
    }

    public double getGeneralLevel() {
        return generalLevel;
    }

    public void setGeneralLevel(double generalLevel) {
        this.generalLevel = generalLevel;
    }

    @Override
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAbout() {
        return about;
    }

    @Override
    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public Image getPicture() {
        return picture;
    }

    @Override
    public void setPicture(Image picture) {
        this.picture = picture;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    @Override
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public Date getStartDate() {

        return this.startDate;
    }

    @Override
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public List<TimeCardEvent> getTimeCardEvents() {
        return this.timeCardEvents;
    }

    @Override
    public void addTimeCardEvent(TimeCardEvent event) {
        if (this.timeCardEvents == null) {
            this.timeCardEvents = new LinkedList<>();
        }
        this.timeCardEvents.add(event);
    }

    @Override
    public TaxCard getTaxCard() {
        return this.taxCard;
    }

    @Override
    public void setTaxCard(TaxCard taxCard) {
        this.taxCard = taxCard;
    }

    @Override
    public SalaryReference getSalaryReference() {
        return this.salaryReference;
    }

    @Override
    public void setSalaryReference(SalaryReference reference) {
        this.salaryReference = reference;
    }
}
