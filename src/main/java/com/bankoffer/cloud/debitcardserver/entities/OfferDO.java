package com.bankoffer.cloud.debitcardserver.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class OfferDO {
    long id;
    String offerName;
    String offerType;
    String offerCode;
    String offerDesc;

    public OfferDO() {
    }

    public OfferDO(int i, String cash_back, String xyz, String s, String cash_back_on_selected_item) {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public void setOfferDesc(String offerDesc) {
        this.offerDesc = offerDesc;
    }

    @Override
    public String toString() {
        return "OfferDO{" +
                "id=" + id +
                ", offerName='" + offerName + '\'' +
                ", offerType='" + offerType + '\'' +
                ", offerCode='" + offerCode + '\'' +
                ", offerDesc='" + offerDesc + '\'' +
                '}';
    }
}
