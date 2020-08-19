package 조건문;

public class 날짜확인 {

	public static void main(String[] args) {
		int month = 2;
		switch (month) {//정수(byte,short,int)
						//실수는x
						//문자,문자열(String)
		case 2:
			System.out.println("28일까지");
			break;
		
		case 5: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;

		default:
			System.out.println("31일까지");
			break;
		}
		
			
			

		
	}

}
