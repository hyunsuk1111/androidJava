package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수 입력 , ctrl alt 화살표 아래 한줄복사 / alt 방향 이동 
		String InputNum1 = JOptionPane.showInputDialog("첫번재 수 입력 : ");
		String InputNum2 = JOptionPane.showInputDialog("두번째 수 입력 : ");
		
		//변환 및 덧셈
		int num1 = Integer.parseInt(InputNum1);
		int num2 = Integer.parseInt(InputNum2);
		int result = num1 + num2;
		
		//출력
		System.out.println("첫번 째 수 : "+num1);
		System.out.println("두번 째 수 : "+num2);
		System.out.println("더한 결과  : "+result);

	}

}
