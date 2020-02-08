# Constructor in Java

In java, a ```Constructor``` is a block of codes similar to method. It is called when instance of class i.e object is created.

* In java the name of method and class is same.
* Constructor doesn't have return type not even void
* A java construcor cannot be abstract, static, final and synchronized

__There are two types of Constructor in java__

* Default constructor(No-arg)
* Parameterized Constructor




* Default constructor 

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
* Parmeterized Constructor
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
