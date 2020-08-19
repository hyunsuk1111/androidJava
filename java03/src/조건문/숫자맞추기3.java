package 조건문;

import javax.swing.JOptionPane;

public class 숫자맞추기3 {

	public static void main(String[] args) {
		//정답, 시도 횟수, 실패 횟수 설정
		int target = 88, try1 = 0, fail1 = 0;
		
		//break와 만날때까지 while 문 반복
		while (true) {
			//choice1 에 입력 값 저장
			String choice1 = JOptionPane.showInputDialog("수를 입력하세요 ");
			//String(choice1) -> int 형변환
			int choice2 = Integer.parseInt(choice1);
			//시도 횟수 1 증가
			try1++;
			//정답과 입력값이 같으면 출력 후 종료
			if (target == choice2) {
				System.out.println("정답) 축하합니다.");
				break;
			//정답과 입력값이 같지 않다면
			}else { 
				//실패횟수 1증가 및 출력
				fail1++;
				System.out.println("정답이 아닙니다.!!");
				//정답 보다 입력값이 크면 출력
				if(choice2 > target) {
					System.out.println("너무 커요");
				//정답보다 입력 값이 작으면 출력
				}else {
					System.out.println("너무 작아요");
				}
			}			
			
		}//while 문 종료 시 출력
		System.out.println("틀린 횟수 : " + fail1);
		System.out.println("시도 횟수 : " + try1);

	}//main
}//class
