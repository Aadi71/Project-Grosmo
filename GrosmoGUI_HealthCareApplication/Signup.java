/* Code by Aadi Jain */

package Grosmo_Main.GrosmoGUI_HealthCareApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Signup extends JFrame implements ActionListener{
    private JFrame f;
    private JLabel l1,l2, l3, l4, l5;
    private JTextField t1, t2, t3, t5;

    private JPasswordField t4;
    private  JButton b1, b2, b;
    private Connection con = null;
    Signup() {
        con = DriverSql.dbconnect();
        f = new JFrame("GROSMO - SignUp");



        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel("First Name");
        l1.setBounds(40, 20, 100, 30);
        f.add(l1);

        l2 = new JLabel("Last Name");
        l2.setBounds(40, 70, 100, 30);
        f.add(l2);

        l3 = new JLabel("User Id");
        l3.setBounds(40, 120, 100, 30);
        f.add(l3);

        l4 = new JLabel("Password");
        l4.setBounds(40, 170, 100, 30);
        f.add(l4);

        l5 = new JLabel("Email Id");
        l5.setBounds(40, 220, 100, 30);
        f.add(l5);

        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        f.add(t1);

        t2 = new JTextField();
        t2.setBounds(150, 70, 150, 30);
        f.add(t2);

        t3 = new JTextField();
        t3.setBounds(150, 120, 150, 30);
        f.add(t3);

        t4 = new JPasswordField();
        t4.setBounds(150, 170, 150, 30);
        f.add(t4);

        t5 = new JTextField();
        t5.setBounds(150, 220, 150, 30);
        f.add(t5);

        b1 = new JButton("Submit");
        b1.setBounds(40, 320, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2 = new JButton("RESET");
        b2.setBounds(180, 320, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        b2.addActionListener(this);

        ImageIcon image = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/login.png")
                .getImage().getScaledInstance(40, 60, Image.SCALE_DEFAULT));

        b = new JButton("Login");
        b.setBounds(500,5,80,80);
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




        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(600, 400);
        f.setLocation(450, 120);

    }
        public void actionPerformed (ActionEvent ae) {
            if (ae.getSource() == b1) {
                try {
                    String first = t1.getText();
                    String last = t2.getText();
                    String user = t3.getText();
                    String password = t4.getText();
                    String email = t5.getText();
                    if (first.equals("") || user.equals("") || password.equals("")|| email.equals("")) {
                        JOptionPane.showMessageDialog(null, "Field cannot be left empty");
                    } else {
                        PreparedStatement pst = con.prepareStatement("insert into login(FirstName, LastName, UserId," +
                                " Password, EmailId) values(?,?,?,?,?)");

                        pst.setString(1, first);
                        pst.setString(2, last);
                        pst.setString(3, user);
                        pst.setString(4, password);
                        pst.setString(5, email);

                        pst.executeUpdate();
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        JOptionPane.showMessageDialog(null, "Data Added");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(ae.getSource() == b2){
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }
            else if(ae.getSource() == b){
                f.dispose();
                new login();
            }
        }
    public static void main(String[] args) {

    }


}

/* Code by Aadi Jain */