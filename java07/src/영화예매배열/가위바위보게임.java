package 영화예매배열;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 전체 횟수, 비긴횟수, 컴퓨터 win, 내가 가위로,바위로,보자기로 이긴횟수
		int TotalCount = 0, same = 0, ComWin = 0, SWin = 0, RWin = 0, PWin = 0;
		// 가위0 바위1 보자기 2
//		int s = 0, r = 1, p = 2;
		Random ran = new Random();
		// 게임을 위한 while 문 break 시 종료!
		while (true) {

			System.out.print("가위0, 바위1, 보2 중 하나를 입력해주세요. [종료는 4] >> ");

			int me = sc.nextInt();
			int computer = ran.nextInt(3);
			if (me == 4) {
				System.out.println("게임 종료");
				System.out.println("");
				break;
			}
			
			if (me < 0 || me > 2) {
				System.out.println("*값을 올바르게 0)가위 , 1)바위, 2)보 입력해주세요*");
				System.out.println("");
			} else {
				TotalCount++;
				// 유저가 가위일때
				if (me == 0) {
					// 컴퓨터 가위
					if (computer == 0) {
						System.out.println("비겼습니다.");
						System.out.println("");
						same++;
					} else if (computer == 1) {
						System.out.println("유저가 졌습니다.");
						System.out.println("");
						ComWin++;
					} else {
						System.out.println("유저가 이겼습니다.");
						System.out.println("");
						SWin++;
					}
				}
				// 유저가 바위일때
				if (me == 1) {
					if (computer == 0) {
						System.out.println("유저가 이겼습니다.");
						System.out.println("");
						RWin++;
					} else if (computer == 1) {
						System.out.println("비겼습니다.");
						System.out.println("");
						same++;
					} else {
						System.out.println("유저가 졌습니다.");
						System.out.println("");
						ComWin++;
					}
				}
				if (me == 2) {
					if (computer == 0) {
						System.out.println("유저가 졌습니다.");
						System.out.println("");
						ComWin++;
					} else if (computer == 1) {
						System.out.println("유저가 이겼습니다.");
						System.out.println("");
						PWin++;
					} else {
						System.out.println("비겼습니다.");
						System.out.println("");
						same++;
					}
				}
			}
			 System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	            System.out.println("★★★★★★★★★★★★ Game Start★★★★★★★★★★★★★★");
	            System.out.println("게임 전체 횟수 " + TotalCount + "회");
	            System.out.println("컴퓨터 전체 승리 횟수 " + ComWin + "회");
	            System.out.println("나의 가위로 이깃 횟수 " + SWin + "회");
	            System.out.println("나의 바위로 이깃 횟수 " + RWin + "회");
	            System.out.println("나의 보로 이깃 횟수 " + PWin + "회");
	            System.out.println("게임 전체 비긴 횟수 " + same + "회");
	            System.out.println();
		}
	}

}
