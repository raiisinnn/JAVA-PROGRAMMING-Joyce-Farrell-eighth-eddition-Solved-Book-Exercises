/*
Create a JFrame that holds five buttons with the names of five different fonts. 
Include a sixth button that the user can click to make a font larger or smaller. 
Display a demonstration JLabel using the font and size that the user selects. Save the file as JFontSelector.java. 
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFontSelector extends JFrame implements ActionListener {

    // Layout
    private final FlowLayout flow = new FlowLayout();

    // Buttons for font selection
    private final JButton helvetica = new JButton("Helvetica");
    private final JButton geneva = new JButton("Geneva");
    private final JButton courier = new JButton("Courier");
    private final JButton arial = new JButton("Arial");
    private final JButton calibri = new JButton("Calibri");
    private final JButton fontSizeButton = new JButton("Toggle Size");

    // Label and font settings
    private final JLabel messageLabel = new JLabel("MESSAGE FOR FONT DEMONSTRATION");
    private String currentFont = "Courier";
    private int currentSize = 18;

    // Constructor
    public JFontSelector() {
        super("Font Selector");

        setLayout(flow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add buttons and label
        add(helvetica);
        add(geneva);
        add(courier);
        add(arial);
        add(calibri);
        add(fontSizeButton);
        add(messageLabel);

        // Register action listeners
        helvetica.addActionListener(this);
        geneva.addActionListener(this);
        courier.addActionListener(this);
        arial.addActionListener(this);
        calibri.addActionListener(this);
        fontSizeButton.addActionListener(this);

        // Set initial label font
        messageLabel.setFont(new Font(currentFont, Font.BOLD, currentSize));

        // Set frame properties
        setSize(550, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Handle button events
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == fontSizeButton) {
            // Toggle between two font sizes
            currentSize = (currentSize == 18) ? 24 : 18;
        } else if (source == helvetica) {
            currentFont = "Helvetica";
        } else if (source == geneva) {
            currentFont = "Geneva";
        } else if (source == courier) {
            currentFont = "Courier";
        } else if (source == arial) {
            currentFont = "Arial";
        } else if (source == calibri) {
            currentFont = "Calibri";
        }

        // Apply the updated font to the label
        messageLabel.setFont(new Font(currentFont, Font.BOLD, currentSize));
    }

    // Main method
    public static void main(String[] args) {
        new JFontSelector();
    }
}
