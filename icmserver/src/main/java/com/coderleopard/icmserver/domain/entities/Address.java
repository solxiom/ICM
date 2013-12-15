/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */
@Document
public class Address {
    

    private String street;
    private String city;
    private int postalCode;
    private List<String> naibs;



    public List<String> getNaibs() {
        return naibs;
    }

    public void addNaibs(String naib) {
        if(this.naibs == null){
            this.naibs = new LinkedList<>();
        }
        this.naibs.add(naib);
    }
    
    

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{street=" + street + ", city=" + city + ", postalCode=" + postalCode + ", naibs=" + naibs + "}";
    }    
    
}
