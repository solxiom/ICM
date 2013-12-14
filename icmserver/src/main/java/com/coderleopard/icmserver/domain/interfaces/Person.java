/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.interfaces;

import com.coderleopard.icmserver.domain.entities.Address;
import java.awt.Image;

/**
 *
 * @author kavan
 */
public interface Person {

    public String getSocialSecurityNumber();

    public void setSocialSecurityNumber(String socialSecurity);

    public String getPassword();

    public void setPassword(String password);

    public String getEmail();

    public void setEmail(String email);

    public String getAbout();

    public void setAbout(String about);

    public Image getPicture();
    
    public void setPicture(Image picture);

    public Address getAddress();

    public void setAddress(Address address);
}
