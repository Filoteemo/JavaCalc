package kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Kalkulator implements ActionListener{  
   JFrame frame = new JFrame("Kalkulator");
   JButton b1 = new JButton("1");
   JButton b2 = new JButton("2");
   JButton b3 = new JButton("3");
   JButton b4 = new JButton("4");
   JButton b5 = new JButton("5");
   JButton b6 = new JButton("6");
   JButton b7 = new JButton("7");
   JButton b8 = new JButton("8");
   JButton b9 = new JButton("9");
   JButton b0 = new JButton("0");
   JButton ac = new JButton("AC");
   JButton bDele = new JButton("/");
   JButton bGange = new JButton("*");
   JButton bPluss = new JButton("+");
   JButton bMinus = new JButton("-");
   JButton bProsent = new JButton("%");
   JButton bErlik = new JButton("=");
   JTextField tallboks = new JTextField("0");
   public void Kalkulatorform(){
      Font tallfont = new Font("SansSerif",Font.BOLD,25);
      tallboks.setHorizontalAlignment(SwingConstants.RIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400,400);
      frame.getContentPane().setBackground(Color.GRAY); // setter bakgrunnsfarge på kalkulator
      frame.setResizable(false); // gjør at JFrame ikke kan rezises
      frame.setLocationRelativeTo(null); // sentrerer JFrame på skjermen
      tallboks.setFont(tallfont);
      b1.setBounds(10,80,70,70);
      b2.setBounds(75,80,70,70);
      b3.setBounds(140,80,70,70);
      b4.setBounds(10,145,70,70);
      b5.setBounds(75,145,70,70);
      b6.setBounds(140,145,70,70);
      b7.setBounds(10,210,70,70);
      b8.setBounds(75,210,70,70);
      b9.setBounds(140,210,70,70);
      b0.setBounds(10,275,70,70);
      ac.setBounds(75,275,70,70);
      bDele.setBounds(255,80,70,70);
      bGange.setBounds(320,80,70,70);
      bPluss.setBounds(255,145,70,70);
      bMinus.setBounds(320,145,70,70);
      bProsent.setBounds(255,210,70,70);
      bErlik.setBounds(320,210,70,70);
      tallboks.setBounds(10,10,380,70);
      frame.add(b1);
      frame.add(b2);
      frame.add(b3);
      frame.add(b4);
      frame.add(b5);
      frame.add(b6);
      frame.add(b7);
      frame.add(b8);
      frame.add(b9);
      frame.add(b0);
      frame.add(ac);
      frame.add(bDele);
      frame.add(bGange);
      frame.add(bPluss);
      frame.add(bMinus);
      frame.add(bProsent);
      frame.add(bErlik);
      frame.add(tallboks);
      b1.addActionListener(this);
      b2.addActionListener(this);
      frame.setLayout(null);
      frame.setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e){
      String knapp1 = b1.getText(); 
      tallboks.setText(String.valueOf(knapp1));
   }
      // String knapp3 = b3.getText();  
      // tallboks.setText(String.valueOf(knapp3));
      // String knapp4 = b4.getText();  
      // tallboks.setText(String.valueOf(knapp4));
      // String knapp5 = b5.getText();  
      // tallboks.setText(String.valueOf(knapp5));
      // String knapp6 = b6.getText();  
      // tallboks.setText(String.valueOf(knapp6));
      // String knapp7 = b7.getText();  
      // tallboks.setText(String.valueOf(knapp7));
      // String knapp8 = b8.getText();  
      // tallboks.setText(String.valueOf(knapp8));
      // String knapp9 = b9.getText();  
      // tallboks.setText(String.valueOf(knapp9));
      // String knapp0 = b0.getText();  
      // tallboks.setText(String.valueOf(knapp0));
}