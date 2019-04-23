package com.bankoffer.cloud.debitcardserver.service;

import com.bankoffer.cloud.debitcardserver.dao.OfferDao;
import com.bankoffer.cloud.debitcardserver.entities.BankDO;
import com.bankoffer.cloud.debitcardserver.entities.DebitCardDO;
import com.bankoffer.cloud.debitcardserver.entities.OfferDO;
import com.bankoffer.cloud.debitcardserver.exception.CardNotFoundException;
import com.bankoffer.cloud.debitcardserver.exception.OfferNotFoundException;
import com.bankoffer.cloud.debitcardserver.util.DebitCardMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    OfferDao offerDao;

    @Autowired
    DebitCardMapperService mapperService;

    @Override
    public List<BankDO> getOffers() {
        return mapperService.convertDomainToEntity(offerDao.getOffers());
    }

    @Override
    public List<DebitCardDO> getDebitCardOffersByBankName(String name) throws CardNotFoundException {
        return mapperService.convertDomainToEntityDebit(offerDao.getDebitCardOffersByBankName(name));
    }

    @Override
    public List<OfferDO> getDebitCardOffersByCardNumber(Long number) throws OfferNotFoundException {
        return mapperService.convertDomainToEntityOffer(offerDao.getDebitCardOffersByCardNumber(number));
    }

}
