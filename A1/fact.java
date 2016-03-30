package A1;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int fact=1;

		for( int i = 1;i < n; i++){
			fact=(i+1)*fact;
		}
		System.out.println(fact);
	}

}
