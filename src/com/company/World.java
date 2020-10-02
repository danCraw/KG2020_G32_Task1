package com.company;

import java.awt.*;

class World {

    void drawAmountFlowers(Graphics2D gr, int amountFlowers) {
        int middleRadius = 8;
        int petalRadius = 10;
        for (int i = 0; i < amountFlowers; i++) {
            int x = Random.interval(0, 800);
            int y = Random.interval(400 + middleRadius + petalRadius, 600);
            Flower flower = new Flower(x, y);
            flower.draw(gr);
        }
    }

    void drawAmountClouds(Graphics2D gr, int amountClouds) {
        for (int i = 0; i < amountClouds; i++) {
            int x = Random.interval(0, 600);
            int y = Random.interval(0, 250);
            Cloud cloud = new Cloud(x, y);
            cloud.draw(gr);
        }
    }

    void drawAmountButterflys(Graphics2D gr, int amountButterflys) {
        for (int i = 0; i < amountButterflys; i++) {
            int x = Random.interval(50, 200);
            int y = Random.interval(100, 200);
            Butterfly butterfly = new Butterfly(x, y);
            butterfly.draw(gr);
        }
    }

}
