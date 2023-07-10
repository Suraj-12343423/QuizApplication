import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String name,int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i3 = i2.getImage().getScaledInstance(200,150,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(100,200,200,250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + "  for playing this quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahuma",Font.PLAIN,26));
        add(heading);

        JLabel lblscore = new JLabel("Your Score" + score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahuma",Font.PLAIN,24));
        add(lblscore);

        JButton  submit = new JButton("PLAYAGAIN");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

    }
    public static void main(String[] args) {
        new Score("user",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new login();


    }
}
