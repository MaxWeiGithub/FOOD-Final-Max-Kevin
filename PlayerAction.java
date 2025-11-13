import java.awt.*;
import java.awt.event.*;

public class PlayerAction extends EventObject{
    private boolean pressed;

    public PlayerAction(boolean pressed) {
        this.pressed = pressed;
    }

    public boolean isPressed(key letter) {
        pressed = letter.keyPressed();
        return pressed;
    }
}