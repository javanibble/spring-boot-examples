package com.javanibble.springboot.examples.console;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class CommandLineRunner2 implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(CommandLineRunner2.class);


    @Override
    public void run(String... args) {
        LOG.info("CommandLineRunner 2: Now Executing ");
    }

}
