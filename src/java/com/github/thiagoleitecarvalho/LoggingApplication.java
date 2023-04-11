package com.github.thiagoleitecarvalho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.thiagoleitecarvalho.business.MyBusinessClass;
import com.github.thiagoleitecarvalho.excpetion.MyException;
import com.github.thiagoleitecarvalho.model.MyEntity;

/**
 * Class for initialize the applicaton.
 * @author Thiago Leite
 */
@SpringBootApplication
public class LoggingApplication {

    /**
     * Config logging for LoggingApplication.class.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(LoggingApplication.class, args);
        LOGGER.info("Application Started...");

        MyEntity entity = new MyEntity();
        entity.setAttribute1("My entity");
        entity.setAttribute2(1.0);
        entity.setAttribute3(true);
        entity.setAttribute4(2);

        try {

            String message = new MyBusinessClass().method1(entity);

            LOGGER.info("Message: {}", message);
        } catch (MyException e) {
            LOGGER.error("An error occurs: {}", e.getMessage());
        }
    }
}
