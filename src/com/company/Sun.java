package com.company;

import java.awt.*;

public class Sun implements Drawable {
    private int x, y, r, R, n;

    @Override
    public void draw(Graphics2D g) {
        drawSky(g);
        drawSun(g, x, y, r, R, n, Color.yellow);

    }

    private static void drawSky(Graphics2D gr) {
        gr.setColor(Color.blue);
        gr.fillRect(0, 0, 800, 400);
    }


    public static void drawSun(Graphics2D gr, int x, int y, int r, int R, int n, Color color) {
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

    Sun(int x, int y, int r, int r1, int n, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
    }
}
