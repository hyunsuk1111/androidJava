package 반복문;

import javax.swing.JOptionPane;

public class 연습예제 {

	public static void main(String[] args) {
		String InputNumber1 = JOptionPane.showInputDialog("첫번째 숫자");
		String InputNumber2 = JOptionPane.showInputDialog("두번째 숫자");
		String InputOperator1 = JOptionPane.showInputDialog("연산 기호(+,-,*,/)");
		
		int number1 = Integer.parseInt(InputNumber1);
		int number2 = Integer.parseInt(InputNumber2);
		char operator1 = InputOperator1.charAt(0);
		double result = 0;
		
		switch (operator1) {
		case '+':
			result = number1 + number2;
			break;
			
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
			
		case '/':
			result = (double)number1 / number2;
			break;

		default:
			System.out.println("기호를 잘못 입력하셨습니다.");
			break;
		}
		System.out.println("결과 : " + result);
		

	}

}
