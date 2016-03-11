package ControlFlowStatements;

public class ContinueStatement {
  public static void main(String[] arg){
    
    String s = "dfnmbafdsbfsdbfsdgaf";
    int length = s.length();
    int num=0;
    
    for (int i=0;i<length;i++){
      if (s.charAt(i) != 'f'){
        continue;
        
      }
      num++;
    }
    
    System.out.println(num);
  }
}
