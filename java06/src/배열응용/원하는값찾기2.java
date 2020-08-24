package 배열응용;

import java.util.Random;

public class 원하는값찾기2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] number = new int[10];
		int max = number[0];
		int min = number[0];
		int count = 0;
		
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000); // 0 ~ 999 , -22
			if(max < number[i]) {
				max = number[i];
				count = i+1;
			}
		}
		for (int i = 0; i < number.length; i++) {
			
			if(min > number[i]) {
				min = number[i];
				
			}
			
		}
		
			
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + 1 + " : " + number[i]);
		}
		System.out.println("가장 작은  값 : " + min);
		System.out.println("가장 큰 값 : " + max);
		System.out.println("큰 수의 위치: " + count);
	}

}
