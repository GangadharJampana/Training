package operators;

public class LongOperations {
	public long addition(long a,long b){
		return a+b;
	}
	public long subtraction(long a,long b){
		return a-b;
	}
	public long multiplication(long a,long b){
		return a*b;
	}
	public long divide(long a,long b){
		return a/b;
	}
	public long remainder(long a,long b){
		return a%b;
	}
	
	public static void main(String[] arg){
		long a,b;
		a=34765454;
		b=56654;
		LongOperations longOperationsrators=new LongOperations();
		System.out.println(longOperationsrators.addition(a, b));
		System.out.println(longOperationsrators.subtraction(a, b));
		System.out.println(longOperationsrators.multiplication(a, b));
		System.out.println(longOperationsrators.divide(a, b));
		System.out.println(longOperationsrators.remainder(a, b));
		
		
	}
}
