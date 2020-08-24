package 배열응용;

import java.util.Random;

public class 채점 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] array1 = new int[1000];
		int[] array2 = new int[1000];
		int count = 0;
		
		//문제,내정답 랜덤값 생성
		for (int i = 0; i < array1.length; i++) {
			array1[i] = r.nextInt(4);
			array2[i] = r.nextInt(4);
		}
		
		//문제,내정답 출력
		for (int i = 0; i < array1.length; i++) {
			System.out.println(i+1+"번째 문제 정답 : " + array1[i]);
			System.out.println(i+1+"번째 내 답 : " + array2[i]);
			System.out.println("==============");
			// 일치하면 정답출력, 맞은개수 증가
			if(array1[i] == array2[i]) {
				System.out.println("정답");
				System.out.println("=============");
				count++;
			//불일치하면 오답 출력
			}else {
				System.out.println("오답");
				System.out.println("=============");
			}
		}
		System.out.println("맞은 개수 : " + count);
	}

}
