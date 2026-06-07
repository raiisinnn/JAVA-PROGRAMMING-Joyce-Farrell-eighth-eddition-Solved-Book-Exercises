/*
Exercise: Password (GUI Application)

Create a GUI application named Password.java.

The application should:
- Ask the user to guess a password.
- Allow up to three attempts.
- After three failed attempts, the "Check Password" button becomes inactive.
- Use a JPasswordField to hide the password input.

Example behavior:
1st wrong attempt  → shows "Incorrect password"
2nd wrong attempt  → shows "Incorrect password"
3rd wrong attempt  → shows "Access denied" and disables the button.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame {

    private JPasswordField passwordField;
    private JButton checkButton;
    private JLabel messageLabel;
    private int attemptCount = 0;
    private final String correctPassword = "Dario Dario Pis Pis Pis";

    public Password() {
        // Frame setup
        setTitle("Password");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        // Instruction label
        JLabel instructionLabel = new JLabel("Enter the password:", SwingConstants.CENTER);
        add(instructionLabel);

        // Password input field
        passwordField = new JPasswordField(10);
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        add(passwordField);

        // Button
        checkButton = new JButton("Check Password");
        add(checkButton);

        // Message label
        messageLabel = new JLabel("", SwingConstants.CENTER);
        add(messageLabel);

        // Button click event
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPassword();
            }
        });

        // Center the window
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void checkPassword() {
        String enteredPassword = new String(passwordField.getPassword());

        if (enteredPassword.equals(correctPassword)) {
            messageLabel.setText("Correct password! Access granted.");
            checkButton.setEnabled(false);
        } else {
            attemptCount++;
            if (attemptCount >= 3) {
                messageLabel.setText("Access denied! Button disabled.");
                checkButton.setEnabled(false);
            } else {
                messageLabel.setText("Incorrect password. Attempts left: " + (3 - attemptCount));
            }
        }
        passwordField.setText(""); // Clear field after each attempt
    }

    public static void main(String[] args) {
        new Password();
    }
}
