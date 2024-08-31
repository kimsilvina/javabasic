package a_datatype;

public class Ex04_StringSpcial {

	public static void main(String[] args) {
		
		String hong = "홍길동";
		String dong = "홍길동";
		
		System.out.println(hong);
		System.out.println(dong);

		if( hong == dong) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		
		if( hong.equals(dong) ) { 
			System.out.println("문자열이 같다");
		}else {
			System.out.println("문자열이 다르다");
		}
		
		
		
	}

}
