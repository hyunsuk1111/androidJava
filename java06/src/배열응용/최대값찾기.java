package 배열응용;

public class 최대값찾기 {

	public static void main(String[] args) {
		int[] num = {55,11,22,99,33};
		//해당 인덱스까지의 최댁값을 저장해두기로함.
		int max = num[0];
		int min = num[0];
		int count = 0;
		int MaxCount = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최소값은 : "  + min);
		for (int i = 0; i < num.length; i++) {
			//이전까지의 최대값은 max에 들어있음
			//배열의 인덱스의 값을 하나씩 꺼내서 이전까지의
			//최대값보다 큰지 비교
			//해당 인덱스의 값이 이전까지의 최대값보다 더 크면
			//해당 인덱스의 값을 최대값 변수에 저장
			if(num[i] > max) {
				max = num[i];
				count = i+ 1;
				MaxCount++;
				//11 > 55 false => 55
				//22 > 55 false => 55
				//99 > 55 true => 99 *
				//99 > 33 false => 99 * 
			}
			System.out.println(num[i]);
		}
		System.out.println("최대값은 : " + max);
		System.out.println("최대값 위치는 : " + count);
		System.out.println("최대값 위치는 : " + MaxCount);
	}

}
