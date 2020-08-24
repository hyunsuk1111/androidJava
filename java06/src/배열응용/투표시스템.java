package 배열응용;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		int[] data = {0,0,0,0,0};
		int choice2 = 0;
		String[] names = {"블랙핑크","유재석","아이유","이효리","비"};
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("번호입력 0)블랙핑크, 1)유재석, 2)아이유, 3)이효리, 4)비");
			choice2 = Integer.parseInt(choice);
			if(!(choice2<0 || choice2>4)) {
				data[choice2]++;	
			}
			
		}
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(i + " 번은 " + data[i]+"표");
//		}
		int max = data[0];
		for (int  i = 0;  i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(names[i] + "는 " + data[i]+"표");
		}
		
		
	}

}
