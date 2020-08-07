import java.awt.event.*;

public class PlayPauseListener implements ActionListener{
    DrawingPanel dPanel;
    
    public void actionPerformed(ActionEvent e) {
        //switch drawing state
        if (dPanel.getIsDrawing()) {
            dPanel.setIsDrawing(false);
        }
        else {
            dPanel.setIsDrawing(true);
        }
    }
    
    PlayPauseListener(DrawingPanel dPanel) {
        this.dPanel = dPanel;
    }
}
