package SEPT.ex_04092024;
import java.util.Scanner;

public class task2_30sep {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want table : ");
        int n=sc.nextInt();
        //10*1=10
        //10*2=20
        //.......
        //.......
        //10*10=100
        for( int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d",n,i,n*i);
        }


    }
}
