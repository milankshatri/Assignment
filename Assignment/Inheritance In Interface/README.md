# Inheritance in Interface

* Inheritance is the mechanism in which the the properties of one class are acquired by another class.The class which inherits the properties is known as ```Child Class```. In other words the process in which CHILD class inherits the properties of Parent class is called Inheritance.

*  An interface is a completely ```"abstract class"``` that is used to group related methods with empty bodies.

* Inheritance in Interface can be described by below example

* Example
```Java
interface A{
	public void Hello();
}
interface B{
	public void There();
}
class C implements A,B{
	public void Hello(){
		System.out.println("Hello");
	}
	public void There(){
		System.out.println("There");
	}

}
class Demo{
	public static void main(String[] args){
		C c=new C();
		c.Hello();
		c.There();
	}
}
```
