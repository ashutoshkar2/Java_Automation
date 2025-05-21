package Tasks_17th_May;

public class Task2_NestedTernary_ToFindMaxOfThreeNumbers {
    public static void main(String[] args) {

        int n1=591;
        int n2=100;
        int n3=12;

        int num= (n1>n2) ? (n1>n3) ? n1 : n3 : ((n2>n3) ? n2 : n3);

        System.out.println("The greater number is " + num);
    }
}

