package 배열응용;

import java.sql.Array;
import java.util.Arrays;

public class 배열정렬3 {

	public static void main(String[] args) {
		String[] subject = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int[] score = { 100, 99, 77, 87, 66 };
		int[] score2 = score.clone();

		int count = 0; // 변경된 과목수

		double sum1 = 0;
		double sum2 = 0;
		score2[2] = 44; // 과학변경
		score2[4] = 55; // 영어변경

		System.out.println("국어 수학 과학 컴퓨터 영어");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < score2.length; i++) {
			sum1 += score[i];
			sum2 += score2[i];
			if (score[i] != score2[i]) {

				System.out.print("변경된 과목 : " + subject[i] + "\n");
				count++;
			}
			
		}
		System.out.println("변경된 과목의 수 : " + count);
		System.out.println("");
		if (sum1 > sum2) {
			System.out.println("평균이 높은 학기는 1학기");
		} else {
			System.out.println("평균이 높은 학기는 2학기");
		}

	}

}
