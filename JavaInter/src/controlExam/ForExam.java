package controlExam;

public class ForExam {

	/*
	 * For 반복문 : 어떤 작업을 반복적으로 수행되도록 할 때 사용 반복 횟수를 정확히 특정할 때 주로 사용된다. 문법이 직관적이라 가독성이
	 * 좋다. for (start ; stop ; step) 초기값 조건식 증감식
	 * 
	 * 
	 * 초기값 -> 조건식 -> 수행 문장들....-> 증감식 -> 조건식 -> 수행 문장들....-> 증감식 -> 조건식 -> 수행
	 * 문장들....-> 증감식 -> 조건식 -> 종료
	 * 
	 * 초기값 : 반복문에 사용할 변수를 초기화 처음에 딱 한번만 실행된다. 보통은 변수를 하나만 사용하지만 2개 이상도 사용 가능하다.
	 * 
	 * for(int i=1, j=0; i<10; i++){}
	 * 
	 * 조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가 거짓이 되는경우 반복 종료한다. 조건식을 잘못 설정할 경우 한번도 실행되지 않는
	 * 경우가 발생할 수도 있고 영원히 반복되는 경우가 발생할 수 있다. (무한루프)
	 * 
	 * 증감식: i++ , i--, i+= 2(i = i + 2)
	 * 
	 * 초기값, 조건식, 증감식 전부 혹은 하나도 생략 가능하다. for (;;) 무한 반복....
	 * 
	 * quiz 1부터 5까지를...
	 * 
	 * 1 2 3 4 5 12345
	 */

	public static void main(String[] args) {
//		
//		for(int i = 1 ; i <= 5 ; i++) {
//			System.out.println(i);
//		}
//		for(int i = 1 ; i <= 5 ; i++) {
//			System.out.print(i);
//		}

//	1부터 10까지의 합을 출력하시오. 단 누계 값 까지 출력하세요
//	
//	1부터 1까지의 합: 1
//	1부터 2까지의 합: 3
//	1부터 3까지의 합: 6
//		int sum = 0;
//		for(int i = 1 ; i <= 10 ; i++) {
//			System.out.printf("1부터 %d까지의 합: %d%n",i,sum += i);
//		}
//		

//		1			10
//		2			9
//		3			8
//		4			7	
//		5			6
//		6			5
//		7			4
//		8			3
//		9			2
//		10			1

//		for (int i = 1, j = 10 ; i <= 10 ; i++, j--) {
//			System.out.printf("%d \t %d\n", i, j);
//		}

		// 구구 단을 출력하세요

//		2 * 1 = 2		2 * 2 = 4 .....
//		3 * 1 = 3   	3 * 2 = 6 .....
//		.
//		. 
//		9 * 1 = 9 ...

//	for (int i = 2 ; i <= 9 ; i++) {
//		for (int j = 1; j <= 9 ; j++) {
//			System.out.printf("%d * %d = %d\t", i, j, i*j);
//		}
//		System.out.println();
//	}

		// *을 출력할 라인의 수를 입력하세요 > 5

//		*
//		**
//		***
//		****
//		*****

//		int num = 5;
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		*****
//		****
//		***
//		**
//		*

		
//		int num = 5;
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
// 향상된 for 구문 - for each
		
//		for (타입 변수명 : 배열 또는 컬렉션) {
//			
//		}
		
		int[] arr = {1,2,3,4,5};
		
		//		1
		//		2
		//		3
		//		4
		//		5
		
//		for (int i = 0; i < arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		int sum = 0;
		int count = 0;
		for (int i : arr) {
			System.out.println(i);
			sum += i;
			count++;
		}
		 System.out.printf("총합은 %d입니다.\n",sum);
		 System.out.printf("갯수는 %d입니다.\n",count);

	}
}
