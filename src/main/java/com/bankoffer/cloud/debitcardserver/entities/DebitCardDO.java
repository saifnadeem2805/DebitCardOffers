package com.bankoffer.cloud.debitcardserver.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DebitCardDO {
    long id;
    long cardNumber;
    String cardHolderName;
    String cardCompany;
    String cardType;
    Date expirationDate;
    String verificationDate;
    List<OfferDO> offers;

    public DebitCardDO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardCompany() {
        return cardCompany;
    }

    public void setCardCompany(String cardCompany) {
        this.cardCompany = cardCompany;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(String verificationDate) {
        this.verificationDate = verificationDate;
    }

    public List<OfferDO> getOffers() {
        return offers;
    }

    public void setOffers(List<OfferDO> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "DebitCardDO{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardCompany='" + cardCompany + '\'' +
                ", cardType='" + cardType + '\'' +
                ", expirationDate=" + expirationDate +
                ", verificationDate='" + verificationDate + '\'' +
                ", offers=" + offers +
                '}';
    }
}
