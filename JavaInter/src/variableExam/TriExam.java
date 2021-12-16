package variableExam;

public class TriExam {

	public static void main(String[] args) {
/* 삼항 연산자 (조건)
 * 첫 번째 피연산자 조건식의 평가 결과에 따라 true 면 두번째 항 false면
 * 세번째 항의 값이 결과 된다. 조건식의 괄호는 필수는 아니다. 
 * 
 * 여러번 중첩하면 가독성 떨어지므로 꼭 필요한 경우에만 사용한다. 
 * 
(조건식) ? true : false

if (조건식) {
	true;
}else{
	false;
}


(조건식) ? "A" : (조건식) ? "B" : (조건식) ? "C" : "D"

if (조건식1) {
	"A";
}else if(조건식2){	
	"B";
}else if(조건식3){	
	"C";
}else{
	"D";
}

*/

// Quiz 1 삼항 연산자를 사용하여 
//		100점 미만 90점 이상이면 "A"
//		90점 미만 80점 이상이면 "B"
//		80점 미만 70점 이상이면 "C"
//		나머지 전부는 "D"
		
// System.out.println(a>=90?"A":a>=80?"B":a>=70?"C":"D");

//x = x + (y < x ? 1 : 2)	
		
		int x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;		
		absZ = z >= 0 ? z : -z;		
		
		signX = x > 0 ? '+': x == 0 ? ' ' : '-';
		signY = y > 0 ? '+': y == 0 ? ' ' : '-';
		signZ = z > 0 ? '+': z == 0 ? ' ' : '-';
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}

}
