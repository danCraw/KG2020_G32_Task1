package com.company;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {

    private Sun sun = new Sun(700, 100, 50, 85, 15, Color.yellow);
    private Grass grass = new Grass();
    private Cat cat = new Cat(300, 200, Color.gray);

    private World world = new World();


    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sun.draw(gr);
        world.drawAmountClouds(gr, 20);
        grass.draw(gr);
        world.drawAmountFlowers(gr, 40);
        cat.draw(gr);
        world.drawAmountButterflys(gr, 3);
    }

}
