package recursion;

import java.util.Scanner;

public class printNnames {
    public static void printNames(int n){
        if(n==0)
        {
            return;
        }
        System.out.println("Abhishek");
        printNames(n-1);

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        printNames(scanner.nextInt());
    }
}
