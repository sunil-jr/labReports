package labsheet2.q4;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class RandomGeneratorGUI {
    private JTextField outputField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RandomGeneratorGUI().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Random Number Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        outputField = new JTextField(20);
        outputField.setEditable(false);

        outputField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                generateRandomInteger();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                generateRandomDouble();
            }
        });

        frame.add(new JLabel("Click and hold the mouse to generate random integer"));
        frame.add(new JLabel("Release the mouse to generate random double"));
        frame.add(outputField);

        frame.setVisible(true);
    }

    private void generateRandomInteger() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        outputField.setText("Random Integer: " + randomInt);
    }

    private void generateRandomDouble() {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        outputField.setText("Random Double: " + randomDouble);
    }
}
