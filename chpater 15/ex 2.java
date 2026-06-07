/*
Create an educational program for children that distinguishes between vowels and consonants as the user clicks buttons.
Create 26 JButtons, each labeled with a different letter of the alphabet. Create a JFrame to hold three JPanels in a twoby-two grid.
Randomly select eight of the 26 JButtons and place four in each of the first two JPanels. Add a JLabel to the third JPanel. 
When the user clicks a JButton, the text of the JLabel identifies the button’s letter as a vowel or consonant, and then a new randomly selected letter replaces the letter on the JButton. 
Save the file as JVowelConsonant.java.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class JVowelConsonant extends JFrame implements ActionListener {

    // Arrays for alphabet and vowels
    private final String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    private final String[] vowels = {"A", "E", "I", "O", "U"};

    // Arrays for all buttons and the currently visible ones
    private final JButton[] allButtons = new JButton[26];
    private final JButton[] visibleButtons = new JButton[8];

    // Label and random generator
    private final JLabel message = new JLabel("Click a letter", SwingConstants.CENTER);
    private final Random random = new Random();

    // Constructor
    public JVowelConsonant() {
        super("Vowels and Consonants");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        // Panels for layout
        JPanel panel1 = new JPanel(new GridLayout(2, 2, 10, 10));
        JPanel panel2 = new JPanel(new GridLayout(2, 2, 10, 10));
        JPanel panel3 = new JPanel(new BorderLayout());

        // Setup message label
        message.setFont(new Font("SansSerif", Font.BOLD, 16));
        panel3.add(message, BorderLayout.CENTER);

        // Create all 26 letter buttons
        for (int i = 0; i < 26; i++) {
            JButton btn = new JButton(alphabet[i]);
            btn.setFont(new Font("SansSerif", Font.BOLD, 20));
            btn.addActionListener(this);
            allButtons[i] = btn;
        }

        // Randomly select 8 visible buttons
        for (int i = 0; i < 4; i++) {
            JButton b1 = getRandomUnusedButton();
            panel1.add(b1);
            visibleButtons[i] = b1;

            JButton b2 = getRandomUnusedButton();
            panel2.add(b2);
            visibleButtons[i + 4] = b2;
        }

        // Add panels to frame
        add(panel1);
        add(panel2);
        add(panel3);

        // Frame settings
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Picks a random unused button
    private JButton getRandomUnusedButton() {
        JButton btn;
        boolean used;

        do {
            btn = allButtons[random.nextInt(26)];
            used = false;

            for (JButton b : visibleButtons) {
                if (b == btn) {
                    used = true;
                    break;
                }
            }
        } while (used);

        return btn;
    }

    // Handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        String letter = clicked.getText();

        // Check if vowel or consonant
        if (isVowel(letter)) {
            message.setText(letter + " is a vowel.");
        } else {
            message.setText(letter + " is a consonant.");
        }

        // Generate a new random letter not currently visible
        String newLetter;
        do {
            newLetter = alphabet[random.nextInt(26)];
        } while (isLetterVisible(newLetter));

        clicked.setText(newLetter);
    }

    // Helper: check if letter is a vowel
    private boolean isVowel(String letter) {
        for (String v : vowels) {
            if (v.equals(letter)) {
                return true;
            }
        }
        return false;
    }

    // Helper: check if a letter is already visible
    private boolean isLetterVisible(String letter) {
        for (JButton b : visibleButtons) {
            if (b != null && b.getText().equals(letter)) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        new JVowelConsonant();
    }
}
