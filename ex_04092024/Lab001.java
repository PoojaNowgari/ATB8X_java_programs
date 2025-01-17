package SEPT.ex_04092024;
import java.util.Scanner;

public class Lab001 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = n; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of a number"+ n +" is "+ fact);
    }




}
