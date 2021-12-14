package j20211213;

import java.util.Scanner;

public class ForExam {
    
    public static void main(String[] args) {
        
    int num = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Lines ? ");

    num = sc.nextInt();

    for (int j = 0; j < num ; j++) {
        for (int i = 0; i < num ; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}

    //'Lines ?'  3
    //*** 
    //*** 
    //*** 

    //'Lines ?'  5
    //***** 
    //***** 
    //***** 
    //***** 
    //***** 


}
