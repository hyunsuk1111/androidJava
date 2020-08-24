package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제6 {

	public static void main(String[] args) {
		int[] arr = {66,77,88,99};
		int temp = 0 ;
		temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

}
