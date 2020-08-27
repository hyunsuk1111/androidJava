package 배열정리;

public class 이차원배열3 {

	public static void main(String[] args) {
		int[][] score = new int[4][];
		int[] kor = {50,60,70,80,90};
		int[] math = {66,77,88};
		int[] eng = {90,80,70,60};
		int[] sci = {77,100};
		score[0] = kor;
		score[1] = math;
		score[2] = eng;
		score[3] = sci;
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
				
			}
			System.out.println("");
		}
	}

}
