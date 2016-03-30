package Operators;

public class ShortOperations {
	public short addition(short a,short b){
		return (short) (a+b);
	}
	public short subtraction(short a,short b){
		return (short) (a-b);
	}
	public short multiplication(short a,short b){
		return (short) (a*b);
	}
	public short divide(short a,short b){
		return (short) (a/b);
	}
	public short remainder(short a,short b){
		return (short) (a%b);
	}
	
	public static void main(String[] arg){
		short a,b;
		a=26645;
		b=5788;
		ShortOperations shortOperators=new ShortOperations();
		System.out.println(shortOperators.addition(a, b));
		System.out.println(shortOperators.subtraction(a, b));
		System.out.println(shortOperators.multiplication(a, b));
		System.out.println(shortOperators.divide(a, b));
		System.out.println(shortOperators.remainder(a, b));
		
		
	}
}
