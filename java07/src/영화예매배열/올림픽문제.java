package 영화예매배열;

import java.util.Scanner;

public class 올림픽문제 {

	public static void main(String[] args) {
		// 피겨 > 한국,중국,일본 입력
		// 금메달,은메달,동메달 카운트
		// 종목별 순위, 금메달 순으로 순위
		Scanner sc = new Scanner(System.in);
		// 국가별 5종목 점수를 위한 5 길이의 배열
		String[] game = { "피겨", "스키", "스피드스케이팅", "쇼트트랙", "스켈레톤" };
		int[] korea = new int[5];
		int[] china = new int[5];
		int[] japan = new int[5];
		// 인덱스 : 0 금메달, 1은메달, 2동메달
		int[] KMedal = new int[3];
		int[] CMedal = new int[3];
		int[] JMedal = new int[3];

		for (int i = 0; i < korea.length; i++) {
			System.out.println(game[i]);
			System.out.print("한국 점수 입력 : ");
			korea[i] = sc.nextInt();
			System.out.print("중국 점수 입력 : ");
			china[i] = sc.nextInt();
			System.out.print("일본 점수 입력 : ");
			japan[i] = sc.nextInt();
			
			// 점수 비교 , 한국이 금메달일 경우
			if (korea[i] > china[i] && korea[i] > japan[i]) {
				KMedal[0]++;
				// 중국이 은메달일 경우
				if (china[i] > japan[i]) {
					System.out.println(game[i]+"는 한국이 1등");
					System.out.println(game[i]+"는 중국이 2등");
					System.out.println(game[i]+"는 일본이 3등");
					System.out.println("");
					CMedal[1]++;
					JMedal[2]++;
					// 일본이 은메달일 경우
				} else {
					System.out.println(game[i]+"는 한국이 1등");
					System.out.println(game[i]+"는 일본이 2등");
					System.out.println(game[i]+"는 중국이 3등");
					System.out.println("");
					JMedal[1]++;
					CMedal[2]++;
				}
			}		
				// 점수 비교, 중국이 금메달일 경우
			if (china[i] > korea[i] && china[i] > japan[i]) {
				CMedal[0]++;
				// 한국이 은메달일 경우
				if (china[i] > japan[i]) {
					System.out.println(game[i]+"는 중국이 1등");
					System.out.println(game[i]+"는 한국이 2등");
					System.out.println(game[i]+"는 일본이 3등");
					System.out.println("");
					KMedal[1]++;
					JMedal[2]++;
					// 일본이 은메달일 경우
				} else {
					System.out.println(game[i]+"는 중국이 1등");
					System.out.println(game[i]+"는 일본이 2등");
					System.out.println(game[i]+"는 한국이 3등");
					System.out.println("");
					JMedal[1]++;
					KMedal[2]++;
				}
			}
					// 점수 비교, 일본이 금메달일 경우
			if (japan[i] > korea[i] && japan[i] > korea[i]) {
				JMedal[0]++;
				// 한국이 은메달일 경우
				if (korea[i] > china[i]) {
					System.out.println(game[i]+"는 일본이 1등");
					System.out.println(game[i]+"는 한국이 2등");
					System.out.println(game[i]+"는 중국이 3등");
					System.out.println("");
					KMedal[1]++;
					china[2]++;
					// 중국이 은메달일 경우
				} else {
					System.out.println(game[i]+"는 일본이 1등");
					System.out.println(game[i]+"는 중국이 2등");
					System.out.println(game[i]+"는 한국이 3등");
					System.out.println("");
					CMedal[1]++;
					KMedal[2]++;
				}
			}
				
			}
		System.out.println("");
		System.out.println("각 국 메달 출력");
		System.out.println("----------------");
		System.out.println("한국 금메달 : " + KMedal[0]);
		System.out.println("한국 은메달 : " + KMedal[1]);
		System.out.println("한국 동메달 : " + KMedal[2]);
		System.out.println("----------------");
		System.out.println("중국 금메달 : " + CMedal[0]);
		System.out.println("중국 은메달 : " + CMedal[1]);
		System.out.println("중국 동메달 : " + CMedal[2]);
		System.out.println("----------------");
		System.out.println("일본 금메달 : " + JMedal[0]);
		System.out.println("일본 은메달 : " + JMedal[1]);
		System.out.println("일본 동메달 : " + JMedal[2]);
		System.out.println("----------------");
		
		//한국이 1등일 경우
		if(KMedal[0] >  CMedal[0] && KMedal[0] > JMedal[0]) {
			if(CMedal[0]>JMedal[0]){
				System.out.println("한국 1등");
				System.out.println("중국 2등");
				System.out.println("일본 3등");
			}else {
				System.out.println("한국 1등");
				System.out.println("중국 2등");
				System.out.println("일본 3등");
			}
			
			
		}
		System.out.println("");
		if(CMedal[0] >  KMedal[0] && CMedal[0] > JMedal[0]) {
			if(KMedal[0] > JMedal[0]) {
				System.out.println("중국 1등");
				System.out.println("한국 2등");
				System.out.println("일본 3등");
			}else {
			System.out.println("중국 1등");
			System.out.println("일본 2등");
			System.out.println("한국 2등");
		}
		}
		System.out.println("");
		if(JMedal[0] >  CMedal[0] && JMedal[0] > KMedal[0]) {
			if(CMedal[0] > KMedal[0]) {
			System.out.println("일본 1등");
			System.out.println("중국 2등");
			System.out.println("한국 3등");
		}else {
			System.out.println("일본 1등");
			System.out.println("중국 2등");
			System.out.println("한국 3등");
		}

	}
}
}
