/*
Exercise: ColorFrame (Button and Background Color Changer)

Create a JFrame with three buttons:

Button 1 → When clicked, changes the background and text color of Button 2.  
Button 2 → When clicked, changes the background and text color of Button 1.  
Button 3 → When clicked, changes the entire window background to a random color.

Each click on Button 3 generates a different random color.

Save the program as ColorFrame.java
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ColorFrame extends JFrame implements ActionListener {

    // Layout and components
    private final FlowLayout layout = new FlowLayout();
    private final JButton button1 = new JButton("Change Button 2");
    private final JButton button2 = new JButton("Change Button 1");
    private final JButton button3 = new JButton("Change Background");
    private final Random random = new Random();

    // Constructor
    public ColorFrame() {
        super("Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);

        // Add buttons to the frame
        add(button1);
        add(button2);
        add(button3);

        // Register button listeners
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Frame setup
        setSize(350, 200);
        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    // Handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            button2.setBackground(Color.BLUE);
            button2.setForeground(Color.WHITE);
        } else if (e.getSource() == button2) {
            button1.setBackground(Color.RED);
            button1.setForeground(Color.WHITE);
        } else if (e.getSource() == button3) {
            // Random background color for the entire frame
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            getContentPane().setBackground(randomColor);
        }
    }

    // Main method
    public static void main(String[] args) {
        new ColorFrame();
    }
}
