package b_operator;

/**
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  
 *  [예] 0000 0010	<<1 		0000 0100
 *  	  0000 0010	>>1		0000 0001
 */
public class Ex04_Shift {

	public static void main(String[] args) {
		int  a = 4;	
		// int a = -4; 를 다시 확인
		int  b = a << 2;  // a*4
		int  c = a >> 1;  // a/2
		int   d = a >>> 1; // 양수만들기

		/**
		 *  << : 오른쪽에 0 채우기
		 *  >> : 왼쪽에 부호와 동일한 거 채우기
		 *  >>> : 왼쪽에 무조건 0 채우기
		 */
		
		System.out.println("a=" + a );
		System.out.println("b=" + b );
		System.out.println("c=" + c );
		System.out.println("d=" + d );


	}

}
