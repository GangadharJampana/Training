package acess_privileges;

public class SmartPhone extends PhoneClass{
  
  /*public SmartPhone(double height, double width, String company) {
    super(height, width, company);
  }*/
  
  public static void main(String[] args) {
    SmartPhone phone = new SmartPhone();
    System.out.println(phone.getHeight());
    SmartPhone nokia = new SmartPhone();
    System.out.println(nokia.getHeight());
    
  }
}
