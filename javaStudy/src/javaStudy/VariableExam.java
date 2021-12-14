package javaStudy;

public class VariableExam {
	// global variable
	// 전역변수 - 변수의 선언 위치가 클래스 블록 안 이기 때문에 
	//          변수의 사용 범위는 클래스 전체가 된다. 
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		// local variable
		// 지역 변수 - 메서드 안에서 선언 
		//          변수의 사용 범위는 그 매서드로 제한된다. 
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		// static 변수는 static 을 선언하지 않은 매서드 내에서 는 사용을
		//해도 문제가 되지 않는다
	}
	
	public static void main(String[] args) {

		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		
		System.out.println(staticVal);

	}

}
