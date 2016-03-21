package nestedclasses;

public class Test {
  
  
  public int a; 
  
}

class Test2 extends Test {
  private int b = 5;
  public static void main(String[] args){ 
    Test t = new Test();
    Test2 t2 = (Test2) t;
    System.out.println(t2.b);
   }
}
