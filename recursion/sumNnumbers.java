package recursion;

import java.util.Scanner;

public class sumNnumbers {
    public static int printNames(int n){
        if(n==0)
        {
            return 0;
        }
        return n+ printNames(n-1);



    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.println(printNames(scanner.nextInt()));
    }
}
