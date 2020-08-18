package 제어문;

public class 반복문3 {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				System.out.println(i+"은(는) 짝수");
				count++;
			}
			if(i%4 == 0) {
				count2++;
			}
		}
		System.out.println("총 갯수 : " + count);
		System.out.println("4의 베수 : " + count2);
	}
}
