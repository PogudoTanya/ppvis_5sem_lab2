package ui;

import javax.swing.*;

public class Product {
    private JTable table1;
    private JPanel panel1;

    public void createUI()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
