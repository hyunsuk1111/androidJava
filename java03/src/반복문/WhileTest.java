package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		//계속 반복하고자 하는경우
		while (true) {
			
			System.out.println("내가 계속 돌아요");
			String Choice = JOptionPane.showInputDialog("계속하실래요 ? (y or n)");
			if(Choice.equals("n") || Choice.equals("no")) {
				System.out.println("프로그램종료");
				System.exit(0);
				//break;
				//while반복문을종료 while아래에 있는것들은 계속 실
				
			}
		}
//		System.out.println("내가 실행될까요");
		//제한된 횟수를 반복하고자 하는 경우
//		int i = 0;
//		while (i<10) {//조건식
//			System.out.println("내가10번돌아요");//실행
//			i++;//증감
//		}

	}

}
