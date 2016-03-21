package acess_privileges;

public class PassPrimitiveVariablesAsArguments {
  public static void main(String[] args){
    int x;
    x = 9;
    checkScope(x);
    System.out.println(x);
    x = checkScopeByReturn(x);
    System.out.println(x);
  }
  public static void checkScope(int x){
    x=x+1;
    System.out.println(x);
  }
  public static int  checkScopeByReturn(int x){
    x=60;
    System.out.println(x);
    return x;
  }
  
}
