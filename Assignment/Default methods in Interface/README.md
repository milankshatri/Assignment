# Default Methods in Interface

* The concept which allows interface to have method with with implimentation without affecting the classess that implement interface.

* This concept was introduced in Java 8.

Example:-
```Java
interface SampleClass
{
	public void AreaOfSquare(int a);
	void display(){
		System.out.println("Default Method");
	}
}
class ChildClass implements SampleClass
{
	public void AreaOfSquare(int a)
	{
		System.out.println("The area of Square is "+(a*a));
	}
	public static void main(String[] args)
	{
		ChildClass d=new ChildClass();
		d.AreaOfSquare(3);
		d.display();
	}
}
