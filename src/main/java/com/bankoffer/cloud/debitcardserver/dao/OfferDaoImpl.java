package com.bankoffer.cloud.debitcardserver.dao;

import com.bankoffer.cloud.debitcardserver.domain.Bank;
import com.bankoffer.cloud.debitcardserver.domain.DebitCard;
import com.bankoffer.cloud.debitcardserver.domain.Offer;
import com.bankoffer.cloud.debitcardserver.exception.CardNotFoundException;
import com.bankoffer.cloud.debitcardserver.exception.OfferNotFoundException;
import com.bankoffer.cloud.debitcardserver.reprository.BankOfferReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class OfferDaoImpl implements OfferDao {

    @Autowired
    BankOfferReprository offerReprository;

    @Autowired
    private EntityManager entityManager;

    public List<Bank> getOffers() {
        return offerReprository.findAll();
    }

    @Override
    public List<DebitCard> getDebitCardOffersByBankName(String name) throws CardNotFoundException {

        Bank bank = null;
        Query query = entityManager.createQuery("SELECT u FROM Bank u WHERE u.bankName=:name");
        query.setParameter("name", name);
        try {
            bank = (Bank) query.getSingleResult();
        } catch (Exception e) {
            throw new CardNotFoundException("No Such card found");
        }
        return bank.getDebitcards();
    }

    @Override
    public List<Offer> getDebitCardOffersByCardNumber(Long number) throws OfferNotFoundException {
        DebitCard debitCard = null;
        Query query = entityManager.createQuery("SELECT u FROM DebitCard u WHERE u.cardNumber=:number");
        query.setParameter("number", number);
        try {
            debitCard = (DebitCard) query.getSingleResult();
        } catch (Exception e) {
            throw new OfferNotFoundException("No Such offer found");
        }
        return debitCard.getOffers();
    }
}
