package 조건문;

import javax.swing.JOptionPane;

public class 부서확인 {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("사원번호입력 : ");
		String data1 = number.substring(0,1);
		String data2 = number.substring(1,4);
		//인덱스 1 ~ 3 범위 추출이면 substring(1,4) 써줌
		//endIndex는 3보다 1큰 4를 써줘야함
		switch (data1) {
		case "A":
			System.out.println("기획부");		
			break;
		case "B":
			System.out.println("총무부");			
			break;
		case "C":
			System.out.println("개발부");			
			break;

		default:
			System.out.println("해당 부서 없음");
			break;
		}
		System.out.println("사원 고유 번호는 : " + data2);
		
		
		
	}

}
