/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class Organisation {
    @Id
    private String buisinissIdentityCode;
    private String name;
    private Address billingAddress;

    public String getBuisinissIdentityCode() {
        return buisinissIdentityCode;
    }

    public void setBuisinissIdentityCode(String buisinissIdentityCode) {
        this.buisinissIdentityCode = buisinissIdentityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    
    
}
