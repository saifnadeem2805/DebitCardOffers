package com.bankoffer.cloud.debitcardserver;

import com.bankoffer.cloud.debitcardserver.entities.BankDO;
import com.bankoffer.cloud.debitcardserver.entities.DebitCardDO;
import com.bankoffer.cloud.debitcardserver.entities.OfferDO;
import com.bankoffer.cloud.debitcardserver.exception.CardNotFoundException;
import com.bankoffer.cloud.debitcardserver.exception.OfferNotFoundException;
import com.bankoffer.cloud.debitcardserver.service.OfferService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/debitcard")
public class DebitCardOfferController {

    @Autowired
    OfferService service;

    @RequestMapping(value = "/getOffers", method = RequestMethod.GET)
    @ApiOperation(value = "Find all debit card offer", notes = "Returns a collection of debit card bank offers")
    public ResponseEntity<List<BankDO>> getDebitCardOffers2() {
        List<BankDO> bankDOList = service.getOffers();
        HttpHeaders headers = new HttpHeaders();
        try {
            if (!bankDOList.isEmpty()) {
                return new ResponseEntity(bankDOList, headers, HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/bankName/{name}", method = RequestMethod.GET)
    @ApiOperation(value = "Find all debit card by bank", notes = "Returns a collection of debit cards with offers")
    public ResponseEntity<List<DebitCardDO>> getDebitCardOffersByBankName(@PathVariable("name") String name) {
        try {
            List<DebitCardDO> debitCardDOList = service.getDebitCardOffersByBankName(name);
            HttpHeaders headers = new HttpHeaders();
            if (!debitCardDOList.isEmpty()) {
                return new ResponseEntity(debitCardDOList, headers, HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
        } catch (CardNotFoundException e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/cardNumber/{number}", method = RequestMethod.GET)
    @ApiOperation(value = "Find all offers on debit card", notes = "Returns a collection of offers on debit card")
    public ResponseEntity<List<OfferDO>> getDebitCardOffersByCardNumber(@PathVariable("number") Long number) {
        try {
            List<OfferDO> offerDOList = service.getDebitCardOffersByCardNumber(number);
            HttpHeaders headers = new HttpHeaders();
            if (!offerDOList.isEmpty()) {
                return new ResponseEntity(offerDOList, headers, HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
        } catch (OfferNotFoundException e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
