package 기본입출력;



import javax.swing.JOptionPane;

public class 입력2개3 {

	public static void main(String[] args) {
			
//	숫자 1개를 입력받고 문자 1개를 입력받아서 입력한 숫자 개수 만큼 문자를 프린트
	String InputNum1 = JOptionPane.showInputDialog("숫자를 입력하세요");
	String InputChar1 = JOptionPane.showInputDialog("문자를 입력하세요");
	int number1 = Integer.parseInt(InputNum1);
	 
	for(int i=0;i<number1;i++) {
		System.out.println((i+1)+" : "+InputChar1);
	}
	}
	
	}

