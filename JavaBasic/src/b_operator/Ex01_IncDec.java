 package b_operator;

/**
 *  증가/감소 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		// [1]
		System.out.println("A=" + a + ", B= " + b);
		System.out.println("A=" + a+1 + ", B= " + b+1);  // 주의
		System.out.println("A=" + (a+1) + ", B= " + (b+1));		

		
		// [2]
		//a=a+1; b=b+1;
		//System.out.println("A=" + a + ", B= " + b);

		// [3]
		//@ 주석달고 하다가 나중에 모든 주석을 풀고 실행
		// 결과값을 먼저 예상하고 프로그램 실제 결과 확인하기
		a++; b--;
		System.out.println("A=" + a + ", B= " + b);
		
		++a; --b;
		System.out.println("A=" + a + ", B= " + b);
		
		int result = ++a;					// a=a+1;  int result = a;
		System.out.println( result );
		int result2 = a++;				// int result = a;  a = a+1;
		System.out.println( result2 );
		
		System.out.println("A=" + ++a + ", B= " + --b );
		System.out.println("A=" + a++ + ", B= " + b-- );
		
		System.out.println("A=" + a + ", B= " + b);



	}

}
