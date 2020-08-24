package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자2 {

	public static void main(String[] args) {
		
		//String data= null, data2  = null, data3 = null;
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			//변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)을 결정 
			data[i] = JOptionPane.showInputDialog("취미입력 ");
		}
		for (String x : data) {
			System.out.println(x);
		}

	}

}
