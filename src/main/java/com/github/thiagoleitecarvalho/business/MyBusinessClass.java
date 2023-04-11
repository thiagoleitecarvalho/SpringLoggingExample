package com.github.thiagoleitecarvalho.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.thiagoleitecarvalho.excpetion.MyException;
import com.github.thiagoleitecarvalho.model.MyEntity;

/**
 * Simple business class to help for creating simple business logic.
 * @author Thiago Leite
 */
public class MyBusinessClass {

    /**
     * Config logging for LoggingApplication.class.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBusinessClass.class);

    public String method1(MyEntity entity) throws MyException {

        LOGGER.debug("Executing method1.");

        LOGGER.trace("Attribute1: {}", entity.getAttribute1());
        LOGGER.trace("Attribute2: {}", entity.getAttribute2());
        LOGGER.trace("Attribute3: {}", entity.isAttribute3());
        LOGGER.trace("Attribute4: {}", entity.getAttribute4());

        if (entity.getAttribute2() < 0) {
            LOGGER.warn("Negative value for Attribute2. This maybe cause errors");
        }

        double result = entity.getAttribute4() * entity.getAttribute2();

        if (result < 0) {
            throw new MyException("Negative value.");
        }

        if (!entity.isAttribute3()) {

            LOGGER.debug("Attribute3 false. The message won't be displayed.");

            return "";
        }

        String message = "The result is %f";
        return String.format(message, entity.getAttribute2() * entity.getAttribute4());

    }
}
