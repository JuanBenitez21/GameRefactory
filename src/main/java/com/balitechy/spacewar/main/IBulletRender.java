package com.balitechy.spacewar.main;

import java.awt.Graphics;

public interface IBulletRender {
    void renderBullet(Graphics g);
    void tick();
    double getY();
}
