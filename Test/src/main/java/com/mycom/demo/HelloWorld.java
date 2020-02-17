package com.mycom.demo;

import org.apache.log4j.Logger;

public class HelloWorld {

    private static Logger LOG = Logger.getLogger("HelloWorld");

    public static void main(String[] args) {

        System.out.println("Hello World! amdocs dallas");
        LOG.info("This is an info message");

    }

}
