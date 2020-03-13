# Closeable Frame Java

Java GUI program cannot be closed clicking in exit button by default for this action action to happen we write a s special code to make make frame Closeable.


### Closeable Frame using Swing
```java
import javax.swing.JFrame;
class JFram1
{
 
   public static void main(String args[])
  {
       JFrame n = new JFrame("blanck JFrame");  
       n.setSize(200,200);
       n.setVisible(true); 
   }
}
```
### Closeable frame using with AWT
```java
import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
public class WindowExample extends Frame{  
    WindowExample(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
public static void main(String[] args) {  
    new WindowExample();  
}  
```
