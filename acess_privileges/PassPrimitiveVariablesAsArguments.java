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
  public static void checkScope(int a){
    a=30;
    System.out.println(a);
  }
  public static int  checkScopeByReturn(int a){
    a=60;
    System.out.println(a);
    return a;
  }
  
}
