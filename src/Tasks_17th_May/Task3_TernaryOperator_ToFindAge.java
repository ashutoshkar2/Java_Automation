package Tasks_17th_May;

import java.util.Scanner;

public class Task3_TernaryOperator_ToFindAge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(age >= 18 ? (age<65 ? "Adult" : "Senior") : "Minor");


    }
}
