import java.awt.event.*;
import javax.swing.*;

public class ResetListener implements ActionListener {
    JFrame frame;
    
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
    ResetListener(JFrame frame) {
        this.frame = frame;
    }
}
