package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		byte x = 100;
		int y = x;
		//큰 < 작 자동형변환
		
		int x1 = 300;
		byte y1 = (byte)x1;
		System.out.println(y1);
		//byte가 int를 포함할 수있는 범위 초과,300(-128~127)도 초과 > 강제형변환x

		
		double x2 = 400;
		int y2 = (int)x2;
		System.out.println(y2);
		//int가 double을 포함할 수 있는 범위 초과 > 강제형변환o
		
		int x3 = 400;
		double y3 = x3;
		//큰 < 작 자동형변환
		 
	}

}
