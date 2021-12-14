package exceptionStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int k = divide(i,j);
		System.out.println(k);
		System.out.println("종료");
	}

	public static int divide(int i, int j) {
		try {
			int k = i/j;
			return k;
		} catch(Exception e) {
			System.out.println("ERROR!!!");
			return 0;
		}
	}
}


주문 -> 포장 -> 영수증 출력 -> 배송 시작

[트랜잭션]
		
상품배송() {
	try {
	주문(),
	포장(),
	영수증(),
	배송시작()
	}catch(Exception e)
	"에러가 발생했습니다."
}


주문() throws Exception{


	}
	
포장(){

}
영수증(){
}
배송시작() {
}
}