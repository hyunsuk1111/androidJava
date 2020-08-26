package 영화예매배열;

import java.util.Scanner;

public class 영화예매배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][10];
		int count = 0; // 예매된 좌석 개수
		int price = 10000; // 좌석의 가격
		Scanner sc = new Scanner(System.in);
//		System.out.println(arr.length);   >> arr의 length = 0
//		System.out.println(arr[0].length); >> arr[0]의 length = 10
//		System.out.println(arr[1].length); >> arr[1]의 length = 10
//		System.out.println(arr[2].length); >> arr[2]의 length = 10

		while (true) {
			System.out.println("-----------------------------");
			
			// 1 ~ 10 열 표현
			for (int j = 0, i = 0; j < arr[i].length; j++) {
				System.out.print("  " + (j + 1));
			}

			System.out.println("");
			System.out.println("-----------------------------");
			// 3행 10열 표현 중첩 for문
			for (int i = 0; i < arr.length; i++) {
				System.out.print((char)(i+65)+" ");
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "  ");
				}
				System.out.println("");
			}
			System.out.println("원하시는 좌석을 말씀해주세요 ex)(A~C)행/(1~10)열 /-1 프로그램 종료");
			System.out.print("좌석 입력 : ");
			String scol = sc.next(); //문자열 입력 후 인덱스 0번째 값을 char 로 변환
			char col = scol.charAt(0); // 행입력
			
			// -1 입력 시 종료
			if (scol.equals("-1")) {
				System.out.println("");
				System.out.println("프로그램종료");
				break;
			}
			int row = sc.nextInt(); // 열입력
			// 입력값 범위를 벗어나면 , col 값을 int 형으로 치환 후 비교
			if ((int)col < 65 || (int)col > 68 || row <= 0 || row > 10) {
				System.out.println("값을 다시 입력하세요");
				System.out.println("");
				// 입력값 행(1~3) / 열(1~10) >> 행인덱스(0~2) / 열인덱스(0~9) 이므로 -1
			} else if (arr[col - 65][row - 1] == 0) {
				System.out.println("예매가 완료되었습니다.");
				System.out.println("");
				arr[col - 65][row - 1] = 1;
				count++; //예매 완료 시 count 증가
			} else {
				System.out.println("자리가 매진되었습니다.");
				System.out.println("");
			}

		}
		//count , 가격 출력
		System.out.println("총 예매된 좌석 수 : " + count);
		System.out.println("총 가격 : " + (count * price));

	}

}
