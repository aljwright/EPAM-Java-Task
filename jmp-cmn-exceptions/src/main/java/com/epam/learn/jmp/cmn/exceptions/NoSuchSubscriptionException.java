package com.epam.learn.jmp.cmn.exceptions;

/**
 * Exception thrown in case of no subscription found
 */
public class NoSuchSubscriptionException extends Exception{

    /**
     *
     * Holder to store error message for the exception
     *
     */
    String message;

    /**
     *
     * get the error message of the exception
     *
     * @return
     * String error message of the exception
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     *
     * Set the error message of the exception
     *
     * @param message
     * error message
     */
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

