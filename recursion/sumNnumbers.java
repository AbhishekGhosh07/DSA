package recursion;

import java.util.Scanner;

public class sumNnumbers {
    public static void printNames(int n,int sum){
        if(n==0)
        {
            System.out.println(sum);
            return ;
        }
        sum = sum+n;

         printNames(n-1,sum);



    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        printNames(scanner.nextInt(), sum);
    }
}
