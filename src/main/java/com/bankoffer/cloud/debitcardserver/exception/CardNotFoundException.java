package com.bankoffer.cloud.debitcardserver.exception;

/*@ResponseStatus(HttpStatus.OK)*/
public class CardNotFoundException extends Exception {

    public CardNotFoundException(String message) {
        super(message);
    }
}
