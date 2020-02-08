# __Anonymous Arrays In java__

An array in Java *without any name* is ```Anonymous``` array. It is an array just for creating and using it instantly.

* We can create an array without name, such type of nameless arrays are called anonymous array.

* The main purpose of anonymous array is just for instant use i.e just for one time usuage.

* Anonymous array is passed as an argument of method.

```Java
      class Anonymous_Array{ 
          public static void main(String[] args) 
          { 
                numbers(new int[]{ 3, 4, 5 }); 
          } 
          public static void numbers(int[] a) 
          { 
              int total = 0; 
              for (int i : a)  
                  total = total + i; 

              System.out.println("The sum is:" + total); 
          } 
      } 
```
