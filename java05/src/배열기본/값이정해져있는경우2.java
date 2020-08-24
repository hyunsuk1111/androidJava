package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		String[] name = new String[] {"정우","현석","민재"};
		int[] age = new int[] {26,20,25};
		char[] gender = new char[] {'M','W','M'};
		boolean[] bf = new boolean[] {true,false,true};
		double[] weight = new double[]{50.6,65.3,71.4};
		
		
//		for(int i=0;i<name.length;i++) {
//			System.out.println("이름 : " + name[i]);
//			System.out.println("나이 : " + age[i]);
//			System.out.println("성별 : " + gender[i]);
//			System.out.println("아침 : " + bf[i]);
//			System.out.println("몸무게 : " + weight[i]);
//			System.out.println("---------------");
//		}
		for (String x : name ) {
			System.out.println(x);
		}
		for (int x : age) {
			System.out.println(x);
		}
		for (char x : gender) {
			System.out.println(x);
		}
		for (boolean x : bf) {
			System.out.println(x);
		}
		for (double x : weight) {
			System.out.println(x);
		}
		
		
		
		
	}

}
