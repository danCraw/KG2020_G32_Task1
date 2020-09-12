package com.company;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        drawSky(gr);
        drawGrass(gr);
        drawCat(gr, Color.gray);
        drawButterfly(gr, 3);
//        super.paint(g);
    }

    private static void drawButterfly(Graphics2D gr, int numberOfButterflies) {
        for (int i = 0; i < numberOfButterflies; i++) {
            //butterflyBody
            int x = rnd(50, 200);
            int y = rnd(100, 200);
            gr.setColor(Color.green);
            gr.fillOval(x, y - 15, 15, 15);
            gr.fillRect(x, y, 15, 45);
            //
            drawButterflyWings(gr, x, y, butterflyWingColor());
        }
    }

    private static void drawButterflyWings(Graphics2D gr, int butterflyX, int butterflyY, Color color) {
        gr.setColor(color);
        gr.fillOval(butterflyX - 25, butterflyY - 25, 25, 50);
        gr.fillOval(butterflyX - 15, butterflyY + 20, 15, 30);
        gr.fillOval(butterflyX + 15, butterflyY - 25, 25, 50);
        gr.fillOval(butterflyX + 15, butterflyY + 20, 15, 30);

    }

    private static Color butterflyWingColor() {
        int wingsColor = rnd(0, 2);

        if (wingsColor == 0) {
            return Color.red;
        }
        if (wingsColor == 1) {
            return Color.pink;
        }
        if (wingsColor == 2) {
            return Color.yellow;
        }
        if (wingsColor == 3) {
            return Color.orange;
        }
        return null;
    }

    private void drawCat(Graphics2D gr, Color color) {
        drawCatHead(gr, color);
        drawCatBody(gr, color);
    }

    private static void drawCatBody(Graphics2D gr, Color color) {
        gr.setColor(color);
        gr.fillRect(325, 350, 100, 150);
        drawCatPaws(gr, 325, 350, color);
        drawPlate(gr);

    }

    private static void drawPlate(Graphics2D gr) {
        gr.setColor(Color.white);
        gr.fillRect(313, 360, 125, 80);
        gr.setColor(Color.black);
        gr.drawString("отдам в хорошие руки", 315, 390);
    }


    private static void drawCatPaws(Graphics2D gr, int bodyX, int bodyY, Color color) {
        gr.setColor(color);

        drawCatFrontPaws(gr, bodyX, bodyY, color);

        drawCatBackPaws(gr, bodyX, bodyY, color);

    }

    private static void drawCatFrontPaws(Graphics2D gr, int bodyX, int bodyY, Color color) {

        //left
        gr.fillRect(bodyX + 25, bodyY + 70, 20, 70);
        gr.setColor(Color.black);
        gr.drawRect(bodyX + 25, bodyY + 70, 20, 70);
        gr.setColor(color);
        gr.fillOval(bodyX + 20, bodyY + 140, 30, 30);
        gr.setColor(Color.black);
        gr.drawOval(bodyX + 20, bodyY + 140, 30, 30);

        //right
        gr.setColor(color);
        gr.fillRect(bodyX + 55, bodyY + 70, 20, 70);
        gr.setColor(Color.black);
        gr.drawRect(bodyX + 55, bodyY + 70, 20, 70);
        gr.setColor(color);
        gr.fillOval(bodyX + 50, bodyY + 140, 30, 30);
        gr.setColor(Color.black);
        gr.drawOval(bodyX + 50, bodyY + 140, 30, 30);

    }

    private static void drawCatBackPaws(Graphics2D gr, int bodyX, int bodyY, Color color) {

        gr.setColor(color);
        gr.fillOval(bodyX - 40, bodyY + 75, 60, 80);
        gr.fillOval(bodyX + 80, bodyY + 75, 60, 80);
        gr.setColor(Color.black);
        gr.drawOval(bodyX - 40, bodyY + 75, 60, 80);
        gr.drawOval(bodyX + 80, bodyY + 75, 60, 80);

    }


    private static void drawCatHead(Graphics2D gr, Color color) {

        gr.setColor(color);
        int headX = 300;
        int headY = 200;
        gr.fillOval(headX, headY, 150, 150);

        drawCatEyes(gr, headX, headY);
        drawCatNose(gr, headX, headY);
        drawCatHears(gr, headX, headY);
        drawCatMouth(gr, headX, headY);
    }

    private static void drawCatMouth(Graphics2D gr, int headX, int headY) {
        gr.setColor(Color.pink);
        gr.fillRect(headX + 65, headY + 115, 20, 5);
    }

    private static void drawCatHears(Graphics2D gr, int x, int y) {

        //leftHear
        gr.setColor(Color.gray);
        gr.fillPolygon(new int[]{x + 20, x + 25, x + 50}, new int[]{y + 25, y - 25, y + 20}, 3);
        gr.setColor(Color.white);
        gr.fillPolygon(new int[]{x + 25, x + 27, x + 40}, new int[]{y + 15, y - 15, y + 10}, 3);

        //rightHear
        gr.setColor(Color.gray);
        gr.fillPolygon(new int[]{x + 90, x + 130, x + 135}, new int[]{y + 25, y + 23, y - 25}, 3);
        gr.setColor(Color.white);
        gr.fillPolygon(new int[]{x + 110, x + 125, x + 130}, new int[]{y + 12, y + 20, y - 15}, 3);

    }


    private static void drawCatNose(Graphics2D gr, int x, int y) {
        gr.setColor(Color.pink);
        gr.fillPolygon(new int[]{x + 65, x + 75, x + 85}, new int[]{y + 90, y + 100, y + 90}, 3);
    }

    private static void drawCatEyes(Graphics2D gr, int x, int y) {

        gr.setColor(Color.white);
        gr.fillOval(x + 25, y + 50, 40, 30);
        gr.fillOval(x + 85, y + 50, 40, 30);

        //insideEyes
        gr.setColor(Color.black);
        gr.fillOval(x + 25, y + 50, 30, 20);
        gr.fillOval(x + 85, y + 50, 30, 20);
    }

    private static void drawClouds(Graphics2D gr, int numberOfClouds) {
        gr.setColor(Color.white);
        for (int i = 0; i < numberOfClouds; i++) {
            int centerX = rnd(0, 600);
            int centerY = rnd(0, 250);
            gr.fillOval(centerX, centerY, 100, 50);
            gr.fillOval(centerX + 40, centerY - 15, 50, 50);
            gr.fillOval(centerX + 20, centerY - 20, 50, 50);
        }
    }

    private static void drawSun(Graphics2D gr, int x, int y, int r, int R, int n, Color color) {

        gr.setColor(color);
        gr.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            gr.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }

    private static void drawGrass(Graphics2D gr) {
        gr.setColor(Color.green);
        gr.fillRect(0, 400, 800, 200);
        drawFlowers(gr, 40);
    }

    private static void drawFlowers(Graphics2D gr, int numberOfFlowers) {
        int middleRadius = 8;
        int petalRadius = 10;

        for (int i = 0; i < numberOfFlowers; i++) {
            int centerX = rnd(0, 800);
            int centerY = rnd(400 + middleRadius + petalRadius, 600);
            drawFlowerMiddle(gr, middleRadius, centerX, centerY);
            drawFlowerPetals(gr, middleRadius, petalRadius, centerX, centerY);
        }
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

    private static void drawSky(Graphics2D gr) {
        gr.setColor(Color.blue);
        gr.fillRect(0, 0, 800, 400);
        drawSun(gr, 700, 100, 50, 85, 15, Color.yellow);
        drawClouds(gr, 20);
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
