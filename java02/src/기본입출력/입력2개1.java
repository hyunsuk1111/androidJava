package 기본입출력;



import javax.swing.JOptionPane;

public class 입력2개1 {

	public static void main(String[] args) {
	//2개의 숫자를 입력받아서 더해보세요
	String InputNum1 = JOptionPane.showInputDialog("첫번째 수 : ");
	String InputNum2 = JOptionPane.showInputDialog("두번째 수 : ");
	
	int num1 = Integer.parseInt(InputNum1);
	int num2 = Integer.parseInt(InputNum2);
	int result = num1 + num2;
	
	
	System.out.println("덧셈 결과 : " + result);
	
	}
	
	}

