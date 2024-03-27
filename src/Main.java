import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Окно");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel("Changing",SwingConstants.CENTER);
        label.setFont(new Font("Vladimir script",Font.BOLD,50));
        JSlider slider = new JSlider( 5, 100, 50);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(e -> {
            label.setFont(new Font("Vladimir script", Font.BOLD, slider.getValue()));
        });
        frame.add(label);
        frame.add(slider,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}