import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class AdapterExample extends JFrame
{
       AdapterExample()
       {
          this.addWindowListener( new WindowAdapter() {
          public void windowClosing(WindowEvent e)
                           {
                              System.exit(0);
                           }
                           });
       }
}
    class AdapterEventDemo
{
      public static void main(String [] args)
      {
        AdapterExample frame = new AdapterExample();
        frame.setTitle("AdapterEventDemo");
        frame.setBounds(100,200,200,200);
        frame.setVisible(true);
      }
}