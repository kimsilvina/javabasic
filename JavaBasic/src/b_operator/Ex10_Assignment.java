package b_operator;

/*
 *  연산자와 대입연산자를 합치기
 *  	- 산술, 이진논리, 쉬프트
 */
public class Ex10_Assignment {

	public static void main(String[] args) {
		
		int  a = 10;
		int  b = 7;

		// a = a + b 를 먼저 설명
		a+= b;
		System.out.println("+= 결과 : " + a );
		a-= b;
		System.out.println("-= 결과 : " + a );
		a*= b;
		System.out.println("*= 결과 : " + a );
		a/= b;
		System.out.println("/= 결과 : " + a );
		a%= b;
		System.out.println("%= 결과 : " + a );

		// shift 2진논리 연산자도 추가
		int i = 9, j = 7;
		i |= j;
		System.out.println(i);
		i ^= j;
		System.out.println(i);
		i &= j;
		System.out.println(i);

	

	}

}
