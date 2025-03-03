package com.balitechy.spacewar.main;


import java.awt.Graphics;

public abstract class AbstractBullet implements IBulletRender {
    protected double x;
    protected double y;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;

    public AbstractBullet(double x, double y, Game game) {
        this.x = x;
        this.y = y;
    }

    protected AbstractBullet() {
    }

    public void tick() {
        y -= 5;
    }

    public double getY() {
        return y;
    }

    public abstract void renderBullet(Graphics g);
}
