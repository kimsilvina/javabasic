package b_operator;

public class Z_과제2_3수중큰수 {

	public static void main(String[] args) {
		
		int num2 = 0;
		int a = 3, b = 4, c = 5;
		
		if( a>b ^ a>c) num2 = a;
		else if( b>a ^ b>c) num2= b;
		else num2=c;

	}

}
