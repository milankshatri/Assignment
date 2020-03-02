import java.awt.*;
public class GridLayoutDemo{
	GridLayoutDemo(){
		Frame f=new Frame("GridLayout");
		Button a=new Button("First");
		Button b=new Button("Second");
		Button c=new Button("Third");
		Button d=new Button("Fourth");
		f.add(a);
		f.add(b);
		f.add(c);
		f.add(d);
		f.setLayout(new GridLayout(2,2));
		f.setVisible(true);
		f.setSize(400,400);
	
	}
	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}