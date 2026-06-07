/*
 3. Create an application with a JFrame and at least five labels that contain interesting historical facts. 
 Every time the user clicks a JButton, remove one of the labels and add a different one. Save the file as JHistoricalFacts.java
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Historical Facts");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        // Array of historical facts
        String[] facts = {
            "Jack the Ripper was still making headlines when Nintendo was founded.",
            "Cleopatra lived closer in time to the first Moon landing than to the building of the Great Pyramid of Giza.",
            "The Great Wall of China was completed two years after the world's first telephone call.",
            "Oxford University is older than the Aztec Empire.",
            "Machu Picchu and the Sistine Chapel frescoes were completed less than a century apart.",
            "Coca-Cola is older than the Eiffel Tower.",
            "Star Wars was released in the same year France carried out its last execution by guillotine.",
            "The first email was sent in 1971."
        };

        // Create label and button
        JLabel factLabel = new JLabel(facts[0], SwingConstants.CENTER);
        factLabel.setFont(new Font("Serif", Font.PLAIN, 15));
        JButton nextButton = new JButton("Next Fact");

        // Add components to the frame
        frame.add(factLabel, BorderLayout.CENTER);
        frame.add(nextButton, BorderLayout.SOUTH);

        // Add functionality to the button
        nextButton.addActionListener(new ActionListener() {
            private int index = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < facts.length) {
                    factLabel.setText(facts[index]);
                    index++;
                } else {
                    factLabel.setText("No more facts!");
                    nextButton.setEnabled(false);
                }
            }
        });

        // Display the window
        frame.setVisible(true);
    }
}
