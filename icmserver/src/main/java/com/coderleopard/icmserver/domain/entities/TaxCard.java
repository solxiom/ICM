/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain.entities;

import java.awt.Image;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kavan
 */

@Document
public class TaxCard {
    
    
    private String cardId;
    private Image scannedDocument;
    private Date validUntil;
    private double overTheBasicRate;
    private double basicRate;
    private double basicRateCeiling;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    
    public Image getScannedDocument() {
        return scannedDocument;
    }

    public void setScannedDocument(Image scannedDocument) {
        this.scannedDocument = scannedDocument;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public double getOverTheBasicRate() {
        return overTheBasicRate;
    }

    public void setOverTheBasicRate(double overTheBasicRate) {
        this.overTheBasicRate = overTheBasicRate;
    }

    public double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(double basicRate) {
        this.basicRate = basicRate;
    }

    public double getBasicRateCeiling() {
        return basicRateCeiling;
    }

    public void setBasicRateCeiling(double basicRateCeiling) {
        this.basicRateCeiling = basicRateCeiling;
    }
    
    
}
