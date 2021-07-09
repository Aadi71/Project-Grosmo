/* Code by Aadi Jain */

package Grosmo_Main.GrosmoGUI_HealthCareApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegistrationForm extends JFrame implements ActionListener{
        private Container c;
        private JLabel title, name, mno, gender, dob, res, add, city, state, aadhar, bloodgrp, aayushman;
        private JTextField tname, tmno, tcity, tstate, taadhar, tbloodgrp;
        private JCheckBox term;
        private JButton sub, reset, h;
        private JComboBox month, year, date;
        private JRadioButton male, female, yes, no;
        private ButtonGroup gengp, yesno;
        private JTextArea tadd;

        private String dates[] = {"1","2","3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25","26", "27", "28", "29", "30","31"};
        private String months[] = {"Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sup", "Oct", "Nov", "Dec"};
        private String years[] = {"1995", "1996", "1997", "1998","1999", "2000", "2001", "2002","2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014","2015", "2016", "2017", "2018","2019"};

        public RegistrationForm(){
            setTitle("Registration Form");
            setBounds(300, 90, 900, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            c = getContentPane();
            c.setLayout(null);

            title = new JLabel("Registration Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 30);
            title.setLocation(300, 30);c.add(title);

            name = new JLabel("Name");
            name.setFont(new Font("Arial", Font.PLAIN, 20));
            name.setSize(100,20);
            name.setLocation(100,100);
            c.add(name);

            tname = new JTextField();
            tname.setFont(new Font("Arial", Font.PLAIN, 15));
            tname.setSize(200,20);
            tname.setLocation(200, 100);
            c.add(tname);

            mno = new JLabel("Mobile No.");
            mno.setFont(new Font("Arial", Font.PLAIN, 20));
            mno.setSize(100, 20);
            mno.setLocation(100, 130);
            c.add(mno);

            tmno = new JTextField();
            tmno.setFont(new Font("Arial", Font.PLAIN, 15));
            tmno.setSize(200, 20);
            tmno.setLocation(200, 130);
            c.add(tmno);

            gender = new JLabel("Gender");
            gender.setFont(new Font("Arial", Font.PLAIN, 20));
            gender.setSize(100, 20);
            gender.setLocation(100, 160);
            c.add(gender);

            male = new JRadioButton("Male");
            male.setFont(new Font("Arial", Font.PLAIN, 20));
            male.setSelected(false);
            male.setSize(75, 20);
            male.setLocation(200, 160);
            c.add(male);

            female = new JRadioButton("Female");
            female.setFont(new Font("Arial", Font.PLAIN, 20));
            female.setSelected(false);
            female.setSize(150, 20);
            female.setLocation(275, 160);
            c.add(female);

            gengp = new ButtonGroup();
            gengp.add(male);
            gengp.add(female);

            dob = new JLabel("DOB");
            dob.setFont(new Font("Arial", Font.PLAIN,20));
            dob.setSize(100, 20);
            dob.setLocation(100, 190);
            c.add(dob);

            date = new JComboBox(dates);
            date.setFont(new Font("Arial", Font.PLAIN, 15));
            date.setSize(50, 20);
            date.setLocation(200, 190);
            c.add(date);

            month = new JComboBox(months);
            month.setFont(new Font("Arial", Font.PLAIN, 15));
            month.setSize(60, 20);
            month.setLocation(260, 190);
            c.add(month);

            year = new JComboBox(years);
            year.setFont(new Font("Arial", Font.PLAIN, 15));
            year.setSize(70, 20);
            year.setLocation(330, 190);
            c.add(year);

            add = new JLabel("Address");
            add.setFont(new Font("Arial", Font.PLAIN, 20));
            add.setSize(100, 20);
            add.setLocation(100, 230);
            c.add(add);

            tadd = new JTextArea();
            tadd.setFont(new Font("Arial", Font.PLAIN, 15));
            tadd.setSize(200, 75);
            tadd.setLocation(200, 230);
            tadd.setLineWrap(true);
            c.add(tadd);

            city = new JLabel("City");
            city.setFont(new Font("Arial", Font.PLAIN, 20));
            city.setSize(120,20);
            city.setLocation(100, 340);
            c.add(city);

            tcity = new JTextField();
            tcity.setFont(new Font("Arial", Font.PLAIN, 15));
            tcity.setSize(200,20);
            tcity.setLocation(200, 340);
            c.add(tcity);

            state = new JLabel("State");
            state.setFont(new Font("Arial", Font.PLAIN, 20));
            state.setSize(200,20);
            state.setLocation(100, 370);
            c.add(state);

            tstate = new JTextField();
            tstate.setFont(new Font("Arial", Font.PLAIN, 15));
            tstate.setSize(200,20);
            tstate.setLocation(200, 370);
            c.add(tstate);

            aadhar = new JLabel("Aadhar No.");
            aadhar.setFont(new Font("Arial", Font.PLAIN, 20));
            aadhar.setSize(100,20);
            aadhar.setLocation(100, 400);
            c.add(aadhar);

            taadhar = new JTextField();
            taadhar.setFont(new Font("Arial", Font.PLAIN, 15));
            taadhar.setSize(200,20);
            taadhar.setLocation(200, 400);
            c.add(taadhar);

            bloodgrp = new JLabel("Blood Grp");
            bloodgrp.setFont(new Font("Arial", Font.PLAIN, 20));
            bloodgrp.setSize(100,20);
            bloodgrp.setLocation(100, 430);
            c.add(bloodgrp);

            tbloodgrp = new JTextField();
            tbloodgrp.setFont(new Font("Arial", Font.PLAIN, 15));
            tbloodgrp.setSize(100,20);
            tbloodgrp.setLocation(200, 430);
            c.add(tbloodgrp);

            aayushman = new JLabel("Do you have Aayushman Card");
            aayushman.setFont(new Font("Arial", Font.PLAIN, 20));
            aayushman.setSize(280, 20);
            aayushman.setLocation(100, 460);
            c.add(aayushman);

            yes = new JRadioButton("Yes");
            yes.setFont(new Font("Arial", Font.PLAIN, 20));
            yes.setSelected(false);
            yes.setSize(75, 20);
            yes.setLocation(410, 460);
            c.add(yes);

            no = new JRadioButton("No");
            no.setFont(new Font("Arial", Font.PLAIN, 20));
            no.setSelected(false);
            no.setSize(75, 20);
            no.setLocation(490, 460);
            c.add(no);

            yesno = new ButtonGroup();
            yesno.add(yes);
            yesno.add(no);


            term = new JCheckBox("Accept Terms and Conditions.");
            term.setFont(new Font("Arial", Font.PLAIN, 15));
            term.setSize(250, 20);
            term.setLocation(150, 500);
            c.add(term);

            sub = new JButton("Submit");
            sub.setFont(new Font("Arial",Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 530);
            sub.addActionListener(this);
            c.add(sub);

            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(270, 530);
            reset.addActionListener(this);
            c.add(reset);


            ImageIcon home = new ImageIcon(new ImageIcon("src/Grosmo/GuiInterface/Images/home.png")
                    .getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));

            h = new JButton("Home");
            h.setBounds(800,5,80,80);
            h.setIcon(home);
            h.addActionListener(this);
            h.setFocusable(false);
            h.setFocusPainted(false);
            h.setOpaque(false);
            h.setForeground(Color.blue);
            h.setHorizontalTextPosition(JButton.CENTER);
            h.setVerticalTextPosition(JButton.BOTTOM);
            h.addActionListener(this);
            h.setFont(new Font("Comic Sans", Font.BOLD, 15));
            c.add(h);

            setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == h){
                dispose();
                new home();
            }
            else if(e.getSource()==reset){
                dispose();
                new RegistrationForm();
            }
            else if(e.getSource()==sub){
                if(tname.getText().equals("") || tmno.getText().equals("") || tcity.getText().equals("")
                        || tstate.getText().equals("") || taadhar.getText().equals("") || tbloodgrp.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Field cannot be left empty");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Patient Registered");
                    dispose();
                    new RegistrationForm();
                }
            }
        }

    public static void main(String[] args) {

    }
}

/* Code by Aadi Jain */

