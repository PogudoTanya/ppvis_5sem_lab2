package ui;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class User {
    private JPanel panel1;
    private JButton button1;
    private JButton администраторButton;
    private JButton ответственныйЗаАттракционButton;
    private JButton посетительButton1;
    private JButton продавецButton;

    public User(){
        посетительButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visitor visitor = new Visitor();
                visitor.createUI();
            }
        });
    }

    public void createUI()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}



