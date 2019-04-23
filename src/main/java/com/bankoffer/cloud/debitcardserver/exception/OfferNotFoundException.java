package com.bankoffer.cloud.debitcardserver.exception;

/*@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)*/
public class OfferNotFoundException extends Exception {

    public OfferNotFoundException(String message) {
        super(message);
    }
}
