import java.awt.event.*;
import javax.swing.*;
class ActionEventDemo extends JFrame implements ActionListener{
	JButton b;
	JTextField tf;
	ActionEventDemo(){
		super("ActionEventDemo");
		setVisible(true);
		setSize(500,500);
		tf = new JTextField();
		b = new JButton("Resize");
		b.addActionListener(this);
		add(tf);
		add(b);
	}
	public void actionPerformed(ActionEvent e) {
        b.setText("Hello");
        b.setBounds(10, 10, 300, 150);
     }
	public static void main(String[] args) {
		new ActionEventDemo();
	}
}