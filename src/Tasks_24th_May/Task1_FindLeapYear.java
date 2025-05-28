package Tasks_24th_May;

import java.util.Scanner;

public class Task1_FindLeapYear {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month=sc1.nextInt();

        if (year%4 == 0) {
            switch(month) {

                case 1,3,5,7,8,10,12:
                    System.out.println("This month has 31 days!");
                    break;
                case 4,6,9,11:
                    System.out.println("This month has 30 days!");
                    break;
                case 2:
                    System.out.println("This month has 29 days!");
                    break;
                default:
                    System.out.println("Enter a valid month number!");
                    break;
            }
            System.out.println(year + " is a leap year!");
        }
            else{
            switch(month) {

                case 1,3,5,7,8,10,12:
                    System.out.println("This month has 31 days!");
                    break;
                case 4,6,9,11:
                    System.out.println("This month has 30 days!");
                    break;
                case 2:
                    System.out.println("This month has 29 days!");
                    break;
                default:
                    System.out.println("Enter a valid month number!");
                    break;
            }
                System.out.println(year + " is not a leap year!");

        }

    }
}
