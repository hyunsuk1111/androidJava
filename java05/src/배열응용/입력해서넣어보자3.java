package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자3 {

	public static void main(String[] args) {
		
		
		int[] data = new int[3];
		for (int i = 0; i < data.length; i++) {
			//변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)을 결정 
			String s = JOptionPane.showInputDialog("숫자입력 "); 
			data[i] = Integer.parseInt(s);
		}
		for (int x : data) {
			System.out.println(x);
		}

	}

}
