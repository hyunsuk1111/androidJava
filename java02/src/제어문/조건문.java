package 제어문;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		//먹고싶은 음식 : 아이스크림
		//아이스큼이면 뚜레주르
		//아이스커피 이디야
		///다른것이면 물마셔요
		//입력과 출력을 따로해야 좋은코드에요!
		
		String result = "";
		String food = JOptionPane.showInputDialog("먹고싶은 음식은?");
		
		if(food.equals("아이스크림")) {
			result = "뚜레쥬르!";
		}else if(food.equals("아이스커피")) {
			result = "이디야!!";
		}else {
			result = "물!";
		}
		System.out.println(result);
	}
}
