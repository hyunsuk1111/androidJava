package 기본입출력;



import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
//	//2개의 숫자를 입력받아서 더해보세요
//	String InputNum1 = JOptionPane.showInputDialog("첫번째 수 : ");
//	String InputNum2 = JOptionPane.showInputDialog("두번째 수 : ");
//	
//	int num1 = Integer.parseInt(InputNum1);
//	int num2 = Integer.parseInt(InputNum2);
//	int result = num1 + num2;
//	
//	JOptionPane.showMessageDialog(null, "덧셈 결과 : "+result);

	//숫자 입력을 2개 받아서 시작값 5개 종료값 1000이면 5 ~ 1000 프린트
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
			
	//숫자 1개를 입력받고 문자 1개를 입력받아서 입력한 숫자 개수 만큼 문자를 프린트
//	String InputNum1 = JOptionPane.showInputDialog("숫자를 입력하세요");
//	String InputChar1 = JOptionPane.showInputDialog("문자를입력하세요");
//	int number1 = Integer.parseInt(InputNum1);
//	 
//	for(int i=0;i<number1;i++) {
//		System.out.println((i+1)+" : "+InputChar1);
//	}
	}
	
	}

