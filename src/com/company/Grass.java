package com.company;

import java.awt.*;

public class Grass implements Drawable {

    @Override
    public void draw(Graphics2D g) {
    drawGrass(g);
    }

    private static void drawGrass(Graphics2D gr) {
        gr.setColor(Color.green);
        gr.fillRect(0, 400, 800, 200);
        drawFlowers(gr);
    }

    private static void drawFlowers(Graphics2D gr) {
        int middleRadius = 8;
        int petalRadius = 10;
         int centerX = Random.interval(0, 800);
            int centerY = Random.interval(400 + middleRadius + petalRadius, 600);
            drawFlowerMiddle(gr, middleRadius, centerX, centerY);
            drawFlowerPetals(gr, middleRadius, petalRadius, centerX, centerY);
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
