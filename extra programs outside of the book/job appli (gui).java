/*
Exercise: Job Application GUI

Create a GUI application that includes:

- A JComboBox containing job types:
  (Financier, Electrical Engineer, IT, Sales Manager)
- Two JCheckBoxes:
  (Part Time, Full Time)
- A JButton labeled "Apply"
- A JLabel displaying a message based on the user’s selections.

When the user clicks "Apply":
→ The program displays a message such as:
   "You applied as IT with a Full Time schedule."

If both checkboxes are selected:
   "You applied as IT with a Part Time and Full Time schedule."
If neither is selected:
   "You applied as IT with no specific schedule."

Save the program as JBoxPune.java
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBoxPune extends JFrame implements ItemListener {

    // Job options for the combo box
    private final String[] jobTypes = {"Financier", "Electrical Engineer", "IT", "Sales Manager"};
    private final JComboBox<String> jobBox = new JComboBox<>(jobTypes);

    // Work type checkboxes
    private final JCheckBox partTime = new JCheckBox("Part Time");
    private final JCheckBox fullTime = new JCheckBox("Full Time");

    // Apply button and message label
    private final JButton applyButton = new JButton("Apply");
    private final JLabel messageLabel = new JLabel(" ");

    public JBoxPune() {
        super("Job Application");

        // Layout setup
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));

        // Add components
        add(jobBox);
        add(partTime);
        add(fullTime);
        add(applyButton);
        add(messageLabel);

        // Frame configuration
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Event listeners
        partTime.addItemListener(this);
        fullTime.addItemListener(this);

        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleApplication();
            }
        });
    }

    // Handles button click logic
    private void handleApplication() {
        String selectedJob = (String) jobBox.getSelectedItem();
        String scheduleType;

        if (partTime.isSelected() && fullTime.isSelected()) {
            scheduleType = "Part Time and Full Time";
        } else if (partTime.isSelected()) {
            scheduleType = "Part Time";
        } else if (fullTime.isSelected()) {
            scheduleType = "Full Time";
        } else {
            scheduleType = "no specific schedule";
        }

        String message = "You applied as " + selectedJob + " with " + scheduleType + ".";
        messageLabel.setText(message);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // No special item handling needed
    }

    public static void main(String[] args) {
        JBoxPune frame = new JBoxPune();
        frame.setVisible(true);
    }
}
