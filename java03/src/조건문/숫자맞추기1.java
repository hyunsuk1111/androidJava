package 조건문;

import javax.swing.JOptionPane;

public class 숫자맞추기1 {

	public static void main(String[] args) {
		int target = 88; // 정답 설정
		
		while (true) {
			//InputChoice1 에 입력 값 저장
			String InputChoice1 = JOptionPane.showInputDialog("수를 입력하세요 ");
			// String -> int 형변환
			int InputChoice2 = Integer.parseInt(InputChoice1);
			//target 과 InputChoice2 같다면 출력 후 종료
			if(target == InputChoice2) {
				System.out.println("정답) 축하합니다.");
				System.exit(0);
			}
			//target 과 InputChoice2 같지않다면 출력
			else {
				System.out.println("정답이 아닙니다.");
			}
		}
		
	}
}
