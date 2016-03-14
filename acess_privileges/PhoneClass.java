package acess_privileges;

public class PhoneClass {
  private double height;
  private double width;
  private String company;
  
  public PhoneClass(double height,double width,String company){
    height = height;
    width = width;
    company = company;
    
  }
  
  public double getHeight(){
    return height;
  }
  public void setHeight(double newHeight){
    height = newHeight;
  }
  
  public double getWidth(){
    return width;
  }
  public void setWidth(double newWidth){
    width = newWidth;
  }
  
  public String getCompany(){
    return company;
  }
  public void setCompany(String newCompany){
    company = newCompany;
  }
}
