package com.balitechy.spacewar.main;

public class GameVectorFactory implements GameStyle {
    public Game game;

    @Override
    public IPlayerRender createPlayer(double x, double y, Game game) {
        return new PlayerVectorial(x, y, game);
    }

    @Override
    public IBackgroundRender createBackground() {
        return new BackgroundVectorial();
    }

    @Override
    public IBulletRender createBullet(double x, double y, Game game) {
        return new BulletVectorial(x, y, game);
    }
}
