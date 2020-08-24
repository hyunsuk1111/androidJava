package 배열응용;

import javax.swing.JOptionPane;

public class 투표시스템2 {

	public static void main(String[] args) {
		int data = 0 ;
		int count = 0,count1=0,count2=0,count3=0,count4=0;
		String[] names = {"블랙핑크","유재석","아이유","이효리","비"};
		for (int i = 0; i < 10; i++) {
			data = Integer.parseInt(JOptionPane.showInputDialog("입력 "));
			if(data == 0) {
				count++;
			}else if(data==1) {
				count1++;
			}else if(data==2) {
				count2++;
			}else if(data==3) {
				count3++;
			}else if(data==4) {
				count4++;
			}
			
		}
		System.out.println("블랙핑크는 : " + count);
		System.out.println("유재석은 : " + count1);
		System.out.println("아이유는 : " + count2);
		System.out.println("이효리는 : " + count3);
		System.out.println("비는 : " + count4);
		
		
	}

}
