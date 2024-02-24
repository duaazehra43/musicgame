import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
public class Launcher implements ActionListener {

	JFrame frm;
    JLabel label1;
    JButton b,b1,b2,b3;
	
	public Launcher(){

		frm = new JFrame("Guess The Music");
        frm.setSize(600,500);
        frm.setLayout(null);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.getContentPane().setBackground(Color.BLACK);
        frm.setVisible(true);

        label1 = new JLabel("Welcome To Game");
    	 label1.setBounds(175, 9, 500, 100);
    	 label1.setForeground(Color.WHITE);
    	 label1.setFont(new Font ("Tahoma", Font.PLAIN, 30));
    	 frm.add(label1);

         b= new JButton("Login");
    	 b.setBounds(75, 150, 450, 50);
    	 b.setBackground(Color.white);
    	 b.setForeground(Color.black);
    	 b.setFont(new Font("serif", Font.PLAIN, 24));
    	 b.addActionListener(this);
    	 frm.add(b);
    	 
    	 b1 = new JButton("Register");
    	 b1.setBounds(75, 210, 450, 50);
    	 b1.setBackground(Color.white);
    	 b1.setForeground(Color.black);
    	 b1.setFont(new Font("serif", Font.PLAIN, 24));
    	 b1.addActionListener(this);
    	 frm.add(b1);
    	 
    	 b2 = new JButton("View LeaderBoard");
    	 b2.setBounds(75, 270, 450, 50);
    	 b2.setBackground(Color.white);
    	 b2.setForeground(Color.black);
    	 b2.setFont(new Font("serif", Font.PLAIN, 24));
    	 b2.addActionListener(this);
    	 frm.add(b2);
        
		 b3 = new JButton("Exit");
    	 b3.setBounds(75, 330, 450, 50);
    	 b3.setBackground(Color.white);
    	 b3.setForeground(Color.black);
    	 b3.setFont(new Font("serif", Font.PLAIN, 24));
    	 b3.addActionListener(this);
    	 frm.add(b3);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b) {
			new Login();
			frm.setVisible(false);
	  }
	    if(ae.getSource()==b1) {
		   new Registration();
		   frm.setVisible(false);
      }
	    if(ae.getSource()==b2) {
	     	new Leaderboard();
			 frm.setVisible(false);
      }
	  else if(ae.getSource()==b3) {
			System.exit(0);}
		}
		
    public static void main(String[] args) {
       new Launcher();
}}