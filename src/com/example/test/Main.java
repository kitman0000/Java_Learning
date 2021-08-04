package com.example.test;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by zhong on 2021-8-4.
 */
public class Main {

    /***
     *  This example show how the classes are loaded by the Classloaders.
     *  We load UnknownClass by reflection but not importing it.
     *  Then we load another UnknownClass even we don't have its sourcecode.
     *
     *  In this way, we can modify our programs' features by adding or changing .class files
     *  without any rebuild of the whole project. Have fun!
     */

    public static void main(String[] args) throws Exception {
        URL url = new URL("file:/production/Java_dynamic_load/com/example/text/");

        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});

        Class clazz1 = classLoader.loadClass("com.example.test.UnknownClass");
        IMyInterface myInterface1 = (IMyInterface) clazz1.newInstance();
        myInterface1.run();

        Class clazz2 = classLoader.loadClass("com.example.test.UnknownClass2");
        IMyInterface myInterface2 = (IMyInterface) clazz2.newInstance();
        myInterface2.run();
    }
}
