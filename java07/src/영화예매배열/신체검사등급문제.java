package 영화예매배열;

import java.util.Scanner;

public class 신체검사등급문제 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int score = 0;
	
	
	while(true) {

		System.out.print("주민번호 : ");
		String rrs = sc.next(); //주민번호
		System.out.print("키 : ");
		double height = sc.nextDouble();//키
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();//몸무게
		System.out.print("시력 : ");
		double sight = sc.nextDouble();
		System.out.print("병명 : 1)없음,2)평발,3)고혈압 : ");
		int trouble = sc.nextInt();
		double bmi = (weight / (height * height))/ 1000;
		
		//면제조건
		if(height < 150 || height > 190 || bmi > 30 || sight < 0) {
			System.out.println("");
			System.out.print(rrs.subSequence(0, 6)+"은(는) 면제입니다.");
			System.out.println("");
			continue;
		}else {
			//신장 가산점
			if(height > 150 && height < 190) {
				score += 20;
			}
			//몸무게 가산점
			if(weight > 35 && weight < 100) {
				score += 20;
			}
			//시력 가산점
			if(sight >= 1.0) {
				score += 30;
			}else if(sight >= 0.5) {
				score += 20;
			}else {
				score += 10;
			}
			//병명 가산점
			if(trouble==1) {
				score += 30;
			}else if(trouble==2) {
				score += 20;
			}else {
				score += 10;
			}
		}
		System.out.print(rrs.subSequence(0, 6)+"은(는) 40점 이상이므로 현역입니다.");
		System.out.println("점수 : " + score);
		System.out.println("");
		
	}

	}

}
