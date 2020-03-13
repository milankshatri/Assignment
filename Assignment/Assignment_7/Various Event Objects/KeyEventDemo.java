import java.awt.*;
import java.awt.event.*;

class KeyEventDemo extends Frame implements KeyListener
{
	Label l;
	TextField tf;
	KeyEventDemo()
	{
		super("KeyEventDemo");
		setVisible(true);
		setSize(500,500);
		l = new Label();
		l.setBounds(20,50,100,20);  
		tf = new TextField();
		tf.addKeyListener(this);
		tf.setBounds(20,80,300, 300); 
		add(l);
		add(tf);
		setLayout(null);
	}
	public void keyPressed(KeyEvent ke)
	{
		l.setText(ke.getKeyChar()+" pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		l.setText("Key Released");
	}
	public void keyTyped(KeyEvent ke)
	{
		l.setText(ke.getKeyChar()+" typed");
	}
	public static void main(String[] args) {
		new KeyEventDemo();
	}
}