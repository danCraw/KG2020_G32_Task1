package com.company;

import java.awt.*;

public class Flower implements Drawable {
    int x;
    int y;

    Flower(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawFlowers(g);
    }

    private  void drawFlowers(Graphics2D gr) {
        int middleRadius = 8;
        int petalRadius = 10;
            drawFlowerMiddle(gr, middleRadius, x, y);
            drawFlowerPetals(gr, middleRadius, petalRadius, x, y);
    }

    private static void drawFlowerMiddle(Graphics2D gr, int middleRadius, int centerX, int centerY) {
        gr.setColor(Color.yellow);
        gr.fillOval(centerX, centerY, middleRadius, middleRadius);
    }

    private static void drawFlowerPetals(Graphics2D gr, int middleRadius, int petalRadius, int centerX, int centerY) {
        gr.setColor(Color.white);
        gr.fillOval(centerX - petalRadius, centerY, petalRadius, petalRadius);
        gr.fillOval(centerX, centerY + middleRadius, petalRadius, petalRadius);
        gr.fillOval(centerX + middleRadius, centerY, petalRadius, petalRadius);
        gr.fillOval(centerX, centerY - petalRadius, petalRadius, petalRadius);
    }

}
