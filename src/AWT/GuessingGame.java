package AWT;
import java.awt.*;
import java.awt.event.*;

public class GuessingGame extends Frame implements ActionListener{
    private int randomNumber;
    private int attemptsRemaining;
    private TextField textField;
    private Button guessButton;
    private Label feedbackLabel;

    public GuessingGame() {
        setTitle("Guessing Game");
        setSize(300, 150);
        setLayout(new FlowLayout());

        randomNumber = (int) (Math.random() * 10) + 1;
        attemptsRemaining = 3;

        Label instructionLabel = new Label("Guess a number between 1 and 10:");
        textField = new TextField(10);
        guessButton = new Button("Take a Wild Guess!");
        guessButton.addActionListener(this);
        feedbackLabel = new Label("");

        add(instructionLabel);
        add(textField);
        add(guessButton);
        add(feedbackLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == guessButton) {
            try {
                int guess = Integer.parseInt(textField.getText());
                if (guess == randomNumber) {
                    feedbackLabel.setText("Congratulations! You guessed it right!");
                    guessButton.setEnabled(false);
                } else if (guess < randomNumber) {
                    feedbackLabel.setText("Too low! Try again.");
                } else {
                    feedbackLabel.setText("Too high! Try again.");
                }
                attemptsRemaining--;
                if (attemptsRemaining == 0 && guess != randomNumber) {
                    feedbackLabel.setText("Out of attempts! The correct number was " + randomNumber);
                    guessButton.setEnabled(false);
                }
            } catch (NumberFormatException e) {
                feedbackLabel.setText("Invalid input. Please enter a number.");
            } finally {
                textField.setText("");
            }
        }
    }
    public static void main(String[] args) {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.setVisible(true);
    }
}
