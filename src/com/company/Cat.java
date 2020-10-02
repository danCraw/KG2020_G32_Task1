package com.company;

import java.awt.*;

public class Cat implements Drawable {

   private static Color catColor;

   private static int x, y;

    @Override
    public void draw(Graphics2D g) {
    drawCat(g, catColor);
    }

    public Cat(int x, int y, Color catColor) {
        Cat.catColor = catColor;
        Cat.x = x;
        Cat.y = y;
    }

    private void drawCat(Graphics2D gr, Color color) {
        drawCatHead(gr, color, x, y);
        drawCatBody(gr, color, x, y);
    }

    private static void drawCatBody(Graphics2D gr, Color color, int x, int y) {
        gr.setColor(color);
        gr.fillRect(x + 25, y + 150, 100, 150);
        drawCatPaws(gr, x + 25, y + 150, color);
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


    private void drawCatHead(Graphics2D gr, Color color, int x, int y) {

        gr.setColor(color);
        gr.fillOval(x, y, 150, 150);

        drawCatEyes(gr, x, y);
        drawCatNose(gr, x, y);
        drawCatHears(gr, x, y, color);
        drawCatMouth(gr, x, y);
    }

    private static void drawCatMouth(Graphics2D gr, int headX, int headY) {
        gr.setColor(Color.pink);
        gr.fillRect(headX + 65, headY + 115, 20, 5);
    }

    private static void drawCatHears(Graphics2D gr, int x, int y, Color color) {

        //leftHear
        gr.setColor(color);
        gr.fillPolygon(new int[]{x + 20, x + 25, x + 50}, new int[]{y + 25, y - 25, y + 20}, 3);
        gr.setColor(Color.white);
        gr.fillPolygon(new int[]{x + 25, x + 27, x + 40}, new int[]{y + 15, y - 15, y + 10}, 3);

        //rightHear
        gr.setColor(color);
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

}
