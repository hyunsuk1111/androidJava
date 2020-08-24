package 배열기본;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 배열기본2 {

	public static void main(String[] args) {
		int[] temp = new int[7];
		//배열은 일반적으로 같은 타입을 묶을 때 사용
		//배열은 고정된 크기를 가진다.(크기 조절 불가능)
		//다양한 타입을 묶을 때는 배열을 쓰지 않음
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < temp.length; i++) {
			System.out.println("온도 입력  : ");
			temp[i] = sc.nextInt();		
		}
		System.out.println("온도 출력");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(i+1 +"일차 :"+temp[i]);
		}
		
	}

}
