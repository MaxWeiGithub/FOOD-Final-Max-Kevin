import java.awt.KeyEvent;

public class PlayerAction extends EventObject{
    private boolean pressed;

    public PlayerAction(boolean pressed) {
        this.pressed = pressed;
    }

    public boolean isPressed() {
        return pressed;
    }
}