import javax.swing.*;
import java.awt.*;
public class CoolButton extends JButton {
    CoolButton(String iconColor) {
        this.setIcon(new ImageIcon(getClass().getResource("/img/"+iconColor+".png")));
        //this.setPressedIcon(new ImageIcon(getClass().getResource("/img/"+iconColor+"_pressed.png")));
        this.setRolloverIcon(new ImageIcon(getClass().getResource("/img/"+iconColor+"_rollover.png")));
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setMargin(new Insets(0, 0, 0, 0));
    }
}
