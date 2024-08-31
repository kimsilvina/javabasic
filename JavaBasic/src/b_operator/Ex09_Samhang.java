package b_operator;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		// 먼저 if 문으로 문제를 풀어보고 수정하자
		
//		int 	 score = 81;
//		String result = score > 80 ? "합격" : "불합격";
//		System.out.println( result + "입니다.");
		
		
		// a, b를 입력받아 두 수 중 큰 수를 출력
		// int max = ( a> b) ? a : b;
		
		int a = 1, b =2, c=3;
		int temp = 0;
		int max = ( temp = a > b?a : b) > c ? temp : c;
		System.out.println(max);
	}

}
