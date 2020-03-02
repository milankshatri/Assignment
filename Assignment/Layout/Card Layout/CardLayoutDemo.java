import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;   
public class CardLayoutDemo extends JFrame implements ActionListener{  
CardLayout card;  
JButton b1,b2,b3;  
Container c;  
    CardLayoutDemo(){  
          
        c=getContentPane();  
        card=new CardLayout(40,30);  
        c.setLayout(card);  
          
        b1=new JButton("First");  
        b2=new JButton("Second");  
        b3=new JButton("Third");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
              
        c.add("a",b1);c.add("b",b2);c.add("c",b3);  
                          
    }  
    public void actionPerformed(ActionEvent e) {  
    card.next(c);  
    }  
  
    public static void main(String[] args) {  
        CardLayoutDemo cls=new CardLayoutDemo();  
        cls.setSize(400,400);  
        cls.setVisible(true);  
    }  
}  