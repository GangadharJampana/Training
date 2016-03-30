package PrimitiveTypes;

public class Declaration {
	public void byteDeclaration(){
		System.out.println("This is the declaration of byte:  byte variable");
		System.out.println("This is assigning value to byte variable:  variable=5");
		System.out.println("value range of byte is -128 to 127");
	}
	public void shortDeclaration(){
		System.out.println("This is the declaration of short:  short variable");
		System.out.println("This is assigning value to short variable:  variable=25234");
		System.out.println("value range of short is -32,768 to 32,767");
	}
	public void integerDeclaration(){
		System.out.println("This is the declaration of integer:  int variable");
		System.out.println("This is assigning value to integer variable:  variable=15232");
		System.out.println("value range of integer is -2^31 to 2^31-1");
	}
	public void longDeclaration(){
		System.out.println("This is the declaration of long:  long variable");
		System.out.println("This is assigning value to long variable:  variable=131232354");
		System.out.println("value range of long is -2^63 to 2^63-1");
	}
	public void floatDeclaration(){
		System.out.println("This is the declaration of float:  float variable;");
		System.out.println("This is assigning value to float variable:  float=45.467");
	}
	public void doubleDeclaration(){
		System.out.println("This is the declaration of double:  double variable;");
		System.out.println("This is assigning value to double variable:  variable=544.5458468");
	}
	public void booleanDeclaration(){
		System.out.println("This is the declaration of boolean:  boolean variable");
		System.out.println("This is assigning value to boolean variable:  variable=false");
		System.out.println("boolean has only two variables true or false");
	}
	public void charDeclaration(){
		System.out.println("This is the declaration of character:  char variable;");
		System.out.println("This is assigning value to character variable:  variable = 'g'");
	}
	
	
	public static void main(String[] arg){
		System.out.println("There are 8 primitive types in java");
		Declaration declarationTest = new Declaration();
		declarationTest.byteDeclaration();
		declarationTest.shortDeclaration();
		declarationTest.integerDeclaration();
		declarationTest.longDeclaration();
		declarationTest.floatDeclaration();
		declarationTest.doubleDeclaration();
		declarationTest.booleanDeclaration();
		declarationTest.charDeclaration();
		
		
	}
}
