package 영화예매배열;

import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int StuNum = 0;
		String name = null;
		int[] score1 = new int[2]; // 1학기 성적
		int[] score2 = new int[2]; // 2학기 성적
		int sum1 = 0; // 1학기 성적 합
		int sum2 = 0; // 2학기 성적 합

		while (true) {
			System.out.print("학번 입력 : ");
			StuNum = sc.nextInt();
			System.out.print("이름 입력 : ");
			name = sc.next();
			//1학기 중간,기말 성적 입력(2번반복)
			for (int i = 0; i < score1.length; i++) {
				System.out.print("1학기 성적(중간/기말) 입력 : ");
				score1[i] = sc.nextInt();
				sum1 += score1[i];
			}
			//2학기 중간,기말 성적 입력(2번반복)
			for (int i = 0; i < score2.length; i++) {
				System.out.print("2학기 성적(중간/기말) 입력 : ");
				score2[i] = sc.nextInt();
				sum2 += score2[i];
			}
			//1학기,2학기 성적이 동일한 경우
			if (sum1 == sum2) {
				System.out.println("1학기 성적과 2학기 성적 동일합니다.");
				System.out.println("");
			} else {
				//1학기 성적이 높을 경우
				if (sum1 > sum2) {
					System.out.println(name + " 은(는) 1학기 성적이 " + (sum1 - sum2) + " 점 더 높습니다.");
					System.out.println("");
				} else {//2학기 성적이 높을 경우
					System.out.println(name + " 은(는) 2학기 성적이 " + (sum2 - sum1) + " 점 더 높습니다.");
					System.out.println("");
				}

			}

		}

	}

}
