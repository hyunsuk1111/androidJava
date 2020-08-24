package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제5 {

	public static void main(String[] args) {
		int[] arr = {66,77,88,99};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("최대값은 : " + max);
		
	}

}
