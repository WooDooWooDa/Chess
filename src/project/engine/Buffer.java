package project.engine;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Buffer {

    private Graphics2D graphics;

    public Buffer(Graphics2D graphics) {
        this.graphics = graphics;
    }

    public void drawImage(Image image, int x, int y) {
        graphics.drawImage(image, x, y, null);
    }

    public void drawRectangle(int x, int y, int width, int height, Paint color) {
        graphics.setPaint(color);
        graphics.fillRect(x, y, width, height);
    }

    public void drawRectangle(int x, int y, Rectangle rectangle, Paint color) {
        graphics.setPaint(color);
        graphics.fillRect(x, y, rectangle.width, rectangle.height);
    }

    public void drawText(String text, int x, int y, Paint color) {
        graphics.setPaint(color);
        graphics.drawString(text, x, y);
    }
}
