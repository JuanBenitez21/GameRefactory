package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;

public abstract class AbstractBackground implements IBackgroundRender {
    public abstract void renderBackground(Graphics g, Canvas c);
}