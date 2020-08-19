package 조건문;

import javax.swing.JOptionPane;

public class 출금시스템 {

	public static void main(String[] args) {
		int MyMoney = 0; // 잔액설정
		
		while (true) {
			//옵션 선택
			String choice = JOptionPane.showInputDialog("1)입금 2)출금 3)잔고 4)종료");
			// 1(입금) 이면
			if (choice.equals("1")) {
				//입금액 입력 > money1 에 저장(String)
				String money1 = JOptionPane.showInputDialog("입금액 입력 ");
				//money1 형변환 후 Mymoney += money 연산
				MyMoney += Integer.parseInt(money1);
			
				//2(출금)이면
			} else if (choice.equals("2")) {
				//출금액 입력 > money1 에 저장(String)
				String money1 = JOptionPane.showInputDialog("출금액 입력 ");
				//형변환
				int money2 = Integer.parseInt(money1);
				//잔액보다 출금액이 크면 출력 후 continue
				if (MyMoney < money2) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				//잔액보다 출금액이 작으면 출금
				MyMoney -= money2;
			//3(잔고) 이면 출력
			} else if (choice.equals("3")) {
				System.out.println("잔고는 : " + MyMoney + " 원");
			//4(종료) 이면 출력 후 종료
			} else if (choice.equals("4")) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("현재 잔고는 : " + MyMoney + " 원");
				break;
			//이외 숫자 입력 하면 출력
			} else {
				System.out.println("다시 입력해주세요.");
			}

		}
	}
}
