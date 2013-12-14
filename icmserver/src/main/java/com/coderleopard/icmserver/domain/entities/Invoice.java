/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.enums.InvoiceStatus;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class Invoice {
    @Id
    private long id;
    private Date created;
    private Date dueDate;
    private String description;
    private double price;
    private double discounted;
    private double acctualPrice;
    private PriceReference priceReference;
    private InvoiceStatus invoiceStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PriceReference getPriceReference() {
        return priceReference;
    }

    public void setPriceReference(PriceReference priceReference) {
        this.priceReference = priceReference;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
        
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscounted() {
        return discounted;
    }

    public void setDiscounted(double discounted) {
        this.discounted = discounted;
    }

    public double getAcctualPrice() {
        return acctualPrice;
    }

    public void setAcctualPrice(double acctualPrice) {
        this.acctualPrice = acctualPrice;
    }
    
    
}
