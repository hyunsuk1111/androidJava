package 클래스만들기;

public class 우리가족계좌 {

	public static void main(String[] args) {
		계좌 account1 = new 계좌();
		account1.name = "홍길동";
		account1.AccountName = "튼튼적금";
		account1.money = 1000;
		
		계좌 account2 = new 계좌();
		account2.name = "박길동";
		account2.AccountName = "튼튼예금";
		account2.money = 2000;
		
		계좌 account3 = new 계좌();
		account3.name = "홍기사";
		account3.AccountName = "다음적금";
		account3.money = 3000;
		
		
		System.out.println("=====================");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("=====================");
		System.out.println(account1.name +"\t" + account1.AccountName + "\t" + account1.money);
		System.out.println(account2.name +"\t" + account2.AccountName + "\t" + account2.money);
		System.out.println(account3.name +"\t" + account3.AccountName + "\t" + account3.money);
		System.out.println("");
		account1.deposit();
		System.out.print(", ");
		account1.withdraw();
		System.out.println("");
		System.out.print("=> 아버지는 ");
		account1.deposit();
		System.out.print(" 딸은 ");
		account1.withdraw();
		
	}

}
