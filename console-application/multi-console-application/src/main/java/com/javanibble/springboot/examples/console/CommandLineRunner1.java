package com.javanibble.springboot.examples.console;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class CommandLineRunner1 implements CommandLineRunner {


    private static Logger LOG = LoggerFactory.getLogger(CommandLineRunner1.class);


    @Override
    public void run(String... args) {
        LOG.info("CommandLineRunner 1: Now Executing ");
    }

}
