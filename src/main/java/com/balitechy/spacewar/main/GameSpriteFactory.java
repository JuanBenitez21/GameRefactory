package com.balitechy.spacewar.main;

public class GameSpriteFactory implements GameStyle {
    public Game game;

    @Override
    public IPlayerRender createPlayer(double x, double y, Game game) {
        return new PlayerSprite(x, y, game);
    }

    @Override
    public IBackgroundRender createBackground() {
        return new BackgroundSprite();
    }

    @Override
    public IBulletRender createBullet(double x, double y, Game game) {
        return new BulletSprite(x, y, game);
    }
}
