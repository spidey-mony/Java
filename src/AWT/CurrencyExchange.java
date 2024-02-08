package AWT;

import java.awt.*;
import java.awt.event.*;

public class CurrencyExchange extends Frame implements ActionListener {
    private TextField usdTextField;
    private Button convertButton;
    private Label resultLabel;

    public CurrencyExchange() {
        setTitle("Currency Exchange");
        setSize(300, 150);
        setLayout(new FlowLayout());

        Label usdLabel = new Label("Enter amount in USD:");
        usdTextField = new TextField(10);
        convertButton = new Button("Convert");
        convertButton.addActionListener(this);
        resultLabel = new Label("");

        add(usdLabel);
        add(usdTextField);
        add(convertButton);
        add(resultLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == convertButton) {
            try {
                double usdAmount = Double.parseDouble(usdTextField.getText());
                double rielAmount = usdAmount * 4000;
                resultLabel.setText("Converted amount: " + String.format("%.0f", rielAmount) + " KHR");
            } catch (NumberFormatException e) {
                resultLabel.setText("Invalid input. Please enter a valid number.");
            } finally {
                usdTextField.setText("");
            }
        }
    }

    public static void main(String[] args){
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.setVisible(true);
    }
}
