package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		창을 띄워서 입력을 받아보자
//		창을 띄워서 출력을 해보자
//		자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
//		특정한 일을 하는 전담하는 부품을 만들어, 특정한 처리를 할 때
//		부품을 지정함
		//키보드로 입력한 데이터 타입은 무조건 string
		//String 으로 저장된 데이터를 int/string 쓸지는 내가 결정
		//계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야함
		//숫자로 바꿔보자! 
		
	String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요 : ");
	// 키보드로 입력받아 자료형 변수(name)에 값을 저장하고 메모리에 올려놈
	System.out.println("당신의 이름은 : " + name);
	//cpu가 메모리에 저장된 name 변수를 가져와 "당신의 이름은 : name" 출력
	
	String age = JOptionPane.showInputDialog("당신의 나이는 : ");
	//키보드로 입력받아 자료형 변수(age)에 값을 저장하고 메모리에 올려놈
	int age2 = Integer.parseInt(age);
	//cpu가 age(문자열 자료형)를 정수형으로 변환하여 정수형 변수(age2)에 저장 후  
	//메모리에 저장
	int LastAge = age2 - 1;
	//cpu가 정수형 변수(age2) -1 연산 후 정수형 변수(LastAge)에 저장 후 메모리에 올림
	System.out.println("당신의 작년 나이는 : " + LastAge);
	//cpu가 메모리에서 LastAge 값을 가져와  "당신의 작년 나이는 : " + LastAge 출력
	
	}
	
	

}
