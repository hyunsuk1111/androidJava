package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제3 {

	public static void main(String[] args) {
		int target = 33; // 타겟 33
		int count = 0; // 33의 위치 확인 변수
		int[] arr  = {11,22,33,44};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] == target) {
				count = i + 1;
			}
		}
		System.out.println(target +"의 위치는 : " + count);
	}

}
