 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int  a=3;
		if( a > 3 && ++a>3 ){
			System.out.println("조건만족");
		}
		System.out.println("A=" + a );

		if( a > 1 || ++a > 3 ){
			System.out.println("조건만족");
		}
		System.out.println("A=" + a );

		// 일반논리에서 short curcuit logic 이 발생하기에 이진논리를 사용하기도 한다
	}

}
