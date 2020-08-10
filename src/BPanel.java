import java.awt.*;
import javax.swing.*;

public class BPanel extends JPanel {
    private Image bgImage;
        
    public void paintComponent(Graphics g) {
        g.drawImage(bgImage, 0, 0, null);
        this.repaint();
        System.out.println(this.getWidth() + "x" + this.getHeight());
    }
    BPanel(String imageLocation) {
        bgImage = (new ImageIcon(getClass().getResource(imageLocation))).getImage();
        this.setOpaque(false);
        this.setBackground(Color.red);
    }
}
