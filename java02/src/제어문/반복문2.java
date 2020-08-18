package 제어문;

public class 반복문2 {

	   public static void main(String[] args) {
		      // 100부터 1까지 프린트
		   
		      int start = 100; // 시작값 (ram)
		      int end = 0; // 끝값(ram)
		      int minus = 1; // 감소값(ram)
		   // start(100)이 end(0)보다 작다면 종료 (cpu)
		      while (start > end) { 
		         System.out.println(start);
		         //start -= minus;
		         start--; //증감연산자
//		   		 start(100)와 minus(1) 씩 감소 후(cpu) start 에 저장(ram)
		      }
		      System.out.println("-------");
		      
		      // 5부터 10까지 프린트
		      int start1 = 5; // 시작값 (ram)
		      int end1 = 10; // 끝값(ram)
		      int add1 = 1; // 증가값(ram)

		      //start1(5) end1(10)보다 크면 종료(cpu)
		      while (start1 <= end1) { 
		         System.out.println(start1);
		         //start1 += add1;
		         start++;
		         //start1(5)와 add1(1) 씩 증가 후(cpu) start1 에 저장(ram)
		      }
		      System.out.println("-------");
		      // 1부터 100까지 2씩 증가하면서 프린트
		      int start2 = 1; // 시작값(ram)
		      int end2 = 100; // 끝값(ram)
		      int add2 = 2; // 증가값(ram)
		      
		      //start2(1) 가 end2(100) 보다 크면 종료(cpu)
		      while (start2 <= end2) {
		         System.out.println(start2);
		         start2 += add2;
		         //start2(1)와 add2(2) 연산 후(cpu) start2에 저장(ram) 
		      }
		      System.out.println("-------");
		   }
	}


