package 데이터;

public class 문자열 {
// 코드 자동 정리 ctrl shift f
	public static void main(String[] args) {
//		기본데이터는 아닌데 ,사람들이 많이쓰는 데이터의 형태이므로 
//		기본데이터처럼 쓰게 해놓은 문자열을 나타내는 키워드 : String
		String name = "어정우";
//		String은 name 이라는 변수에 들어갈 데이터의 유형
//		data type(자료형)
		String company = "네이버";
		System.out.println(name + " 는 " +company+" 소속이다.");
//		+하나라도 string 이면 모두다 string 결합의 의미
		
		int age = 100;
		System.out.println(name + "의 나이는 " + age);
		
		String subject; //선언! => 메모리가 할당
		subject = "java"; //값을 넣음, 대입연산자, 항당연산자(=)
		System.out.println(subject);
		
		String day;
		//System.out.println(day);//쓰레기값 상태의 경우 연산x 출력x
		
	}
}
