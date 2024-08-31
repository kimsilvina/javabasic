package b_operator;

/*
 *  논리연산자의 상태를 먼저 확인
 *  
 *  	- 일반논리 : && ||  
 *      - 이진논리 : & |  ^
 *      
 *      A   B      A && B        A || B
 *      0	 0			0			0
 *      0	 1			0			1
 *      1	 0			0			1
 *      1	 1			1			1
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
		int 성적 = 75;
		char 태도 = 'A';
		
		if( 성적 >=80 || 태도 == 'A'){
			System.out.println("성적이 80점이상거나 태도가 A이면 우등생입니다.");
		}
		
		if( 성적 >= 80  && 태도 == 'A' ){
			System.out.println("성적이 80점이상이고 태도가 A이면 성적향상반입니다");
		}
		
		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
			
			[*] Scanner를 통해 문자 하나를 어떻게 입력받을까?
				String > charAt() 이용
				
 		 */


	}

}
