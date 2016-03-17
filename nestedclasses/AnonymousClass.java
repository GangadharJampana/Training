package nestedclasses;

public class AnonymousClass {
  void print(){
    System.out.println("Hello world");
    
  }
  int add (int a){
    return ++a;
  }
  void method(){
    System.out.println("test for one method");
  }
  
  
  public static void main(String[] args){
    AnonymousClass anonymous = new AnonymousClass();
    anonymous.print();
    AnonymousClass anAnonymous = new AnonymousClass(){
      @Override 
      void print(){
        System.out.println("Hello test world");
        write();
      }
      void write(){
        System.out.println("ring tring");
      }
      int add(double a){
        return (int)(a*2);
      }
    };
    anAnonymous.print();
    anAnonymous.method();
    System.out.println(anAnonymous.add(4));
    //below statement will give an error 
    //since method signature of two add methods are different 
    //add method with double as parameter is not defined for the original class
    //System.out.println(anAnonymous.add(4.34));
  }
}
