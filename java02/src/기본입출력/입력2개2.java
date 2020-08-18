package 기본입출력;



import javax.swing.JOptionPane;

public class 입력2개2 {

	public static void main(String[] args) {

	//숫자 입력을 2개 받아서 시작값 5, 종료값 1000이면 5 ~ 1000 프린트
	JOptionPane.showMessageDialog(null, "첫번째 수가 5, 시작값이 1000 이면 출력시켜줄게요");
	String InputNumber1 = JOptionPane.showInputDialog("첫번째 수 : ");
	String InputNumber2 = JOptionPane.showInputDialog("두번째 수 : ");
	
	int number1 = Integer.parseInt(InputNumber1);
	int number2 = Integer.parseInt(InputNumber2);
	
	if(number1 == 5 && number2 == 1000) {
		for(int i=number1;i<=number2;i++) {
			System.out.println(i);
		}
	}
	else{
		System.out.println("다시 확인해보세요");
	}
	}
	
	}

