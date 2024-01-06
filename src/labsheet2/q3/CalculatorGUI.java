package labsheet2.q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JTextField numField1, numField2;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorGUI().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        numField1 = new JTextField(10);
        numField2 = new JTextField(10);

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResult(true);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResult(false);
            }
        });

        frame.add(new JLabel("Number 1: "));
        frame.add(numField1);
        frame.add(new JLabel("Number 2: "));
        frame.add(numField2);
        frame.add(addButton);
        frame.add(subtractButton);

        frame.setVisible(true);
    }

    private void calculateAndShowResult(boolean isAddition) {
        try {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());

            double result = isAddition ? num1 + num2 : num1 - num2;

            JOptionPane.showMessageDialog(null, "Result: " + result, "Calculation Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

