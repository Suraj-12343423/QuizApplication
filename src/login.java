import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;

    login(){
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        add(image);

        setLayout(null);
        image.setBounds(0,0,600,500);

        JLabel heading = new JLabel("Complex Minds");
        heading.setBounds(750,60,300,50);
        heading.setFont(new Font("TimesRoman",Font.BOLD,40));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        rules = new JButton("RULES");
        rules.setBounds(735,275,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,275,120,20);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);



        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rules){
            String name = this.tfname.getText();
            setVisible(false);
            new Rules(name);

        } else if (e.getSource() == back) {
            setVisible(false );
        }


    }


    public static void main(String[] args) {
        new login();
    }


}
