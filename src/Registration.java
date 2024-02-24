import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Registration implements ActionListener{
 JCheckBox cb; JButton b,exit;
 JTextField t, t1, t2,t3,t4;
 JPasswordField p;
 JFrame f;

    Registration(){
        f= new JFrame("Registration Form");
        f.setSize(500,800);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.black);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        f.setLayout(null);
    
        JLabel l1= new JLabel("Get Yourself Registered");
        l1.setBounds(80,130,1000,50);
        l1.setFont(new Font("serif", Font.BOLD, 34));
        l1.setForeground(Color.white);
        f.getContentPane().add(l1);

        JLabel l2= new JLabel("Name: ");
        l2.setBounds(100,300,100,30);
        l2.setFont(new Font("serif", Font.PLAIN, 24));
        l2.setForeground(Color.white);
        f.getContentPane().add(l2);

        t = new JTextField();
        t.setBounds(200,300,150,30);
        f.getContentPane().add(t);

        JLabel l3= new JLabel("Password: ");
        l3.setBounds(100,350,120,30);
        l3.setFont(new Font("serif", Font.PLAIN, 24));
        l3.setForeground(Color.WHITE);
        f.getContentPane().add(l3);

        p= new JPasswordField();
        p.setBounds(200,350,150,30);
        f.getContentPane().add(p);

        JLabel l4= new JLabel("Gender: ");
        l4.setBounds(100,400,100,30);
        l4.setFont(new Font("serif", Font.PLAIN, 24));
        l4.setForeground(Color.WHITE);
        f.getContentPane().add(l4);
        
        t1 = new JTextField();
        t1.setBounds(200,400,150,30);
        f.getContentPane().add(t1);
        
        JLabel l5 = new JLabel("City: ");
        l5.setBounds(100,450,100,30);
        l5.setFont(new Font("serif", Font.PLAIN, 24));
        l5.setForeground(Color.WHITE);
        f.getContentPane().add(l5);

        t2 = new JTextField();
        t2.setBounds(200,450,150,30);
        f.getContentPane().add(t2);

        JLabel l6= new JLabel("Email: ");
        l6.setBounds(100, 500, 100, 30);
        l6.setFont(new Font("serif", Font.PLAIN, 24));
        l6.setForeground(Color.WHITE);
        f.getContentPane().add(l6);

        t3= new JTextField();
        t3.setBounds(200,500,150,30);
        f.getContentPane().add(t3);

        JLabel l7= new JLabel("Phone: ");
        l7.setBounds(100,550,100,30);
        l7.setFont(new Font("serif", Font.PLAIN, 24));
        l7.setForeground(Color.WHITE);
        f.getContentPane().add(l7);

        t4= new JTextField();
        t4.setColumns(11);
        t4.addKeyListener(new KeyAdapter() {
          public void keyPressed(KeyEvent ke) {
            JLabel msg= new JLabel("");
            msg.setBounds(200,600,100,30);
            f.getContentPane().add(msg);
             String value = t2.getText();
             int l = value.length();
             if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                t2.setEditable(true);
                msg.setText("");
             } else {
                t2.setEditable(false);
                JOptionPane.showMessageDialog(t2, "Please Enter Only Numbers From 0-9");
             }
          }
       });
       t4.setBounds(200,550,150,30);
       f.getContentPane().add(t4);

        cb= new JCheckBox("Agreed To Terms And Condition");
        cb.setBounds(120,600,210,30);
        f.getContentPane().add(cb);

        b= new JButton("Register");
        b.setBounds(150,650,100,30);
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        b.addActionListener(this);
        f.getContentPane().add(b);

        JButton b1= new JButton("Clear");
        b1.setBounds(250,650,100,30);
        b1.setBackground(Color.white);
        b.setForeground(Color.black);
        b1.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
          cb.setSelected(false);
          t.setText(null);
          p.setText(null);
          t1.setText(null);
          t2.setText(null);
          t3.setText(null);
          t4.setText(null);

          }
        } );

        exit=new JButton("Cancel");
        exit.setBounds(100,690,300,30);
	      exit.setFont(new Font("serif",Font.BOLD,15));
	      exit.setBackground(Color.WHITE);
   	    exit.setForeground(Color.black);
	      f.add(exit);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Launcher();
                f.setVisible(false);
            }
        });

        f.getContentPane().add(b1);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(cb.isSelected()){
         if(e.getSource() == b){
    try{
        DBConnection cc = new DBConnection();
        String q = "insert into register (phone, username, password, gender, city, email) values('"+t4.getText()+"','"+t.getText()+"','"+p.getText()+"','"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"')";
        cc.s.executeUpdate(q);
        JOptionPane.showMessageDialog(null,"Registration Successfully");
        new Login();
        f.setVisible(false);
    }catch(Exception ee){
        System.out.println("The error is:"+ee);
    }
}
        else{
             JOptionPane.showMessageDialog(b, "Please Accept The Terms And Condition!");
        }
    
      }
   
}}