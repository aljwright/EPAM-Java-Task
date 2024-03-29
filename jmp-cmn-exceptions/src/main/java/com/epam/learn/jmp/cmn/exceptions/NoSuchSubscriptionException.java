package com.epam.learn.jmp.cmn.exceptions;

/**
 * Exception thrown in case of no subscription found
 */
public class NoSuchSubscriptionException extends Exception{

    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * Instantiate NoSuchSubscriptionException and to set standard error message
     *
     */
    public NoSuchSubscriptionException(){
        setMessage("No Subscription found !");
    }


}

