package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자_예제 {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		int result = 0;
		Random r = new Random();
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = r.nextInt(100); 
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(i+1 + "번째 : " + array1[i]);
		}
//		for (int x : array1) {
//			System.out.println(x);
//		}
		System.out.println("--------------");
		result = array1[0] + array1[99];
		System.out.println("1번째 + 100번째 : " + result);

	}

}
