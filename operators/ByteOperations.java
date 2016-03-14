package operators;

public class ByteOperations {
	public byte addition(byte a,byte b){
		return (byte) (a+b);
	}
	public byte subtraction(byte a,byte b){
		return (byte) (a-b);
	}
	public byte multiplication(byte a,byte b){
		return (byte) (a*b);
	}
	public byte divide(byte a,byte b){
		return (byte) (a/b);
	}
	public byte remainder(byte a,byte b){
		return (byte) (a%b);
	}
	
	public static void main(String[] arg){
		byte a,b;
		a=26;
		b=5;
		IntegerOperations byteOperators=new IntegerOperations();
		System.out.println(byteOperators.addition(a, b));
		System.out.println(byteOperators.subtraction(a, b));
		System.out.println(byteOperators.multiplication(a, b));
		System.out.println(byteOperators.divide(a, b));
		System.out.println(byteOperators.remainder(a, b));
		
		
	}

}
