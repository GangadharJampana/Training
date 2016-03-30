package acess_privileges;

public class UsingThisKeywordWithConstructor {
  public class Rectangle {
    private int width, height;
        
    public Rectangle() {
        this(1,1);
    }
    
    public Rectangle(int width, int height) {
        
        this.width = width;
        this.height = height;
    }
    private int getArea(){
      return height*width;
    }
    
  }
  
  public static void main(String[] args){
    
    /*Rectangle square = new Rectangle();
    System.out.println("area of square = "+square.getArea());*/
    UsingThisKeywordWithConstructor ex = new UsingThisKeywordWithConstructor();
    UsingThisKeywordWithConstructor.Rectangle rectangle = ex.new Rectangle();
    System.out.println("area of rectangle = "+rectangle.getArea());
    
  }
}
