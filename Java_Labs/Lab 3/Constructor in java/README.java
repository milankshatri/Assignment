# Constructor in Java

In java, a ```Constructor``` is a block of codes similar to method. It is called when instance of class i.e object is created.

* In java the name of method and class is same.
* Constructor doesn't have return type not even void
* A java construcor cannot be abstract, static, final and synchronized

__There are two types of Constructor in java__

1. Default constructor(No-arg)
1. Parameterized Constructor




1. Default constructor 

* Example
```java
class Example{
	Example(){
		//declaratio
	}
	public static void main(String[] args) {
		//calling a default constructor
		Example object=new Example();
	}
}
```
1. Parmeterized Constructor
* Example
```java
class Example{
	Example(local variable){
		//declaration
	}
	public static void main(String[] args) {
		//calling a parameterized constructor
		Example object=new Example(1,2);
	}
}
```
