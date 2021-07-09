/* Code by Aadi Jain */

package Grosmo_Main.GuiInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class Assistance extends JFrame implements ActionListener {
    private JButton b1, b2, b3, b4, b;
    private JFrame f;
    private JLabel label;
    public Assistance(){
        f = new JFrame("GROSMO - Assitance");
        f.setBackground(Color.white);
        f.setLayout(null);

        ImageIcon image = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/home.png")
                .getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));

        b = new JButton("Home");
        b.setBounds(5,5,80,80);
        b.setIcon(image);
        b.addActionListener(this);
        b.setFocusable(false);
        b.setFocusPainted(false);
        b.setOpaque(false);
        b.setForeground(Color.blue);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setFont(new Font("Comic Sans", Font.BOLD, 15));
        f.add(b);

        ImageIcon doctor = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/onlinedoctor.png")
                .getImage().getScaledInstance(220, 100, Image.SCALE_DEFAULT));

        b1 = new JButton("Order Medicines");
        b1.setBounds(100,100,250,150);
        b1.setIcon(doctor);
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
                .getImage().getScaledInstance(220, 100, Image.SCALE_DEFAULT));

        b2 = new JButton("Consult a Doctor");
        b2.setBounds(400,100,250,150);
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

        //-------------------------------------------------------------------------------------//

        ImageIcon cowin = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/cowinlogo.png")
                .getImage().getScaledInstance(220, 100, Image.SCALE_DEFAULT));

        b3 = new JButton("Book Your Vaccine");
        b3.setBounds(100,350,250,150);
        b3.setIcon(cowin);
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

        ImageIcon mini = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/mini.png")
                .getImage().getScaledInstance(220, 100, Image.SCALE_DEFAULT));

        b4 = new JButton("Ministry of Health - Guidelines");
        b4.setBounds(400,350,250,150);
        b4.setIcon(mini);
        b4.addActionListener(this);
        b4.setFocusable(false);
        b4.setFocusPainted(false);
        b4.setOpaque(true);

        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.setHorizontalTextPosition(JButton.CENTER);
        b4.setVerticalTextPosition(JButton.BOTTOM);
        b4.setFont(new Font("Comic Sans", Font.BOLD, 15));
        f.add(b4);

        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(730,600);
        f.setLocation(200,100);
        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Desktop browser = Desktop.getDesktop();
        if (e.getSource() == b1) {
            try {
                browser.browse(new URI("https://pharmeasy.in"));
            } catch (Exception e1) {

            }
        } else if (e.getSource() == b2) {
            try {
                browser.browse(new URI("https://www.apollo247.com"));
            } catch (Exception e1) {

            }
        }
        else if (e.getSource() == b) {
            try {
                f.dispose();
                new home();
            } catch (Exception e1) {

            }
        }
        else if (e.getSource() == b3) {
            try {
                browser.browse(new URI("https://www.cowin.gov.in/"));
            } catch (Exception e1) {

            }
        }
        else if (e.getSource() == b4) {
            try {
                browser.browse(new URI("https://www.mohfw.gov.in/"));
            } catch (Exception e1) {

            }
        }

    }
    public static void main(String[] args) {

    }
}

/* Code by Aadi Jain */