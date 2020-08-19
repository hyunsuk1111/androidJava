package 반복문;

import javax.swing.JOptionPane;

public class 연습예제2 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println("\n");
		}
		

	}

}
