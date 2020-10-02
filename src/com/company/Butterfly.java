package com.company;

import java.awt.*;

public class Butterfly implements Drawable {

    private int x;
    private int y;

    Butterfly(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
    drawButterfly(g);
    }

    private void drawButterfly(Graphics2D gr) {
            drawButterflyBody(gr, x, y, Color.green);
            drawButterflyWings(gr, x, y, butterflyWingColor());
    }

    private void drawButterflyBody(Graphics2D gr, int x, int y, Color c) {
        gr.setColor(c);
        gr.fillOval(x, y - 15, 15, 15);
        gr.fillRect(x, y, 15, 45);
    }

    private void drawButterflyWings(Graphics2D gr, int butterflyX, int butterflyY, Color color) {
        gr.setColor(color);
        gr.fillOval(butterflyX - 25, butterflyY - 25, 25, 50);
        gr.fillOval(butterflyX - 15, butterflyY + 20, 15, 30);
        gr.fillOval(butterflyX + 15, butterflyY - 25, 25, 50);
        gr.fillOval(butterflyX + 15, butterflyY + 20, 15, 30);

    }

    private Color butterflyWingColor() {
        Color[] wingsColor = new Color[]{Color.red, Color.pink, Color.yellow, Color.orange};
        return wingsColor[Random.interval(0, wingsColor.length - 1)];
    }


}
