package 조건문;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		int iu_cnt = 0, yoo_cnt = 0, bang_cnt = 0;
		while (true) {
			String choice = JOptionPane.showInputDialog("인기투표 선택해주세요(1:아이유 , 2: 유재석, 3:방탄, 4:종료)");
			if (choice.equals("4")) {
				System.out.println("종료합니다.");
				break;
			} else if (choice.equals("1")) {
				iu_cnt++;
				
			}else if(choice.equals("2")) {
				yoo_cnt++;
				
			}else if(choice.equals("3")) {
				bang_cnt++;
			}
		}//while
		System.out.println("투표를 종료합니다.");
		System.out.println("아이유 득표 수 : " + iu_cnt);
		System.out.println("유재석 득표 수 : " + yoo_cnt);
		System.out.println("방탄 투표 수 : " + bang_cnt);
	}

}
