/* Code by Aadi Jain */

package Grosmo_Main.GuiInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FrontPage extends JFrame implements ActionListener{
    JFrame f;
    JLabel id,l1;
    JButton b;

    FrontPage(){

        f=new JFrame("WELCOME TO GROSMO - Team Volte");

        f.setLayout(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Grosmo_Main/GuiInterface/Images/Grosmo.png"));
        Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);

        JButton b = new JButton("Login to Grosmo");
        b.addActionListener(this);
        b.setFocusable(false);
        b.setFocusPainted(false);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setOpaque(false);
        b.setFont(new Font("Arial", Font.BOLD, 15));
        b.setBounds(800,5,200,25);
        f.add(b);

        l1.setBounds(0,0,1000,700);
        f.add(l1);

        id=new JLabel();
        id.setBounds(0,0,1200,600);
        id.setLayout(null);

        f.setVisible(true);
        f.setSize(1000,700);
        f.setLocation(150,10);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
        new login();
    }
    public static void main(String[] arg){
        FrontPage f = new FrontPage();
    }

}

/* Code by Aadi Jain */
