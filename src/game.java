import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class game implements ActionListener{
	JFrame frm;
	JButton c,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24;
    JButton song1,b,song2,b1,song3,b2,song4,b3,song5,b4, exit;
    JLabel l;
    int count=0;

	public game(String login){

        l= new JLabel(login);

	    frm = new JFrame("Game Panel");
        frm.setSize(600,400);
        frm.setLayout(null);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.getContentPane().setBackground(Color.white);

        //First Song

        b = new JButton("Play A Song");
        b.setBounds(40,15,250,30);
        b.setFont(new Font("serif",Font.BOLD,15));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setVisible(false);
        frm.add(b); 
        b.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
                try {
                        play("src/resources/Lovely.mpeg");
                    } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

        song1 = new JButton("Song 1");
        song1.setBounds(380,20,100,30);
        song1.setFont(new Font("serif",Font.BOLD,15));
        song1.setBackground(Color.black);
        song1.setForeground(Color.white);
        frm.add(song1);
        song1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setVisible(true);
                b1.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                c.setVisible(true);
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(true);
                c4.setVisible(true);
                c5.setVisible(false);
                c6.setVisible(false);
                c7.setVisible(false);
                c8.setVisible(false);
                c8.setVisible(false);
                c9.setVisible(false);
                c10.setVisible(false);
                c11.setVisible(false);
                c12.setVisible(false);
                c13.setVisible(false);
                c14.setVisible(false);
                c15.setVisible(false);
                c16.setVisible(false);
                c17.setVisible(false);
                c18.setVisible(false);
                c19.setVisible(false);
                c20.setVisible(false);
                c21.setVisible(false);
                c22.setVisible(false);
                c23.setVisible(false);
                c24.setVisible(false);
            }
        });

        c = new JButton("Fearless");
        c.setBounds(40,80,250,30);
        c.setVisible(false);
        frm.getContentPane().add(c);
        c.setFont(new Font("serif",Font.BOLD,15));
        c.setBackground(Color.black);
        c.setForeground(Color.white);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/V1Pl8CzNzCw");
            }
        });
        c1 = new JButton("In the end");
        c1.setBounds(40,130,250,30);
        c1.setVisible(false);
        frm.getContentPane().add(c1);
        c1.setFont(new Font("serif",Font.BOLD,15));
        c1.setBackground(Color.black);
        c1.setForeground(Color.white);
        c1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/V1Pl8CzNzCw");
            }
        });
        c2 = new JButton("I am alone");
        c2.setBounds(40,180,250,30);
        c2.setVisible(false);
        frm.getContentPane().add(c2);
        c2.setFont(new Font("serif",Font.BOLD,15));
        c2.setBackground(Color.black);
        c2.setForeground(Color.white);
        c2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/V1Pl8CzNzCw");
            }
        });
        c3 = new JButton("Fairytale");
        c3.setBounds(40,230,250,30);
        c3.setVisible(false);
        frm.getContentPane().add(c3);
        c3.setFont(new Font("serif",Font.BOLD,15));
        c3.setBackground(Color.black);
        c3.setForeground(Color.white);
        c3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/V1Pl8CzNzCw");
            }
        });
        c4 = new JButton("Lovely");
        c4.setBounds(40,280,250,30);
        c4.setVisible(false);
        frm.getContentPane().add(c4);
        c4.setFont(new Font("serif",Font.BOLD,15));
        c4.setBackground(Color.black);
        c4.setForeground(Color.white);
        c4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                JOptionPane.showMessageDialog(null, "Right Answer");
                try{
                    DBConnection con = new DBConnection();
                    String str = "update musicgame.register set score = score + " + count + " WHERE username = '" + login + "';";
                    con.s.executeUpdate(str);
                }catch(Exception ee){
                    ee.printStackTrace();
                }
            }
        });

        //Second Song

        b1 = new JButton("Play A Song");
        b1.setBounds(40,15,250,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setVisible(false);
        frm.add(b1); 
        b1.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
                try {
                        play("src/resources/Fearless.mpeg");
                    } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

        song2 = new JButton("Song 2");
        song2.setBounds(380,70,100,30);
        song2.setFont(new Font("serif",Font.BOLD,15));
        song2.setBackground(Color.black);
        song2.setForeground(Color.white);
        frm.add(song2);
        song2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b1.setVisible(true);
                b.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                c5.setVisible(true);
                c6.setVisible(true);
                c7.setVisible(true);
                c8.setVisible(true);
                c9.setVisible(true);
                c.setVisible(false);
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(false);
                c10.setVisible(false);
                c11.setVisible(false);
                c12.setVisible(false);
                c13.setVisible(false);
                c14.setVisible(false);
                c15.setVisible(false);
                c16.setVisible(false);
                c17.setVisible(false);
                c18.setVisible(false);
                c19.setVisible(false);
                c20.setVisible(false);
                c21.setVisible(false);
                c22.setVisible(false);
                c23.setVisible(false);
                c24.setVisible(false);
                
            }
        });

        c5 = new JButton("Fearless");
        c5.setBounds(40,80,250,30);
        c5.setVisible(false);
        frm.getContentPane().add(c5);
        c5.setFont(new Font("serif",Font.BOLD,15));
        c5.setBackground(Color.black);
        c5.setForeground(Color.white);
        c5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                JOptionPane.showMessageDialog(null, "Right Answer");
                try{
                    DBConnection con = new DBConnection();
                    String str = "UPDATE musicgame.register SET score = score + " + count + " WHERE username = '" + login + "';";
                    con.s.executeUpdate(str);
                    
                    
                }catch(Exception ee){
                    ee.printStackTrace();
                }
            }
        });
        c6 = new JButton("In the end");
        c6.setBounds(40,130,250,30);
        c6.setVisible(false);
        frm.getContentPane().add(c6);
        c6.setFont(new Font("serif",Font.BOLD,15));
        c6.setBackground(Color.black);
        c6.setForeground(Color.white);
        c6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/b5BNUa_op2o");
            }
        });
        c7 = new JButton("I am alone");
        c7.setBounds(40,180,250,30);
        c7.setVisible(false);
        frm.getContentPane().add(c7);
        c7.setFont(new Font("serif",Font.BOLD,15));
        c7.setBackground(Color.black);
        c7.setForeground(Color.white);
        c7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/b5BNUa_op2o");
            }
        });
        c8 = new JButton("Fairytale");
        c8.setBounds(40,230,250,30);
        c8.setVisible(false);
        frm.getContentPane().add(c8);
        c8.setFont(new Font("serif",Font.BOLD,15));
        c8.setBackground(Color.black);
        c8.setForeground(Color.white);
        c8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/b5BNUa_op2o");
            }
        });
        c9 = new JButton("Lovely");
        c9.setBounds(40,280,250,30);
        c9.setVisible(false);
        frm.getContentPane().add(c9);
        c9.setFont(new Font("serif",Font.BOLD,15));
        c9.setBackground(Color.black);
        c9.setForeground(Color.white);
        c9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/b5BNUa_op2o");
            }
        });

        //Third Song

        b2 = new JButton("Play A Song");
        b2.setBounds(40,15,250,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setVisible(false);
        frm.add(b2); 
        b2.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
                try {
                        play("src/resources/In the end.mpeg");
                    } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

        song3 = new JButton("Song 3");
        song3.setBounds(380,120,100,30);
        song3.setFont(new Font("serif",Font.BOLD,15));
        song3.setBackground(Color.black);
        song3.setForeground(Color.white);
        frm.add(song3);
        song3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b2.setVisible(true);
                b1.setVisible(false);
                b.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                c10.setVisible(true);
                c11.setVisible(true);
                c12.setVisible(true);
                c13.setVisible(true);
                c14.setVisible(true);
                c.setVisible(false);
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                c6.setVisible(false);
                c7.setVisible(false);
                c8.setVisible(false);
                c8.setVisible(false);
                c9.setVisible(false);
                c15.setVisible(false);
                c16.setVisible(false);
                c17.setVisible(false);
                c18.setVisible(false);
                c19.setVisible(false);
                c20.setVisible(false);
                c21.setVisible(false);
                c22.setVisible(false);
                c23.setVisible(false);
                c24.setVisible(false);
            }
        });

        c10 = new JButton("Fearless");
        c10.setBounds(40,80,250,30);
        c10.setVisible(false);
        frm.getContentPane().add(c10);
        c10.setFont(new Font("serif",Font.BOLD,15));
        c10.setBackground(Color.black);
        c10.setForeground(Color.white);
        c10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/eVTXPUF4Oz4");
            }
        });
        c11 = new JButton("In the end");
        c11.setBounds(40,130,250,30);
        c11.setVisible(false);
        frm.getContentPane().add(c11);
        c11.setFont(new Font("serif",Font.BOLD,15));
        c11.setBackground(Color.black);
        c11.setForeground(Color.white);
        c11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                JOptionPane.showMessageDialog(null, "Right Answer");
                try{
                    DBConnection con = new DBConnection();
                    String str = "UPDATE musicgame.register SET score = score + " + count + " WHERE username = '" + login + "';";
                    con.s.executeUpdate(str);
                    
                    
                }catch(Exception ee){
                    ee.printStackTrace();
                }
            }
        });
        c12 = new JButton("I am alone");
        c12.setBounds(40,180,250,30);
        c12.setVisible(false);
        frm.getContentPane().add(c12);
        c12.setFont(new Font("serif",Font.BOLD,15));
        c12.setBackground(Color.black);
        c12.setForeground(Color.white);
        c12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/eVTXPUF4Oz4");
            }
        });
        c13 = new JButton("Fairytale");
        c13.setBounds(40,230,250,30);
        c13.setVisible(false);
        frm.getContentPane().add(c13);
        c13.setFont(new Font("serif",Font.BOLD,15));
        c13.setBackground(Color.black);
        c13.setForeground(Color.white);
        c13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/eVTXPUF4Oz4");
            }
        });
        c14 = new JButton("Lovely");
        c14.setBounds(40,280,250,30);
        c14.setVisible(false);
        frm.getContentPane().add(c14);
        c14.setFont(new Font("serif",Font.BOLD,15));
        c14.setBackground(Color.black);
        c14.setForeground(Color.white);
        c14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/eVTXPUF4Oz4");
            }
        });

        //Fourth Song

        b3 = new JButton("Play A Song");
        b3.setBounds(40,15,250,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setVisible(false);
        frm.add(b3); 
        b3.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
                try {
                        play("src/resources/Fairytale.mpeg");
                    } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

        song4 = new JButton("Song 4");
        song4.setBounds(380,170,100,30);
        song4.setFont(new Font("serif",Font.BOLD,15));
        song4.setBackground(Color.black);
        song4.setForeground(Color.white);
        frm.add(song4);
        song4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b3.setVisible(true);
                b2.setVisible(false);
                b1.setVisible(false);
                b.setVisible(false);
                b4.setVisible(false);
                c15.setVisible(true);
                c16.setVisible(true);
                c17.setVisible(true);
                c18.setVisible(true);
                c19.setVisible(true);
                c.setVisible(false);
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                c6.setVisible(false);
                c7.setVisible(false);
                c8.setVisible(false);
                c8.setVisible(false);
                c9.setVisible(false);
                c10.setVisible(false);
                c11.setVisible(false);
                c12.setVisible(false);
                c13.setVisible(false);
                c14.setVisible(false);
                c20.setVisible(false);
                c21.setVisible(false);
                c22.setVisible(false);
                c23.setVisible(false);
                c24.setVisible(false);
            }
        });

        c15 = new JButton("Fearless");
        c15.setBounds(40,80,250,30);
        c15.setVisible(false);
        frm.getContentPane().add(c15);
        c15.setFont(new Font("serif",Font.BOLD,15));
        c15.setBackground(Color.black);
        c15.setForeground(Color.white);
        c15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/WXwgZL4zx9o");
            }
        });
        c16 = new JButton("In the end");
        c16.setBounds(40,130,250,30);
        c16.setVisible(false);
        frm.getContentPane().add(c16);
        c16.setFont(new Font("serif",Font.BOLD,15));
        c16.setBackground(Color.black);
        c16.setForeground(Color.white);
        c16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/WXwgZL4zx9o");
            }
        });
        c17 = new JButton("I am alone");
        c17.setBounds(40,180,250,30);
        c17.setVisible(false);
        frm.getContentPane().add(c17);
        c17.setFont(new Font("serif",Font.BOLD,15));
        c17.setBackground(Color.black);
        c17.setForeground(Color.white);
        c17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/WXwgZL4zx9o");
            }
        });
        c18 = new JButton("Fairytale");
        c18.setBounds(40,230,250,30);
        c18.setVisible(false);
        frm.getContentPane().add(c18);
        c18.setFont(new Font("serif",Font.BOLD,15));
        c18.setBackground(Color.black);
        c18.setForeground(Color.white);
        c18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                JOptionPane.showMessageDialog(null, "Right Answer");
                try{
                    DBConnection con = new DBConnection();
                    String str = "UPDATE musicgame.register SET score = score + " + count + " WHERE username = '" + login + "';";
                    con.s.executeUpdate(str);
                    
                    
                }catch(Exception ee){
                    ee.printStackTrace();
                }
            }
        });
        c19 = new JButton("Lovely");
        c19.setBounds(40,280,250,30);
        c19.setVisible(false);
        frm.getContentPane().add(c19);
        c19.setFont(new Font("serif",Font.BOLD,15));
        c19.setBackground(Color.black);
        c19.setForeground(Color.white);
        c19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/WXwgZL4zx9o");
            }
        });

        //Fifth Song

        b4 = new JButton("Play A Song");
        b4.setBounds(40,15,250,30);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.setVisible(false);
        frm.add(b4); 
        b4.addActionListener( new ActionListener(){
          public void actionPerformed(ActionEvent e){
                try {
                        play("src/resources/I am alone.mpeg");
                    } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                } catch (JavaLayerException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

        song5 = new JButton("Song 5");
        song5.setBounds(380,220,100,30);
        song5.setFont(new Font("serif",Font.BOLD,15));
        song5.setBackground(Color.black);
        song5.setForeground(Color.white);
        frm.add(song5);
        song5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b4.setVisible(true);
                b.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(false);
                b1.setVisible(false);
                c20.setVisible(true);
                c21.setVisible(true);
                c22.setVisible(true);
                c23.setVisible(true);
                c24.setVisible(false);
                c10.setVisible(false);
                c11.setVisible(false);
                c12.setVisible(false);
                c13.setVisible(false);
                c14.setVisible(false);
                c.setVisible(false);
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                c6.setVisible(false);
                c7.setVisible(false);
                c8.setVisible(false);
                c8.setVisible(false);
                c9.setVisible(false);
                c15.setVisible(false);
                c16.setVisible(false);
                c17.setVisible(false);
                c18.setVisible(false);
                c19.setVisible(false);
                
            }
        });

        c20 = new JButton("Fearless");
        c20.setBounds(40,80,250,30);
        c20.setVisible(false);
        frm.getContentPane().add(c20);
        c20.setFont(new Font("serif",Font.BOLD,15));
        c20.setBackground(Color.black);
        c20.setForeground(Color.white);
        c20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/qTNY187LUmg");
            }
        });
        c21 = new JButton("In the end");
        c21.setBounds(40,130,250,30);
        c21.setVisible(false);
        frm.getContentPane().add(c21);
        c21.setFont(new Font("serif",Font.BOLD,15));
        c21.setBackground(Color.black);
        c21.setForeground(Color.white);
        c21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/qTNY187LUmg");
            }
        });
        c22 = new JButton("I am alone");
        c22.setBounds(40,180,250,30);
        c22.setVisible(false);
        frm.getContentPane().add(c22);
        c22.setFont(new Font("serif",Font.BOLD,15));
        c22.setBackground(Color.black);
        c22.setForeground(Color.white);
        c22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                JOptionPane.showMessageDialog(null, "Right Answer");
                try{
                    DBConnection con = new DBConnection();
                    String str = "UPDATE musicgame.register SET score = score + " + count + " WHERE username = '" + login + "';";
                    con.s.executeUpdate(str);
                    
                    
                }catch(Exception ee){
                    ee.printStackTrace();
                }
            }
        });
        c23 = new JButton("Fairytale");
        c23.setBounds(40,230,250,30);
        c23.setVisible(false);
        frm.getContentPane().add(c23);
        c23.setFont(new Font("serif",Font.BOLD,15));
        c23.setBackground(Color.black);
        c23.setForeground(Color.white);
        c23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/qTNY187LUmg");
            }
        });
        c24 = new JButton("Lovely");
        c24.setBounds(40,280,250,30);
        c24.setVisible(false);
        frm.getContentPane().add(c24);
        c24.setFont(new Font("serif",Font.BOLD,15));
        c24.setBackground(Color.black);
        c24.setForeground(Color.white);
        c24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Wrong Answer Here is the youtube link to the song: https://youtu.be/qTNY187LUmg");
            }
        });

        exit=new JButton("Cancel");
        exit.setBounds(50,320,300,30);
	    exit.setFont(new Font("serif",Font.BOLD,15));
	    exit.setBackground(Color.black);
   	    exit.setForeground(Color.white);
	    frm.add(exit);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Launcher();
                frm.setVisible(false);
            }
        });
 
        frm.setVisible(true);
}
     public static void play(String name) throws FileNotFoundException, JavaLayerException{
         FileInputStream j= new FileInputStream(name);
         Player k = new Player(j);
         k.play();
      }

@Override
public void actionPerformed(ActionEvent e) {}
}
    
