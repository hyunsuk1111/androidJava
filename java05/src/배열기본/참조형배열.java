package 배열기본;

public class 참조형배열 {

	public static void main(String[] args) {
		String[] names = new String[2];
		names[0] = "홍길동";
		names[1] = "김길동";
		//출력할때 많이 사용해요
		for (String x : names) {
			System.out.println(x);
		}
		//System.out.println("개수 : " + names.length);

	}

}
