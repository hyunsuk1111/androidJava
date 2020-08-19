package 조건문;

import javax.swing.JOptionPane;

public class 스티커가격맞추기 {

	public static void main(String[] args) {
		//스티커 개수, 스티커 가격, 노트개수, 노트 가격, 스티커합, 노트합, 총합 선언
		int sticker = 0, StiPrice = 3000, note=0, NotePrice=5000,
				result1 = 0, result2 = 0, result3 = 0;
		
		//스티커 개수 입력후 저장
		String InputSti = JOptionPane.showInputDialog("스티커 개수 ");
		//형변환
		sticker = Integer.parseInt(InputSti);
		//스티커 개수 * 가격 연산 후 result1 저장
		result1 = sticker * StiPrice;
		
		//노트 개수 입력 후 저장
		String InputNote = JOptionPane.showInputDialog("노트 개수 ");
		//형변환
		note = Integer.parseInt(InputNote);
		//노트 개수 * 가격 연산 후 result2  저장
		result2 = note * NotePrice;
		//노트 스티커 총합 저장
		result3 = result1 + result2;
		
		//출력
		System.out.println("스티커 개수 : " + sticker);
		System.out.println("스티커 가격 : " + StiPrice+"\n");
		System.out.println("노트 개수 : " + note);
		System.out.println("노트 가격 : " + NotePrice+"\n");
		System.out.println("스티커 총 가격 : " + result1);
		System.out.println("노트 총 가격 : " + result2);
		System.out.println("========================");
		
		//총 합이 25000 이상이면 할인가 적용
		if(result3>=25000) {
			result3 -= 3000;
			System.out.println("총 결재 금액 : " + result3 + " (25000이상이면 3000원 할인)");
		}else { // 총합이 25000 미만이면 할인가 미적용
			System.out.println("총 결재 금액 : " + result3 + " (25000이상이면 3000원 할인)");
		}
		
		

	}

}
