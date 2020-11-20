package imjustisabella.github.com.Frames;

import com.sun.awt.AWTUtilities;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePositioning implements MouseListener {

    private static Window frame = null;
    public MousePositioning() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new Window(null);

        JLabel label = new JLabel("Click anywhere to set your position");

        Border border = BorderFactory.createLineBorder(Color.WHITE);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(250, 200));
        label.setSize(new Dimension(250, 200));
        label.setText("Click anywhere to set your position");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

        frame.add(label);
        frame.addMouseListener(this);
        frame.setSize(screenSize.width, screenSize.height);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setBackground(Color.PINK);

        AWTUtilities.setWindowOpacity(frame, 0.3f);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(frame != null) {
            System.out.println("X: " + e.getX() + " | Y: " + e.getY());
            frame.dispose();
            frame = null;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}