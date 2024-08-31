package a_datatype;

/* 주석 */
// 주석
/** 주석 */

public class Ex01_Naming {
	/**
	 *		자료형 
	 *		1- 기본형
	 *				논리형
	 *				문자형
	 *				정수형
	 *				실수형
	 * 		2- 참조형
	 * 				배열 / 클래스
	 */
	public static void main(String[] args) {

		
		
		// 문자형 변수  ch 선언하기
							// (1) 영어, 숫자, _, $ 조합한다
		char ch;			// ch2,  ch_2, ch$2, ch-2, ch 2,  2ch 변경해보기
							// 한글도 가능은 하다
		
		// 정수형 변수 abcdefz 선언하기
		int abcdefz;		// (2) 길이제한없다
							// (3) int나 case 같은 키워드는 안된다.
		
		// 실수형 변수 Ch 선언하기
		double  Ch;	// ch라고 하면 동일하기에 에러
							// 그러나 권장사항은 소문자로 시작한다
		
		//------------------ 값 대입하기
		ch  = '김';
		abcdefz = 100;	
		Ch = 0.3;
		
		// 논리형 변수 b 선언하고 true 값 대입하기(지정하기)
		boolean b;
		b = true;		
		// boolean b = true;
		
	}

}
