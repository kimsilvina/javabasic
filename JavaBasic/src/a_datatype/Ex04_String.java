package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {
		
		String name;							// (1) 변수 선언
		name = new String("홍길숙");	// (2) 값 대입
		// String name = new String("홍길숙");
				
		String name2 = new String("홍길숙");
		
		System.out.println("당신의 이름은 " + name + "입니다");
		System.out.println("당신의 이름도 " + name2 + "입니다");
		
		// [1]
		if( name == name2) {
			System.out.println("이름이 동일합니다.");
		}

		// [2]
		else {
			System.out.println("이름이 다릅니다.");
		}
		
		// [3]
		if( name.equals(name2))  {
			System.out.println("이름이 동일합니다. ^^");
		}
		
	}

}
