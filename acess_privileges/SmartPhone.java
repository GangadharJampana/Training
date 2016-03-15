package acess_privileges;

public class SmartPhone extends PhoneClass{
  
  public SmartPhone(double height, double width, String company) {
    super(height, width, company);
  }
  
  public static void main(String[] args) {
    SmartPhone phone = new SmartPhone(1, 3, "rt");
    System.out.println(phone.getHeight());
    SmartPhone nokia = new SmartPhone(2, 3, "nokia");
    System.out.println(nokia.getHeight());
    
  }
}
