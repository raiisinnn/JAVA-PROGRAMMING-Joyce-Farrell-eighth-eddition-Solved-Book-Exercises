import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 {
    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("8 Clicks to Disable");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Create button and label
        JButton button = new JButton("Click Me");
        JLabel messageLabel = new JLabel("Click the button 8 times to disable it.");

        // Add components to frame
        frame.add(button);
        frame.add(messageLabel);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            private int clickCount = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                int remaining = 8 - clickCount;

                if (clickCount < 8) {
                    messageLabel.setText("You have " + remaining + " clicks left.");
                } else {
                    button.setEnabled(false);
                    messageLabel.setText("Button disabled after 8 clicks!");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
