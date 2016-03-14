package operators;

public class CharacterOperations {
  public char addition(char a,char b){
    return (char) (a+b);
  }
  public char subtraction(char a,char b){
    return (char) (a-b);
  }
  public char multiplication(char a,char b){
    return (char) (a*b);
  }
  public char divide(char a,char b){
    return (char) (a/b);
    }
  public char remainder(char a,char b){
    return (char) (a%b);
  }

  public static void main(String[] arg){
      char a,b;
      a='v';
      b='j';
      CharacterOperations characterOperators=new CharacterOperations();
      System.out.println(characterOperators.addition(a, b));
      System.out.println(characterOperators.subtraction(a, b));
      System.out.println(characterOperators.multiplication(a, b));
      System.out.println(characterOperators.divide(a, b));
      System.out.println(characterOperators.remainder(a, b));
    
        
    }   
}
