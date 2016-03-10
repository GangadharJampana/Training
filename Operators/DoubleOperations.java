package Operators;

public class DoubleOperations {
	public double addition(double a,double b){
		return a+b;
	}
	public double subtraction(double a,double b){
		return a-b;
	}
	public double multiplication(double a,double b){
		return a*b;
	}
	public double divide(double a,double b){
		return a/b;
	}
	public double remainder(double a,double b){
		return a%b;
	}

	public static void main(String[] args) {
		double a,b;
		a=347.6554;
		b=56.545;
		DoubleOperations doubleOperators=new DoubleOperations();
		System.out.println(doubleOperators.addition(a, b));
		System.out.println(doubleOperators.subtraction(a, b));
		System.out.println(doubleOperators.multiplication(a, b));
		System.out.println(doubleOperators.divide(a, b));
		System.out.println(doubleOperators.remainder(a, b));

	}

}
