package com.bankoffer.cloud.debitcardserver.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Debit_Card")
public class DebitCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "card_number")
    long cardNumber;
    @Column(name = "card_holder_name")
    String cardHolderName;
    @Column(name = "card_company")
    String cardCompany;
    @Column(name = "card_type")
    String cardType;
    @Column(name = "expiration_date")
    Date expirationDate;
    @Column(name = "verification_date")
    String verificationDate;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    Bank bank;

    @OneToMany(targetEntity = Offer.class, mappedBy = "debitCard", fetch = FetchType.EAGER)
    List<Offer> offers;

    public DebitCard() {
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

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardCompany='" + cardCompany + '\'' +
                ", cardType='" + cardType + '\'' +
                ", expirationDate=" + expirationDate +
                ", verificationDate='" + verificationDate + '\'' +
                ", bank=" + bank +
                ", offers=" + offers +
                '}';
    }
}
