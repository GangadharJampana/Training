package ControlFlowStatements;

public class IfThenElseStatement {

  public static void main(String[] args) {
    double movieRating = 7.5;
    
    if (movieRating >= 8.5) {
        System.out.println("Movie is awesome.You can watch many times");
    } else if (movieRating >= 7) {
        System.out.println("Movie is good.You can't watch morethan three times");
    } else if (movieRating >= 6.5) {
      System.out.println("Movie is OK.You can watch one time");
    } else {
      System.out.println("It's probably best you dont watch this movie");
    }
   

  }

}
