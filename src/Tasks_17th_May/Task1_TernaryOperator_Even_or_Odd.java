package Tasks_17th_May;

public class Task1_TernaryOperator_Even_or_Odd {
// Task-01: To find out even or odd number using ternary operator
    public static void main (String[] args){

        int num=16612;

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result + " number.");
    }
}


