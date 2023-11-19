package recursion;

import java.util.Scanner;

public class factorial {
    public static int printNames(int n){
        if(n==1)
        {
            return 1;
        }
        return n * printNames(n-1);



    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(printNames(scanner.nextInt()));
    }
}
