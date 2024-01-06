package labsheet2.q2;

import javax.swing.*;

public class InternalFramesExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame parentFrame = new JFrame("Internal Frames Example");
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(600, 400);

        JDesktopPane desktopPane = new JDesktopPane();
        parentFrame.setContentPane(desktopPane);

        JInternalFrame internalFrame1 = createInternalFrame("Internal Frame 1");
        desktopPane.add(internalFrame1);

        JInternalFrame internalFrame2 = createInternalFrame("Internal Frame 2");
        desktopPane.add(internalFrame2);

        parentFrame.setVisible(true);
    }

    private static JInternalFrame createInternalFrame(String title) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(50, 50);

        // Add a simple label to the internal frame
        JLabel label = new JLabel("This is " + title);
        internalFrame.add(label);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> internalFrame.dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(closeButton);

        internalFrame.add(buttonPanel);

        internalFrame.setVisible(true);

        return internalFrame;
    }
}

