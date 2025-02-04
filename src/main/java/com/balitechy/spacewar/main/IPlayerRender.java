package com.balitechy.spacewar.main;

import java.awt.Graphics;

public interface IPlayerRender {
    void renderPlayer(Graphics g);
    void setVelX(double velX);
    void setVelY(double velY);
    void shoot();
    void tick();
}