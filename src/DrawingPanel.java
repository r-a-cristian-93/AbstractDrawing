import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {

    private String shades;
    private boolean isDrawing;

    DrawingPanel() {
        shades = "greens";
        isDrawing = true;
    }

    public void setShades(String shades) {
        this.shades = shades;
    }

    public boolean getIsDrawing() {
        return isDrawing;
    }

    public void setIsDrawing(boolean isDrawing) {
        this.isDrawing = isDrawing;
    }

    public void paintComponent(Graphics g) {
        if (isDrawing) {
            int x = (int) (Math.random() * this.getWidth());
            int y = (int) (Math.random() * this.getHeight());
            int a = (int) (Math.random() * 300);
            int b = (int) (Math.random() * 300);

            if (shades.equals("blues")) {
                g.setColor(Random.getBlues());
            }
            if (shades.equals("greens")) {
                g.setColor(Random.getGreens());
            }
            if (shades.equals("yellows")) {
                g.setColor(Random.getYellows());
            }
            if (shades.equals("reds")) {
                g.setColor(Random.getReds());
            }
            if (shades.equals("magentas")) {
                g.setColor(Random.getMagentas());
            }
            g.fillRect(x, y, a, b);
        }
        try {
            Thread.sleep(50);
        } catch (Exception ex) {
        }
        this.repaint();
    }
}
