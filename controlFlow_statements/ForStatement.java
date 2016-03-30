package controlFlow_statements;

public class ForStatement {
  public static void main(String[] args){
    for ( int i = 0; i < 10; i++){
      System.out.println("Value of i : "+i);
    }
    
    char[] array = {'a','b','c','d','e'};
    for (char i :array ){
      System.out.println(i);
    }
  }
}
