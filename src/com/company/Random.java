package com.company;

public class Random {

    static int interval(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
