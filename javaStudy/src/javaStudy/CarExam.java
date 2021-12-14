package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		// 생성자는 받드시 1개 이상 존재 해야만 한다. 
		// 개발자가 만들지 않으면 자동으로 기본생성자 
		// default constructor를 자바가 만들어 준다. 
		
		
		// Car c1 = new Car();
		Car c2 = new Car("Grandeur");
		
		System.out.println(c2.name);


	}

}
