package GUI.Example1Swing;

import javax.swing.*;

public class SwingDemo
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600,400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JLabel jLabel = new JLabel("Enter Name :: ");
        jLabel.setBounds(100,50,100,30);
        jFrame.add(jLabel);

        JTextField jTextField = new JFormattedTextField();
        jTextField.setBounds(200,50,250,40);
        jFrame.add(jTextField);

        JButton jButton = new JButton("Click me");
        jButton.setBounds(200,150,120,40);
        jFrame.add(jButton);

        jFrame.setVisible(true);

    }
}
