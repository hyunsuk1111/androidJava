package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자4 {

	public static void main(String[] args) {
		
		Random r = new Random(); //아무거나 만들어주는 클래스
		int[] data = new int[100000];
		for (int i = 0; i < 100000; i++) {
			//변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)을 결정 
			data[i] = r.nextInt(100); // 0<r<100
		}
		for (int x : data) {
			System.out.println(x);
		}

	}

}
