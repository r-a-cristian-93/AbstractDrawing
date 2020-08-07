//import java.awt.BorderLayout;

import java.awt.*;
import javax.swing.*;

public class AbstractDrawing {

    public static void main(String[] args) {
        AbstractDrawing abstractDrawing = new AbstractDrawing();
    }

    AbstractDrawing() {
        
        GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        //south panel
        JButton bPlayPause = new JButton("PLAY/PAUSE");
        JButton bReset = new JButton("RESET");
        JButton bWindow = new JButton("FULLSCREEN");
        JButton bExit = new JButton("EXIT");

        JPanel sPanel = new JPanel();
        sPanel.setLayout(new FlowLayout());
        sPanel.add(bPlayPause);
        sPanel.add(bReset);
        sPanel.add(bWindow);
        sPanel.add(bExit);
        //end south panel

        //west panel
        JLabel lShapes = new JLabel("Shapes", JLabel.CENTER);
        JButton bSquare = new JButton("Square");
        JButton bRectangle = new JButton("Rectangel");
        JButton bCircle = new JButton("Circle");
        JButton bOval = new JButton("Oval");
        JLabel lColors = new JLabel("Colors", JLabel.CENTER);
        JButton bBlues = new JButton("Blues");
        JButton bGreens = new JButton("Greens");
        JButton bYellows = new JButton("Yellows");
        JButton bReds = new JButton("Reds");
        JButton bMagentas = new JButton("Magentas");

        JPanel wPanel = new JPanel();
        wPanel.setLayout(new GridLayout(0, 1));
        ((GridLayout) wPanel.getLayout()).setVgap(5);
        wPanel.setOpaque(false);
        wPanel.add(lShapes);
        wPanel.add(bSquare);
        wPanel.add(bRectangle);
        wPanel.add(bCircle);
        wPanel.add(bOval);
        wPanel.add(lColors);
        wPanel.add(bBlues);
        wPanel.add(bGreens);
        wPanel.add(bYellows);
        wPanel.add(bReds);
        wPanel.add(bMagentas);
        //end west panel
        
        //drawing panel
        DrawingPanel dPanel = new DrawingPanel();
        ((FlowLayout) dPanel.getLayout()).setAlignment(FlowLayout.LEFT);
        dPanel.add(wPanel);
        //end drawing panel

        JFrame frame = new JFrame();
        frame.setTitle("Abstract Drawing");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, sPanel);
        frame.getContentPane().add(BorderLayout.CENTER, dPanel);
                
        //action listeners
        bBlues.addActionListener(new ShadesListener(dPanel, "blues"));
        bGreens.addActionListener(new ShadesListener(dPanel, "greens"));
        bYellows.addActionListener(new ShadesListener(dPanel, "yellows"));
        bReds.addActionListener(new ShadesListener(dPanel, "reds"));
        bMagentas.addActionListener(new ShadesListener(dPanel, "magentas"));
        bWindow.addActionListener(new WindowListener(device, frame, bWindow));
        bExit.addActionListener(new ExitListener());
        bReset.addActionListener(new ResetListener(frame));
        bPlayPause.addActionListener(new PlayPauseListener(dPanel));
    }
}

/*TO DO
- find a way to keep the drawing when RESIZING the window and when swithching between WINDOWED mode and FULLSCCREEN mode
- implement the shapes / remove shapes buttons
*/