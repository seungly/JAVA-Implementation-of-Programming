package GUIexample;

import javax.swing.*;

/**
 * HelloworldGUI
 */
public class HelloworldGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldSwing");
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("click");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
}