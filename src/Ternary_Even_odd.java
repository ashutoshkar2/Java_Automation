public class Ternary_Even_odd {
    public static void main (String[] args){

        int num=16615;

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result + " number.");
    }
}
