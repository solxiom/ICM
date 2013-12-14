/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

/**
 *
 * @author kavan
 */
public interface TimeMoneyRelationReference {

    public double getNormalHour();

    public void setNormalHour(double normalHour);

    public double getNormalMinimum();

    public void setNormalMinimum(double normalMinimum);

    public double getNightHour();

    public void setNightHour(double nightHour);

    public double getNightMinimum();

    public void setNightMinimum(double nightMinimum);

    public double getHolidayHour();

    public void setHolidayHour(double holidayHour);

    public double getHolidayMinimum();

    public void setHolidayMinimum(double holidayMinimum);
}
