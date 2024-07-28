package ex_13072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab018 {

    static int a;
   static int b;
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st sides: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd sides: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd sides: ");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("This is an Triagle!!!");
        }else{
            System.out.println("Not a Triangle!!!");
        }
        check_Function();
        sc.close();
    }
public static void check_Function(){
    if(a == b && b== c){
        System.out.println("Equilateral");
    }else if(a==b && b==c && a==c){
        System.out.println("Isosceles");
    } else{
        System.out.println("scalene");
}
}

}
