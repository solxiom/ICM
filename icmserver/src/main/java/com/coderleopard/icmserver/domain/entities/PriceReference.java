/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.interfaces.TimeMoneyRelationReference;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class PriceReference implements TimeMoneyRelationReference{
    
    @Id
    private long id;
    private String name;
    private Date created;
    private Date dateValid;
    private double normalHour;
    private double normalMinimum;
    private double nightHour;
    private double nightMinimum;
    private double holidayHour;
    private double holidayMinimum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDateValid() {
        return dateValid;
    }

    public void setDateValid(Date dateValid) {
        this.dateValid = dateValid;
    }

    @Override
    public double getNormalHour() {
        return normalHour;
    }

    @Override
    public void setNormalHour(double normalHour) {
        this.normalHour = normalHour;
    }

    @Override
    public double getNormalMinimum() {
        return normalMinimum;
    }

    @Override
    public void setNormalMinimum(double normalMinimum) {
        this.normalMinimum = normalMinimum;
    }

    @Override
    public double getNightHour() {
        return nightHour;
    }

    @Override
    public void setNightHour(double nightHour) {
        this.nightHour = nightHour;
    }

    @Override
    public double getNightMinimum() {
        return nightMinimum;
    }

    @Override
    public void setNightMinimum(double nightMinimum) {
        this.nightMinimum = nightMinimum;
    }

    @Override
    public double getHolidayHour() {
        return holidayHour;
    }

    @Override
    public void setHolidayHour(double holidayHour) {
        this.holidayHour = holidayHour;
    }

    @Override
    public double getHolidayMinimum() {
        return holidayMinimum;
    }

    @Override
    public void setHolidayMinimum(double holidayMinimum) {
        this.holidayMinimum = holidayMinimum;
    }
    
    
}
