package com.balitechy.spacewar.main;

public interface GameStyle {
    IPlayerRender createPlayer(double x, double y, Game game);
    IBackgroundRender createBackground();
    IBulletRender createBullet(double x, double y, Game game);
}

