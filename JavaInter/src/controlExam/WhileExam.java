package controlExam;

public class WhileExam {

	public static void main(String[] args) {
		// While 반복문은 for에 비해서 구조가 간단하다. 
		// 조건식이 참일 동안 반복 수행한다. 
		// 조건식 생략 불가, 보통 조건식에 true를 넣어 무한 반복 수행
		// for(::)   while(true)
		// 무한 반복 설정 시에는 받드시 종료 조건을 만들어야 한다. 
		
		// while (조건식) {
		
		//    }
		
		
//		for(초기화;조건식;증감식)
//		for(int i=0;i<5;i++) {
//		  수행 문장	
//		}
//			
//		초기화int i=0
//		while(조건식i<5) {
//			수행문장
//			증감식i++
//		}
//		}
		
//		Quiz 1. while 문을 사용하여 카운트 다운을 하는 중간 중간 쉬었다가 
//   		        다음 카운트로 넘어가게 만드세요
//		카운트 다운 시작
//		10
//		9
//		8
//		7
//		6
//		5
//		4
//		3
//		2
//		1
//		Awesome!!!
		
//		System.out.println("카운트 다운 시작");
//		int i = 10;
//		while(i >= 1) {
//			System.out.println(i);
//			i--;
//			long j = 9_999_999_999L;
//			while(j >= 0) {
//				j--;
//			}
//		}
//		
//		System.out.println("Awesome!!!");

		
		//숫자를 입력하면 그 각각의 숫자들의 합을 계산하여 출력하세요 
//		숫자를 입력하세요.>321
//		각 자리수의 합 : 6
		
//		int num = 321;
//		int sum = 0;
//		
//		while(num !=0) {
//			sum += num % 10;
//			
//			num /= 10;
//		}
//		System.out.println(sum);
		
		
//		누적 합계를 원하는 숫자를 입력하세요 > 10
//		1 - 1
//		2 - 3
//		3 - 6
//		4 - 10
//		.
//		. 
//		. 
//		10 - 55
		
//		int num = 10; //input()
//		int i = 1;
//		int sum = 0;
//		
//		while (i <= num) {
//			
//			sum += i;
//			
//			System.out.println(i + "-" + sum);
//			i++;
//		}
		
		int i = 1;
		int sum = 0;
		while (i <= 10) {
	
		   sum += i;
		   System.out.println(i + "-" + sum);
		   i++;
		}

		
	}

}
