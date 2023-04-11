package com.github.thiagoleitecarvalho.excpetion;

/**
 * Exception for mapping how to log errors, when occurring it.
 * @author Thiago Leite
 */
public class MyException extends Exception {

    /**
     * Serial id.
     */
    private static final long serialVersionUID = -5039925555338505653L;

    /**
     * Custon constructor.
     * @param message Message error
     */
    public MyException(String message) {
        super(message);
    }

}
