package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("입력"));
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
