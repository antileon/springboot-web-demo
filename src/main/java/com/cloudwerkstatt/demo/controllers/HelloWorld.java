package com.cloudwerkstatt.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * Created by udourbantschitsch on 09/02/16.
 */

@RestController
public class HelloWorld {

    private static final Logger logger =
            LoggerFactory.getLogger(HelloWorld.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(HttpServletRequest request) {

        LocalDateTime date = LocalDateTime.now();
        logger.info("Request from: " + request.getRemoteAddr());

        return date.toString() + " - your ip-address is " + request.getRemoteAddr();

    }
}