package GUI.Example3EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandlingDemo2 implements ActionListener, MouseListener
{
    JFrame jFrame;
    JButton jButton1, jButton2;
    JTextField jt;

    void createFrame()
    {
        jFrame = new JFrame();
        jFrame.setSize(600,500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        jt = new JTextField();
        jt.setBounds(100,50,300,40);
        jFrame.add(jt);

        jButton1 = new JButton("ClickMe");
        jButton1.addActionListener(this);
        jButton1.addMouseListener(this);
        jButton1.setBounds(100,150,120,50);
        jFrame.add(jButton1);

        jButton2 = new JButton("Reset");
        jButton2.addActionListener(this);
        jButton2.setBounds(250,150,120,50);
        jFrame.add(jButton2);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Inside actionPerformed method");
        if(e.getSource()==jButton1)
        {
            String name = jt.getText();
            System.out.println("User clicked on "+jButton1.getLabel());
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(jFrame,"Name cannot be empty");
            }
            else {
                JOptionPane.showMessageDialog(jFrame,"Hello "+jt.getText());
            }
        }
        if(e.getSource()==jButton2)
        {
            jt.setText(null);
            JOptionPane.showMessageDialog(jFrame,"Reset Done");
            System.out.println("User clicked on "+jt.getText());
            /*
            Provide a built-in mechanism to control
            the duration for which a message dialog is
            displayed before it automatically closes.
             */
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==jButton1)
        {
            jButton1.setOpaque(true);
            jButton1.setBackground(Color.RED);
            jButton1.setForeground(Color.BLUE);
            jButton1.setBorderPainted(false);
            jButton1.repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==jButton1)
        {
//            jButton1.setOpaque(false);
            jButton1.setBackground(null);
            jButton1.setForeground(null);
            jButton1.setBorderPainted(true);
//            jButton1.repaint();
        }
    }

    public static void main(String[] args)
    {
        EventHandlingDemo2 obj = new EventHandlingDemo2();
        obj.createFrame();
    }

}

