/*
2. a. Write an application that instantiates a JFrame that contains a JButton. Disable the JButton after the user clicks it. Save the file as JFrameDisableButton.java
b. Modify the JFrameDisableButton program so that the JButton is not disabled until the user has clicked at least eight times. At that point, display a JLabel that indicates “That’s enough!”. Save the file as JFrameDisableButton2.java.
*/

import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton {
    public static void main(String[] args) {

        // Create the frame
        JFrame frame = new JFrame("Disable Button Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center the window

        // Create a button
        JButton button = new JButton("Click to Disable");

        // Add an action listener to disable the button when clicked
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
            }
        });

        // Add button to the frame
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}
