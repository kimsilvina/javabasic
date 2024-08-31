package b_operator;

public class Z_과제1_윤년 {
	public static void main(String[] args) {
		// 윤년구하기
				int year = 2100; // 숫자 변경할 예정
				if( (year%4==0) && (year%100!=0) || (year%400==0) ){
					System.out.println("윤년");
				}else{
					System.out.println("평년");
				}	


	}
}
