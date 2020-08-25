package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // 좌석마다 예매 상황을 저장할 공간
		int count = 0; // 자리 카운트
		int price = 10000;
		while (true) {
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i+1) + " ");
			}
			System.out.println();
			System.out.print("------------------------------" + "\n");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");

			}

			System.out.println();
			System.out.print("원하는 좌석을 입력 (종료 -1) >> ");
			int choice1 = scan.nextInt(); //1 ~ 10 입력
			
			//입력값이 -1 이면 프로그램 종료
			if (choice1 == -1) {
				System.out.println("프로그램 종료 !");
				break;
			//
			} else if (seat[choice1] == 0) {
				seat[choice1] = 1;
				System.out.println("에약을 완료하였습니다." + "\n");
				count++; // 예약 완료시 카운트 1씩 증가
			} else {
				System.out.println("자리가 매진되었습니다.." + "\n");
			}

		}
		System.out.println("총 "+count+"좌석이 예약되었습니다.");
		System.out.println("총 가격은 : " + (count * price));
	}
}
