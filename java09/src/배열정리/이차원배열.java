package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] seat = new int[3][5];
		seat[0][0] = 1;
		seat[1][2] = 1;
		seat[2][1] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;
	//베얄을 선언순간 공간이 할당
	//seat :  참조혀ㅕㅇ변수(주소)
	//int[3],[3] : 기버본형 변수(값)
	//배열ㅇ느 자동 초기화 int >
	System.out.println(seat.length);
	for (int i = 0; i < seat.length; i++) {
		for (int j = 0; j < seat[i].length; j++) {
			System.out.print(seat[i][j] + " ");
		}
		System.out.println("");
	}
	}

}
