package controlExam;

import java.util.*;

public class ifExam {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 > ");
		
		int player = scan.nextInt();
		int com = 1 + rand.nextInt(3);
		
		System.out.printf("당신은 {}이고 컴퓨터는 {}입니다.",player,com); 
		
		switch(player-com) {
		case 2: case -1:
			System.out.println("컴퓨터가 이겼습니다."); break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다."); break;	
		case 0:	
		}
		
		

		
/* 제어문 Control Statement - IF, Switch
 * 코드의 제일 위에서부터 아래로 한 문장식 순차적으로 진행되는
 * 프로그램의 흐름을 조절하여 일부분은 건너 뛰기도 하고 
 * 다시 위에서부터 내려올수 있게 제어한다.
 * 
 * if (score > 60) {
 * 	System.out.println("합격입니다.");
 * }
 */
//	  int score = 80;
//	  if (score > 60) { // 80 > 60 -> true
//		  	System.out.println("합격입니다.");
//		  }
//	}
	
/*(90 <= x && x <= 100) 점수 x가 90점 이상 100점 이하 동시만족
 * (x < 0 || x > 100) 점수 x가 0 미만 또는 x가 100초과 하나만 만족
 * x % 3== 0 && x % 2 != 0 x가 3의 배수이기는 하지만 2의 배수는 아닌 조건
 * depar == "영업부" || depar == "기획부" 영업부와 기획부만 조건
 * 
 */

//	if (false) {
//		System.out.println("welcome");
//		System.out.println("Hello");
//	}


/* if - else 구문
 * else는 그밖의 나머지 모든것...
 * 
 * 	if (조건식) {
 * 		true......
 * }else {
 * 		else......
 * }
 */
	
	
	/* if - else if구문
	 * if else 는 분기가 2개로 수행되는 구조 인반면 처리해야할 
	 * 경우의 수가 3개 이상이면 else if 구문을 사용한다. 
	 * 조건식을 만족하면 더 이상은 다른 조건식을 확인하지 않는다. 
	 * 
	 * 	if (조건식1) {
	 * 		true......
	 * 	}else if (조건식2) {
	 * 		true......
	 *  }else {
	 * 		else......
	 * }
	 * 
	 * 	if (조건식) {
	 * 		true......
	 *  }else {
	 * 		if (조건식 {
	 * 			true....
	 * 		} else {
	 * 			else....
	 * 		}
	 * }
	 * 
	 *Quiz2 점수를 입력 받아 
	 *		98이상이면 A+ 94이상이면 A 90이상 A- 
	 * 
	 * 
	 * Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//98이상이면 A+ 94이상 A 90이상 A-
		if (score>=90) {
		System.out.println(score>=98? "A+" : score>=94? "A" : "A-" );
		} else if(score>=80) {
		System.out.println(score>=88? "B+" : score>=84? "B" : "B-" );
		} else if(score>=70) {
		System.out.println(score>=78? "C+" : score>=74? "C" : "C-" );	
		} else if(score>=60) {
		System.out.println(score>=68? "D+" : score>=64? "D" : "D-" );	
		} else {
			System.out.println("F");
		}
		
		
		
		switch 구문
		if 문의 경우 항목이 많아질수록 복잡해지고 코드 가독성이 많이 떨어지게 된다.
		평균적인 처리시간도 항목이 늘어날 수록 길어지게 된다.  
		이러한 if문과 달리 switch 보다 간결하고 알아보기 쉽다. 
		보통 처리해야하는 경우의 수가 아주 많을 경우에 switch 
		switch 만든 모드 구문은 if 구현할수 있지만 if 만든 모든구문을
		switch 구현할수는 없다. 
		
		1. 조건식을 계산
		2. 조건식을 만족하는 case 문으로 이동한다. 
		3. 해당 case문의 구문들을 실행한다. 
		4. break 만나기 전까지는 모든 구문을 전부 실행한다. 
		*. switch 구문의 조건식의 결과는 정수 또는 문자열이다. 
	
	
	# 특정 월을 입력 받아서 3,4,5 봄 6,7,8 여름 9,10,11 가을 12,1,2 겨울
	  "?월의 계절은 ?입니다."
	  조건 : switch 구문의 총 줄의 수는 11줄 이내로 작성하시오. 
	  
	  Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String season="";
		switch(a){
		case 3: case 4: case 5:season="봄";break;
		case 6: case 7: case 8: season="여름";break;
		case 9: case 10: case 11:season="가을";break;
		case 12: case 1: case 2: season="겨울";break;
		}
		System.out.println(a+"월의 계절은 "+season+" 입니다.");

	  Quiz Switch 구문을 사용하여 가위(1) 바위(2) 보(3) 게임을 만드세요
	       컴퓨터의 경우는 난수를 발생 하여 처리 
	       
	  
	  가위(1) 바위(2) 보(3) 중 하나를 입력하세요> 1
	  당신은 1이고 컴퓨터는 2입니다.
	  컴퓨터가 이겼습니다. 
	  
	 가위(1) 바위(2) 보(3) 중 하나를 입력하세요> 1
	  당신은 1이고 컴퓨터는 3입니다.
	  당신이 이겼습니다. 
	  
	 가위(1) 바위(2) 보(3) 중 하나를 입력하세요> 1
	  당신은 1이고 컴퓨터는 1입니다.
	  비겼습니다. 
	  
	  Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 > ");
		
		int player = scan.nextInt();
		int computer = rand.nextInt(3)+3;
		
		int result = computer - player;
				
		String a = "";
		
		switch (result%3) {
		
		case 0 : a ="비겼"; break;
		case 1 : a = "졌"; break;
		case 2 : a = "이겼"; break;
				
		}
		
		System.out.println("당신은 "+player+"이고 컴퓨터는 "+computer%3+"입니다.");
		System.out.println("당신이 "+a+"습니다.");

		사람 - 컴
		com  1 가위     2바위     3 보           컴승 -1 or 2 
		사람                                              사람 승 1 -2
		 1     0     -1컴     -2사람       비김 0
         2     1사람      0    -1컴
         3     2컴         1사람   0
         
         
       Quiz  주민등록번호를 입력하세요 > 000000-0000000
            "당신은 남성입니다."
            "당신은 여성입니다."
            
            Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 > ");
		
		String a = scan.nextLine();
		
		char gender = a.charAt(7);
		
		System.out.println(gender);
		
		switch (gender) {
	
		case '1' : case '3' : 
			
			System.out.println("당신은 남성입니다.");
			
			break;
			
		case '2' : case '4' :
		
			System.out.println("당신은 여성입니다.");
			
			break;
			
		}

           
	 */	
		
		

	}
}

