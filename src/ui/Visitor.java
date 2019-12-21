package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visitor {
    private JPanel panel1;
    private JButton главнаяСтраницаПосетителяButton;
    private JButton купитьПродуктButton;
    private JButton купитьБилетButton;
    private JButton выбратьАттракционButton;

    public Visitor(){
        главнаяСтраницаПосетителяButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product product = new Product();
                product.createUI();
            }
        });
    }


    public void createUI() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void main_page(){}
    public void attraction_page(){}
    public void success_attraction(){}
    public void unsuccess_attraction(){}
    public void page_ticket(){}
    public void page_product(){}
    public void page_pay(){}
    public void page_success_pay(){}
    public void page_unsuccess_pay(){}
}

