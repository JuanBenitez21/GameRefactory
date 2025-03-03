package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class BulletVectorial extends AbstractBullet {
    private int bulletWidth = 3;
    private int bulletHeight = 10;

    public BulletVectorial(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void renderBullet(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect((int) x, (int) y, bulletWidth, bulletHeight);
    }
}