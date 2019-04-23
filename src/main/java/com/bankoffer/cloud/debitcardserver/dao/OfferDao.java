package com.bankoffer.cloud.debitcardserver.dao;

import com.bankoffer.cloud.debitcardserver.domain.Bank;
import com.bankoffer.cloud.debitcardserver.domain.DebitCard;
import com.bankoffer.cloud.debitcardserver.domain.Offer;
import com.bankoffer.cloud.debitcardserver.exception.CardNotFoundException;
import com.bankoffer.cloud.debitcardserver.exception.OfferNotFoundException;

import java.util.List;

public interface OfferDao {

    List<Bank> getOffers();

    List<DebitCard> getDebitCardOffersByBankName(String name) throws CardNotFoundException;

    List<Offer> getDebitCardOffersByCardNumber(Long number) throws OfferNotFoundException;
}
