# Nested Interface
 * The concept of placing one interface inside other is called ```Nested Interface```.

 * Example 
  ```java
  import java.util.*;
  interface A{
  	interface B{
  		public void Greetings();
  	}
  } 
  class C implements A.B{
  	public void Greetings(){
  		System.out.println("Namaskar");
  	}
  }
  class D{
  	A.B obj;
  	D o=new D();
  	obj=o;
  	obj.Greetings();
  }
  ```
