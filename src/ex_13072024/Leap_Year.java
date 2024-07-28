package ex_13072024;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int Year = sc.nextInt();
        if(Year%4==0){
            System.out.println("Leap Year!!!");
        }else{
            System.out.println("Not a Leap Year!!!");
        }
    }
}
