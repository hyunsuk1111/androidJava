package 반복문;

import javax.swing.JOptionPane;

public class 구구단 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				int result = i * j;
				System.out.println(i +" * "+ j +" = " + result);
			}
			System.out.println("\n");
		}
		
	}

}
