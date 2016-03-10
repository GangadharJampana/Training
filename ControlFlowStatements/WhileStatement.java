package ControlFlowStatements;

public class WhileStatement {

  public static void main(String[] args) {
    int number = 1;
    
    while (number < 11) {
        System.out.println("number is: " + number);
        number++;
    }
    
    int count = 1;
    do {
        System.out.println("count is: " + count);
        count++;
    } while (count < 1);

  }

}
