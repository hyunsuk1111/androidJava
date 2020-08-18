package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {
		String 가입id = "root";
		String 가입pw = "pass";

		String 로그인id = JOptionPane.showInputDialog("아이디입력 : ");
		String 로그인pw = JOptionPane.showInputDialog("패스워드입력 : ");
		
		
		if(가입id.equals(로그인id) && 가입pw.equals(로그인pw)) {
			//and 연산자 여러조건이 모두 true 일때
			//전체 논리적인 판단을 true 라고  판단하는경우
			System.out.println("로그인ok");
		}else {
			System.out.println("로그인not");
		}
						
	}

}
