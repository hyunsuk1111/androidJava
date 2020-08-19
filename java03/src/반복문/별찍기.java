package 반복문;

import javax.swing.JOptionPane;

public class 별찍기 {

	public static void main(String[] args) {
		
		  //for문 2개 
//			for (int i = 0; i < 5; i++) {
//				{
//					for (int j = 0; j <= i; j++) {
//						System.out.print("*");
//					}
//					System.out.print("\n");
//				}
//				for (int i = 0; i < 4; i++) {
//					for (int j = 4; j > i; j--) {
//						System.out.print("*");
//					}
//					System.out.print("\n");
//				}
//			}
		//for문 1개
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= i; j++) {
				if (i > 4) {
					continue;
				}
				System.out.print("*");
			}
			System.out.print("\n");
			for (int k = 8; k > i; k--) {
				if (i < 4) {
					continue;
				}
				System.out.print("*");
			}

		}
	}

}
