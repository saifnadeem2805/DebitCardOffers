package com.bankoffer.cloud.debitcardserver.service;

import com.bankoffer.cloud.debitcardserver.entities.BankDO;
import com.bankoffer.cloud.debitcardserver.entities.DebitCardDO;
import com.bankoffer.cloud.debitcardserver.entities.OfferDO;
import com.bankoffer.cloud.debitcardserver.exception.CardNotFoundException;
import com.bankoffer.cloud.debitcardserver.exception.OfferNotFoundException;

import java.util.List;

public interface OfferService {

    List<BankDO> getOffers();

    List<DebitCardDO> getDebitCardOffersByBankName(String name) throws CardNotFoundException;

    List<OfferDO> getDebitCardOffersByCardNumber(Long number) throws OfferNotFoundException;
}
