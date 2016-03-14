package controlFlow_statements;

public class LabeledBreakStatement {

  public static void main(String[] args) {
    int[][] array = {{14,25,36,78,64},
        {1545,1254,789,624,3},
        {24,15,23,54,89},
        {19,32,65,75},
        {}
        };
    int searchFor = 19;
    boolean foundInt = false;
    int i;
    int j=0;
    
  search :
    for ( i=0;i<array.length;i++){
      for ( j=0;j<array[i].length;j++){
        if (searchFor == array[i][j]){
          foundInt=true;
          break search;
        }
      }
    }
    
    if(foundInt){
      System.out.println(searchFor+" is found at index "+i+" "+j);
    }
    else{
      System.out.println(searchFor+" is not found");
    }
    
  }

}
