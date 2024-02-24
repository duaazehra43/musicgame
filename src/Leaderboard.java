import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Leaderboard implements ActionListener {
	JButton home, cancel;
    JTable table;
    JFrame f;
    JScrollPane sp;
    ListSelectionModel model1;
     Leaderboard(){
  	 f= new JFrame("Leader Board");
   	 f.setResizable(false);
   	 f.setSize(600,600);
   	 f.setLayout(null);
   	 f.getContentPane().setBackground(Color.black);
   	 f.setLocationRelativeTo(null);
   	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 
   	 JLabel l= new JLabel("Name");
   	 l.setBounds(45,5,100,30);
	 l.setForeground(Color.white);
   	 f.add(l);
   	 JLabel l1= new JLabel("Score");
  	 l1.setBounds(345,5,100,30);
	 l1.setForeground(Color.white);
  	 f.add(l1);
   	 
   	    	table = new JTable();
            DefaultTableModel model = new DefaultTableModel();
            String[] columns = {"Name", "Score"};
            table.setBounds(40, 30, 500, 400);
            model.setColumnIdentifiers(columns);
            table.setModel(model);
            JTableHeader header = table.getTableHeader();
            header.setBackground(new Color(164, 46, 190));
            header.setForeground(Color.white);
            JScrollPane scroll = new JScrollPane(table);
            scroll.setBounds(50, 170, 800, 500);
            scroll.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            final String[] username = {""};
            final String[] score = {""};

            try {
             DBConnection con = new DBConnection();
             ResultSet rs = con.s.executeQuery("SELECT * FROM register");
             while (rs.next()) {
                    username[0] = rs.getString(2);
                    score[0] = rs.getString(7);

                    model.addRow(new Object[]{username[0], score[0]});
                }
			  
		  }
   	     catch(Exception e) {
   	    	 e.printStackTrace();
   	     }
		  
		  f.add(table);
	  
   	 
   	
   	 home = new JButton("Home");
   	 home.setBounds(50,450,490,40);
   	 home.setBackground(Color.white);
	 home.setForeground(Color.black);
   	 f.add(home);
   	 home.addActionListener(this);
   	 
   	 f.setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==home) {
	          f.setVisible(false);
	          new Launcher();
			  f.setVisible(false);
	      }
		
	}
}
