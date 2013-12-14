/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import com.coderleopard.icmserver.domain.interfaces.Person;
import java.awt.Image;
import org.springframework.data.annotation.Id;

/**
 *
 * @author kavan
 */
public class Applicant implements Person {
   
     //****interface
    @Id
    private String socialSecurityNumber;
    private String password;
    private String email;
    private String about;
    private Image picture;
    private Address address;
   
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

   
}
