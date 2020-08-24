package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제2 {

	public static void main(String[] args) {
		String[] arr = new String[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = JOptionPane.showInputDialog("입력");

		}
		System.out.println("**"+arr[0]+"보다는" + arr[1] +"**");

	}

}
