package 조건문;

import javax.swing.JOptionPane;

public class 성별판별2 {

	public static void main(String[] args) {
		String ssn = JOptionPane.showInputDialog("주민번호입력 : ");
		//프로그램 언어로 문자를 char로 받을 수 있는 방법은 없다.
		//String 입려을 받아서 원하는 char 로 추출을함
		char index = ssn.charAt(7);
		String index2 = ssn.substring(7,8);
		switch (index2) {
		case "1": case "3":
			System.out.println("남");
			break;
		
		case "2": case "4":
			System.out.println("여");
			break;
			
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
			
			

		
	}

}
