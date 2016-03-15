package nestedclasses;

public class ShadowTest {
  public int x = 2 ;

  class FirstLevel {

    private int x =7 ;

    void methodInFirstLevel(int x) {
      System.out.println("x = " + x);
      System.out.println("this.x = " + this.x);
      System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
    }
  }

  public static void main(String... args) {
    ShadowTest st = new ShadowTest();
    ShadowTest.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLevel(255);
    System.out.println(st.x);
    System.out.println(fl.x);
  }
}
