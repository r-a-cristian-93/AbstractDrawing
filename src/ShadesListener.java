import java.awt.event.*;

class ShadesListener implements ActionListener {

    DrawingPanel panel;
    String shades;

    public void actionPerformed(ActionEvent e) {
        panel.setShades(shades);
    }

    ShadesListener(DrawingPanel panel, String shades) {
        this.panel = panel;
        this.shades = shades;
    }
}
