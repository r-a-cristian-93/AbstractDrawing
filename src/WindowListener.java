
import java.awt.GraphicsDevice;
import java.awt.event.*;
import javax.swing.*;

public class WindowListener implements ActionListener {

    GraphicsDevice device;
    JFrame frame;
    JButton bWindow;
    boolean fullscreen;

    public void actionPerformed(ActionEvent e) {
        if (fullscreen) {
            //minimize
            fullscreen = false;
            bWindow.setText("FULLSCREEN");
            frame.dispose();                //allows to use setUndecorated()
            frame.setUndecorated(false);
            frame.setResizable(true);
            frame.setVisible(true);         //need to setVisible() after dispose()
            device.setFullScreenWindow(null);
        } else {
            //maximize
            fullscreen = true;
            bWindow.setText("WINDOWED");
            frame.dispose();
            frame.setUndecorated(true);
            frame.setVisible(true);     
            device.setFullScreenWindow(frame);
        }
    }

    WindowListener(GraphicsDevice device, JFrame frame, JButton bWindow) {
        this.device = device;
        this.frame = frame;
        this.bWindow = bWindow;
        fullscreen = false;
    }
}
