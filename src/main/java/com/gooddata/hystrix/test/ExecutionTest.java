/**
 * Copyright (C) 2007-2013, GoodData(R) Corporation. All rights reserved.
 */
package com.gooddata.hystrix.test;

import java.util.concurrent.Future;

public class ExecutionTest {

    public static void main(String[] args) throws Exception {
        String s = new CommandHelloWorld("World").execute();
        System.err.println(s);
        Future<String> fs = new CommandHelloWorld("World").queue();
        String s2 = fs.get();
        System.err.println(s2);
    }

}
