package 배열응용;

import java.util.Random;

public class 아무값중50보다큰값찾아보자 {

	public static void main(String[] args) {
		//0 ~ 99 까지의 값 1000개 중 50보다 큰 값들을 프린트
		Random r = new Random();//아무값
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		int count = 0;
		for (int j = 0; j < num.length; j++) {
			if (num[j]>= 80) {
				System.out.println(j +" : " + num[j]);
				count++;
			}
		}
		System.out.println(count);
		}

	}

