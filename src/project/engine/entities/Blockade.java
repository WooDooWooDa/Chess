package project.engine.entities;

import project.engine.Buffer;
import project.engine.GameSettings;

import java.awt.*;

public class Blockade extends StaticEntity {

    public Blockade() {
        CollidableRepository.getInstance().registerEntity(this);
    }

    @Override
    public void draw(Buffer buffer) {
        if (GameSettings.SHOW_COLLISION) {
            buffer.drawRectangle(x, y, width, height, new Color(255,0,0,75));
        }
    }
}
