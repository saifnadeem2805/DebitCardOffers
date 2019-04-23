package com.bankoffer.cloud.debitcardserver.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bank_id")
    int id;
    @Column(name = "bank_name")
    String bankName;

    @OneToMany(targetEntity = DebitCard.class, mappedBy = "bank", fetch = FetchType.EAGER)
    List<DebitCard> debitcards;

    public Bank() {
    }

    public Bank(String bankName, List<DebitCard> debitcards) {
        this.bankName = bankName;
        this.debitcards = debitcards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<DebitCard> getDebitcards() {
        return debitcards;
    }

    public void setDebitcards(List<DebitCard> debitcards) {
        this.debitcards = debitcards;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", debitcards=" + debitcards +
                '}';
    }
}
