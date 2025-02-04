package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class BulletSprite extends AbstractBullet {
    private BufferedImage image;

    public BulletSprite (double x, double y, Game game) {
        super(x, y, game);
        image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
    }

    @Override
    public void renderBullet(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}

