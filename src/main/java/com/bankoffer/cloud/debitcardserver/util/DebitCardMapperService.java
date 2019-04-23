package com.bankoffer.cloud.debitcardserver.util;

import com.bankoffer.cloud.debitcardserver.domain.Bank;
import com.bankoffer.cloud.debitcardserver.domain.DebitCard;
import com.bankoffer.cloud.debitcardserver.domain.Offer;
import com.bankoffer.cloud.debitcardserver.entities.BankDO;
import com.bankoffer.cloud.debitcardserver.entities.DebitCardDO;
import com.bankoffer.cloud.debitcardserver.entities.OfferDO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DebitCardMapperService {

    public List<BankDO> convertDomainToEntity(List<Bank> bankList) {
        List<BankDO> listBank = new ArrayList<>();
        if (!bankList.isEmpty()) {
            for (Bank bank : bankList) {
                BankDO bankDO = new BankDO();
                bankDO.setBankName(bank.getBankName());
                bankDO.setDebitcards(convertDomainToEntityDebit(bank.getDebitcards()));
                listBank.add(bankDO);
            }
        }
        return listBank;
    }

    public List<DebitCardDO> convertDomainToEntityDebit(List<DebitCard> debitCardList) {
        List<DebitCardDO> listDebitCard = new ArrayList<>();
        if (!debitCardList.isEmpty()) {
            for (DebitCard debitCard : debitCardList) {
                DebitCardDO debitCardDO = new DebitCardDO();
                debitCardDO.setId(debitCard.getId());
                debitCardDO.setCardCompany(debitCard.getCardCompany());
                debitCardDO.setCardHolderName(debitCard.getCardHolderName());
                debitCardDO.setCardNumber(debitCard.getCardNumber());
                debitCardDO.setCardType(debitCard.getCardType());
                debitCardDO.setExpirationDate(debitCard.getExpirationDate());
                debitCardDO.setVerificationDate(debitCard.getVerificationDate());
                debitCardDO.setOffers(convertDomainToEntityOffer(debitCard.getOffers()));
                listDebitCard.add(debitCardDO);
            }
        }
        return listDebitCard;
    }

    public List<OfferDO> convertDomainToEntityOffer(List<Offer> offerList) {
        List<OfferDO> listOffers = new ArrayList<>();
        if (!offerList.isEmpty()) {
            for (Offer offer : offerList) {
                OfferDO offerDO = new OfferDO();
                offerDO.setId(offer.getId());
                offerDO.setOfferCode(offer.getOfferCode());
                offerDO.setOfferDesc(offer.getOfferDesc());
                offerDO.setOfferName(offer.getOfferName());
                offerDO.setOfferType(offer.getOfferType());
                listOffers.add(offerDO);
            }
        }
        return listOffers;
    }
}
