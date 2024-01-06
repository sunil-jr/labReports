package labsheet2.q1;

import javax.swing.*;
import java.awt.*;

public class SwingFormExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addLayout(frame, null);
        addLayout(frame, new FlowLayout());
        addLayout(frame, new BorderLayout());
        addLayout(frame, new GridLayout(0, 2));

        JPanel gridBagLayoutPanel = new JPanel(new GridBagLayout());
        addComponentsWithGridBag(gridBagLayoutPanel);
        frame.add(gridBagLayoutPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void addLayout(JFrame frame, LayoutManager layoutManager) {
        JPanel panel = new JPanel(layoutManager);
        addComponent(panel, new JLabel("Label 1:"));
        addComponent(panel, new JTextField(15));
        addComponent(panel, new JLabel("Label 2:"));
        addComponent(panel, new JPasswordField(15));
        addComponent(panel, new JCheckBox("Checkbox"));
        addComponent(panel, new JButton("Submit"));
        frame.add(panel);
    }

    private static void addComponentsWithGridBag(JPanel panel) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        addComponentToGridBag(gbc, panel, new JLabel("Username:"), 0, 0, 0);
        addComponentToGridBag(gbc, panel, new JTextField(15), 1, 0, 0);
        addComponentToGridBag(gbc, panel, new JLabel("Password:"), 0, 1, 0);
        addComponentToGridBag(gbc, panel, new JPasswordField(15), 1, 1, 0);
        addComponentToGridBag(gbc, panel, new JCheckBox("Yes, I agree to the terms of Service"), 0, 2, 2);
        addComponentToGridBag(gbc, panel, new JButton("Login"), 0, 3, 2);
    }

    private static void addComponent(JPanel panel, JComponent component) {
        panel.add(component);
    }
    private static void addComponentToGridBag(GridBagConstraints gbc, JPanel panel, JComponent component, int gridx, int gridy, int gridwidth) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        if (gridwidth != 0)
            gbc.gridwidth = gridwidth;
        panel.add(component, gbc);
    }
}