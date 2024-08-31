package a_datatype;

public class Ex02_Casting {

	public static void main(String[] args) {
		
		//* [ 기본 ] 변수의 자료형과 값의 자료형이 일치
		
		// 문자형에 정수를 대입하면?
		char  ch = 65;		
		System.out.println("ch의 값은 "+ch);

		// 정수형에 문자를 대입하면?
		int  su = 'B';
		System.out.println(su);	
		
		// 실수형 float에 실수를 대입하면?
		float f = 3.6F;	// 3.6은 double형이기에 에러 발생
							// 소문자 f도 가능
		System.out.println(f);
		
		// 실수형에 정수를 대입하면?
		// 원래는 (double)형 캐스팅을 하지만 생략해도 데이타가 변하지 않기에 사용안함
		double d = 100;
		System.out.println(d);
		
		// 정수형에 실수를 대입하면?
		//int num = 3.6;		// 에러발생
		int num = (int)3.6;
		System.out.println(num);
				
		// 정수형에 큰 수를 대입하면?
		int big = 1000000000;  // 여기서 0을 하나 더 추가하면 에러
		//	int -> long
		//long big2 = 10000000000;	// 에러 이유는?
		long big2 = 10000000000L;	// 10000000000l 소문자 l도 가능하지만 1과 혼동
		System.out.println(big2);
	}

}
