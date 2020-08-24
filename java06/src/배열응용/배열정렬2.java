package 배열응용;

import java.sql.Array;
import java.util.Arrays;

public class 배열정렬2 {

	public static void main(String[] args) {
		int[] age = {99,10,100,88,33,24,10,77};
		//배열을 복사할때는 clone() 함수 사용! , 값을 복사
		//깊은복사 배열은 깊은 복사를 해야한다.
		//깊은복사를 해얗 배열은 따로따로 만들어 진다.
		int[] age2 = age.clone();
		for (int i : age) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		age2[0] = 999;
		for (int i : age2) {
			System.out.print(i + " ");
		}
		System.out.println("\n=========================");
		}
		
	}


