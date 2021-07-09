/* Code by Aadi Jain */

package Grosmo_Main.GuiInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class home extends JFrame implements ActionListener {
    private JButton b, b1, b2, b3;
    private JFrame f;

    home(){
        f = new JFrame("Grosmo - Home Page");
        f.setBackground(Color.white);
        f.setLayout(null);

        f.setBounds(200, 100, 970, 600);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setResizable(false);


        ImageIcon reg = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/register.png")
                .getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));

        b = new JButton("Register");
        b.setBounds(50,30,400,250);
        b.setIcon(reg);
        b.addActionListener(this);
        b.setFocusable(false);
        b.setFocusPainted(false);
        b.setOpaque(true);

        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setFont(new Font("Comic Sans", Font.BOLD, 15));
        f.add(b);


        ImageIcon det = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/details.png")
                .getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));

        b1 = new JButton("Patient Details");
        b1.setBounds(510,30,400,250);
        b1.setIcon(det);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setFocusPainted(false);
        b1.setOpaque(true);

        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setFont(new Font("Comic Sans", Font.BOLD, 15));
        f.add(b1);

        ImageIcon patient = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/patient.png")
                .getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));

        b2 = new JButton("Patient Health Assitance");
        b2.setBounds(50,300,400,250);
        b2.setIcon(patient);
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setFocusPainted(false);
        b2.setOpaque(true);

        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setFont(new Font("Comic Sans", Font.BOLD, 15));
        f.add(b2);

        ImageIcon khalsa = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/khalsa.jpg")
                .getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));

        b3 = new JButton("Donate to Khalsa Aid India");
        b3.setBounds(510,300,400,250);
        b3.setIcon(khalsa);
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setFocusPainted(false);
        b3.setOpaque(true);

        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setHorizontalTextPosition(JButton.CENTER);
        b3.setVerticalTextPosition(JButton.BOTTOM);
        b3.setFont(new Font("Comic Sans", Font.BOLD, 15));
        f.add(b3);


        f.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Desktop browser = Desktop.getDesktop();
        if(e.getSource() == b){
            f.dispose();
            new RegistrationForm();
        }
        else if(e.getSource() == b1){
            f.dispose();
            new details();
        }
        else if(e.getSource() == b2){
            f.dispose();
            new Assistance();
        }
        else if(e.getSource() == b3){
            try {
                browser.browse(new URI("https://www.khalsaaid.org/donate-india"));
            } catch (Exception e1) {

            }
        }
    }

    public static void main(String[] args) {

    }
}

/* Code by Aadi Jain */