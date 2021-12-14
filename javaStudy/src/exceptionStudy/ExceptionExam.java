package exceptionStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 0;
			try {
				int k = i/j;
				System.out.println(k);
			} catch(Exception e) {
				System.out.println("예외가 발생헀습니다.\n" + e.toString());
			} finally {
				System.out.println("예외 발생여부와 상관 없이 항상 실행");
			}
			
		
		System.out.println("main end!!");
	}

}
