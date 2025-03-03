package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerVectorial extends AbstractPlayer {
    public PlayerVectorial (double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void renderPlayer(Graphics g) {
        g.setColor(Color.black);

        int[] xPoints = {
                (int) x,
                (int) x + WIDTH,
                (int) x + WIDTH / 2
        };
        int[] yPoints = {
                (int) y + HEIGHT,
                (int) y + HEIGHT,
                (int) y
        };

        g.drawPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void shoot() {
        AbstractBullet bullet = new BulletVectorial(x + (WIDTH / 2) - 5, y - 18, game);
        game.getBullets().addBullet(bullet);
    }
}
