/*

Program: CornerTheKing.java

Game Description:
"Corner the King" is played on an 8x8 checkerboard.

Rules:
- A player and computer both start at the bottom row, same random column.
- The player can move one or two squares UP or LEFT.
- The computer then moves one or two squares UP or LEFT (randomly chosen).
- The first to reach the upper-left corner (0,0) wins.

Controls:
A → Move up by 1
S → Move up by 2
D → Move left by 1
F → Move left by 2

When someone wins, a message box displays the winner’s name.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CornerTheKing extends JFrame implements ActionListener {

    private JPanel boardPanel;                // 8x8 grid board
    private JPanel[][] cells = new JPanel[8][8]; 
    private int playerRow = 7;                // player starts in bottom row
    private int playerCol, computerCol;       // random starting column
    private int computerRow = 7;              // computer starts in bottom row
    private boolean gameOver = false;         // flag for end of game

    public CornerTheKing() {
        setTitle("Corner the King");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Randomly select a column for both player and computer
        playerCol = new Random().nextInt(8);
        computerCol = playerCol;

        // Create the 8x8 board
        boardPanel = new JPanel(new GridLayout(8, 8));
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel cell = new JPanel();

                // Alternate colors like a checkerboard
                if ((row + col) % 2 == 0)
                    cell.setBackground(Color.BLUE);
                else
                    cell.setBackground(Color.WHITE);

                cells[row][col] = cell;
                boardPanel.add(cell);
            }
        }

        add(boardPanel, BorderLayout.CENTER);

        // Draw initial pieces
        drawPieces();

        // Create control buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        String[] labels = {"A (up x1)", "S (up x2)", "D (left x1)", "F (left x2)"};

        for (String label : labels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Draws the player and computer pieces
    private void drawPieces() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                cells[row][col].removeAll();
                cells[row][col].revalidate();
                cells[row][col].repaint();
            }
        }

        JLabel player = new JLabel("X", SwingConstants.CENTER);
        JLabel computer = new JLabel("O", SwingConstants.CENTER);

        cells[playerRow][playerCol].add(player);
        cells[computerRow][computerCol].add(computer);
    }

    // Check if a move is valid (within board limits)
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    // Move the player
    private void movePlayer(int rowOffset, int colOffset) {
        if (gameOver) return;

        int newRow = playerRow + rowOffset;
        int newCol = playerCol + colOffset;

        if (isValidMove(newRow, newCol)) {
            playerRow = newRow;
            playerCol = newCol;

            if (checkWin("Player")) return;

            moveComputer();
            drawPieces();
        }
    }

    // Move the computer randomly
    private void moveComputer() {
        if (gameOver) return;

        Random rand = new Random();

        while (true) {
            int dist = rand.nextInt(2) + 1;    // 1 or 2 steps
            boolean moveUp = rand.nextBoolean(); // choose direction

            int newRow = computerRow;
            int newCol = computerCol;

            if (moveUp)
                newRow -= dist;
            else
                newCol -= dist;

            if (isValidMove(newRow, newCol)) {
                computerRow = newRow;
                computerCol = newCol;
                checkWin("Computer");
                break;
            }
        }
    }

    // Check if a player or computer has reached (0,0)
    private boolean checkWin(String who) {
        if ((who.equals("Player") && playerRow == 0 && playerCol == 0)
                || (who.equals("Computer") && computerRow == 0 && computerCol == 0)) {

            gameOver = true;
            drawPieces();
            JOptionPane.showMessageDialog(this, who + " wins!");
            return true;
        }
        return false;
    }

    // Handle button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) return;

        String command = e.getActionCommand();
        switch (command.charAt(0)) {
            case 'A' -> movePlayer(-1, 0);  // Up x1
            case 'S' -> movePlayer(-2, 0);  // Up x2
            case 'D' -> movePlayer(0, -1);  // Left x1
            case 'F' -> movePlayer(0, -2);  // Left x2
        }
    }

    // Main entry point
    public static void main(String[] args) {
        new CornerTheKing();
    }
}
