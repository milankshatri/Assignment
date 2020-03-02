import java.awt.*;
public class FlowLayoutDemo{
	FlowLayoutDemo(){
		Frame f=new Frame("FlowLayout");
		Button b1=new Button("First");
		Button b2=new Button("Second");
		Button b3=new Button("Third");
		Button b4=new Button("Fourth");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setLayout(new FlowLayout(FlowLayout.LEADING));
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
			new FlowLayoutDemo();
	}
}