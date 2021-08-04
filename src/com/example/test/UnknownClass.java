package com.example.test;

/**
 * Created by zhong on 2021-8-4.
 */
public class UnknownClass implements IMyInterface {
    @Override
    public void run() {
        System.out.println("You don't know me but you can load me");
    }
}
