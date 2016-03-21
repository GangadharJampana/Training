package interfaces_and_inheritance;

public class Cat extends Animal{
  public static void testClassMethod() {
    System.out.println("The static method in Cat");
  }
public void testInstanceMethod() {
    System.out.println("The instance method in Cat");
  }

  public static void main(String[] args) {
    Cat myCat = new Cat();
    Animal myAnimal = myCat;
    myAnimal.testClassMethod();
    myAnimal.testInstanceMethod();
    myCat.testClassMethod();
    myCat.testInstanceMethod();
    Animal dog = new Cat();
    dog.testInstanceMethod();
    dog.testClassMethod();
  }
}
