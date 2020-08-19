package 조건문;

import javax.swing.JOptionPane;

public class IfTest3 {

	public static void main(String[] args) {
		int ok = 0, no = 0, etc = 0;
		while (true) {
			String choice = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타, exit)종료");
			if (choice.equals("ok")) {
				System.out.println("긍정");
				ok++;
			} else if (choice.equals("no")) {
				System.out.println("부정");
				no++;
			} else if (choice.equals("etc")) {
				System.out.println("기타");
				etc++;
			} else if (choice.equals("exit")) {
				System.out.println("프로그램종료");
				System.out.println("긍정 횟수 : " + ok);
				System.out.println("부정 횟수 : " + no);
				System.out.println("기타 횟수 : " + etc);
				System.exit(0);
			}
		
		}
		
	}

}
