package operators;

public class FloatOperations {
	public float addition(float a,float b){
		return a+b;
	}
	public float subtraction(float a,float b){
		return a-b;
	}
	public float multiplication(float a,float b){
		return a*b;
	}
	public float divide(float a,float b){
		return a/b;
	}
	public float remainder(float a,float b){
		return a%b;
	}
	public static void main(String[] args) {
		float a,b;
		a=347.6554f;
		b=56.545f;
		FloatOperations floatOperators=new FloatOperations();
		System.out.println(floatOperators.addition(a, b));
		System.out.println(floatOperators.subtraction(a, b));
		System.out.println(floatOperators.multiplication(a, b));
		System.out.println(floatOperators.divide(a, b));
		System.out.println(floatOperators.remainder(a, b));

	}

}
