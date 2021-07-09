/* Code by Aadi Jain */

package Grosmo_Main.GrosmoGUI_HealthCareApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    private Container c;
    private JLabel title, user, pass;
    private JTextField tuser;
    private JPasswordField tpass;
    private JButton sub, forget;
    Connection con = null;
    public login(){
        con = DriverSql.dbconnect();
        setTitle("Login/SignUp");
        setBounds(500,200, 500,280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("GROSMO - Login");
        title.setFont(new Font("Arial", Font.PLAIN, 25));
        title.setSize(200,30);
        title.setLocation(140, 30);
        c.add(title);



        user = new JLabel("UserName: ");
        user.setFont(new Font("Arial", Font.PLAIN, 20));
        user.setSize(150, 25);
        user.setLocation(50, 80);
        c.add(user);

        tuser = new JTextField();
        tuser.setFont(new Font("Arial", Font.PLAIN, 15));
        tuser.setSize(150,25);
        tuser.setLocation(220, 80);
        c.add(tuser);

        pass = new JLabel("Password : ");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(150, 25);
        pass.setLocation(50, 120);
        c.add(pass);

        tpass = new JPasswordField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(150, 25);
        tpass.setLocation(220, 120);
        c.add(tpass);

        sub = new JButton("SUBMIT");
        sub.setFont(new Font("Arial",Font.PLAIN, 20));
        sub.setSize(150, 20);
        sub.setLocation(150, 160);
        sub.addActionListener(this);
        c.add(sub);

        forget = new JButton("New Register! SignUp here");

        forget.setFont(new Font("Arial",Font.CENTER_BASELINE, 10));
        forget.setFocusable(false);
        forget.setBounds(120,195, 200, 15);
        forget.addActionListener(this);

        c.add(forget);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sub) {
            try {
                String cuser = tuser.getText();
                String cpass = String.valueOf(tpass.getPassword());

                PreparedStatement pst = con.prepareStatement("select * from login where UserId=? and Password=?");
                pst.setString(1, cuser);
                pst.setString(2, cpass);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    setVisible(false);
                    new home();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Id or password");
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if(e.getSource() == forget){
            dispose();
            new Signup();
        }
    }
    public static void main(String[] args) {

    }


}

/* Code by Aadi Jain */