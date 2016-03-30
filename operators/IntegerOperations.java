package operators;

public class IntegerOperations {
	public int addition(int a,int b){
		return a+b;
	}
	public int subtraction(int a,int b){
		return a-b;
	}
	public int multiplication(int a,int b){
		return a*b;
	}
	public int divide(int a,int b){
		return a/b;
	}
	public int remainder(int a,int b){
		return a%b;
	}
	
	public static void main(String[] arg){
		int a,b;
		a=347;
		b=56;
		IntegerOperations integerOperators=new IntegerOperations();
		System.out.println(integerOperators.addition(a, b));
		System.out.println(integerOperators.subtraction(a, b));
		System.out.println(integerOperators.multiplication(a, b));
		System.out.println(integerOperators.divide(a, b));
		System.out.println(integerOperators.remainder(a, b));
		
		
	}
}
