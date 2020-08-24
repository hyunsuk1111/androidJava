package 배열응용;

import javax.swing.JOptionPane;

public class 여러개의배열 {

	public static void main(String[] args) {
		String[] family = {"아버지","어머니","형","나","동생"};
		int[] age = new int[5];
		double[] height = new double[5];
		
		for (int i = 0; i < family.length; i++) {
			age[i] = Integer.parseInt(JOptionPane.showInputDialog("나이 입력 :"));
		}
		for (int i = 0; i < family.length; i++) {
			
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("키 입력 :"));
		}
		
		System.out.println("우리집 식구 정리");
		System.out.println("----------------");
		System.out.println("이름\t나이\t키");
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i] +"\t" + age[i] + "\t" + height[i]);
		}
	}

}
