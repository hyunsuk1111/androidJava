package 조건문;

import javax.swing.JOptionPane;

public class 숫자맞추기2 {

	public static void main(String[] args) {
		//비교연산자는 기본형 데이터만 사용할 수 있다.
		int target = 88; //정답설정

		while (true) {
			//choice1 에 입력 값 저장
			String choice1 = JOptionPane.showInputDialog("수를 입력하세요 ");
			//String -> int 형변환
			int choice2 = Integer.parseInt(choice1);

			//target 과 choice2 가 같다면 출력 후 종료
			if (target == choice2) {
				System.out.println("정답) 축하합니다.");
				break;
			//입력 값이 정답 보다 크면
			} else if (target < choice2) {
				System.out.println("정답보다 커요!");
			//나머지 -> 입력 값이 정답 보다 작으면
			} else {
				System.out.println("정답보다 작아요!");
			}
				
		}

	}
}
