package com.bankoffer.cloud.debitcardserver.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BankDO {

    String bankName;
    List<DebitCardDO> debitcards;

    public BankDO() {
    }

    public BankDO(String bankName, List<DebitCardDO> debitcards) {
        this.bankName = bankName;
        this.debitcards = debitcards;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<DebitCardDO> getDebitcards() {
        return debitcards;
    }

    public void setDebitcards(List<DebitCardDO> debitcards) {
        this.debitcards = debitcards;
    }

    @Override
    public String toString() {
        return "BankDO{" +
                "bankName='" + bankName + '\'' +
                ", debitcards=" + debitcards +
                '}';
    }
}
