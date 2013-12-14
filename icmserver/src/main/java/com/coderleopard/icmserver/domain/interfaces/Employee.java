/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

import com.coderleopard.icmserver.domain.entities.SalaryReference;
import com.coderleopard.icmserver.domain.entities.TaxCard;
import com.coderleopard.icmserver.domain.entities.TimeCardEvent;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kavan
 */
public interface Employee extends Person {

    public String getEmployeeNumber();

    public void setEmployeeNumber(String employeeNumber);

    public Date getStartDate();

    public void setStartDate(Date startDate);

    public List<TimeCardEvent> getTimeCardEvents();

    public void addTimeCardEvent(TimeCardEvent event);

    public TaxCard getTaxCard();

    public void setTaxCard(TaxCard taxCard);

    public SalaryReference getSalaryReference();

    public void setSalaryReference(SalaryReference reference);
}
