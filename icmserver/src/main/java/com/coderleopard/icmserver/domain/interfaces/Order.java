/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

import com.coderleopard.icmserver.domain.entities.Customer;
import com.coderleopard.icmserver.domain.entities.Feedback;
import com.coderleopard.icmserver.domain.entities.Interpreter;
import com.coderleopard.icmserver.domain.enums.OrderStatus;
import com.coderleopard.icmserver.domain.enums.OrderType;
import java.util.List;

/**
 *
 * @author kavan
 */
public interface Order extends Commentable, Complainable, JobEvent {

    public Customer getCustomer();

    public void setCustomer(Customer customer);

    public Interpreter getInterpreter();

    public void setInterpreter(Interpreter interpreter);

    public String getDescription();

    public void setDescription(String description);

    public String getResponsibleName();

    public void setResponsibleName(String name);

    public String getResponsiblePhone();

    public void setResponsiblePhone(String phone);

    public OrderStatus getOrderStatus();

    public void setOrderStatus(OrderStatus status);
    
    public OrderType getOrderType();
    
    public void setOrderType(OrderType orderType);
    
    public Feedback getFeedback();
    
    public void setFeedback(Feedback feedback);
    
    public List<String> getLanguages();
    
    public void setLanguages(List<String> languages);
    
    public String getInterpreterGender();
    
    public void setInterpreterGender(String gender);
    
}
