package j20211213;

public class VariableExam {
    /* 변수의 영향 범위 

    전역 변수와 지역 변수
    */
    int a;  // 전역 변수의 사용은 지양하자 

    public void varTest(VariableExam testvar) {
        testvar.a++;
    }

    public static void main(String[] args) {
        // int a = 1;
        VariableExam testvar = new VariableExam();
        testvar.a = 1;
        testvar.varTest(testvar);
        System.out.println(testvar.a);
    }
}
