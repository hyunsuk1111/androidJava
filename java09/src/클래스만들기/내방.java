package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		휴대폰 p1 = new 휴대폰();
		//color size company 멤버변수 복사 > 자동초기화
		//참조형은 null , 기본형은 0 논리는 false
		//p1 변수생성 > 멤버변수들을 가르키는 주소가 들어감
		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";
		System.out.println("p1휴대폰의 색은 " + p1.color);
		System.out.println("p1휴대폰의 크기는 " + p1.size);
		System.out.println("p1휴대폰의 회사는 " + p1.company);
		p1.문자하다();
		
		
		System.out.println("==============");
		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강";
		p2.size = 11;
		p2.company = "애플";
		System.out.println("p2휴대폰의 색은 " + p2.color);
		System.out.println("p2휴대폰의 크기는 " + p2.size);
		System.out.println("p2휴대폰의 회사는 " + p2.company);
		p2.전화하다();
		System.out.println("================");
		
		Dog d1 = new Dog();
		d1.kind = "푸들";
		d1.weight = 4.7;
		d1.color = "흰색";
		System.out.println("강아지의 종류는 : " +d1.kind);
		System.out.println("강아지의 무게는 : " +d1.weight);
		System.out.println("강아지의 색깔은 : " +d1.color);
		d1.eat();
		d1.stroll();
		
		System.out.println("===============");
		Dog d2 = new Dog();
		d2.kind = "리트리버";
		d2.weight = 7;
		d2.color = "주황색";
		System.out.println("강아지의 종류는 : " +d2.kind);
		System.out.println("강아지의 무게는 : " +d2.weight);
		System.out.println("강아지의 색깔은 : " +d2.color);
		d2.eat();
		d2.stroll();
		
	}

}
