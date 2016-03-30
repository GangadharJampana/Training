package acess_privileges;

public class PassReferenceVariablesAsArguments {
  public static void main(String[] args){
    int[] array = {1,2,3,4};
    for (int i : array){
      System.out.println(i);
    }
    
    checkScope(array);
    for (int i : array){
      System.out.println(i);
    }
  }
  public static void checkScope(int[] a){
    int n;
    n = a.length;
    for (int i=0;i < n ; i++){
      a[i] = i+3;
      System.out.println(a[i]);
    }
  }
}
