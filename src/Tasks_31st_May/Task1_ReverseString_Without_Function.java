package Tasks_31st_May;

public class Task1_ReverseString_Without_Function {
    public static void main(String[] args) {

        String str = new String("This sentence can be reversed");
        String rev = "";
        System.out.println(str.length());
        for(int i=str.length()-1;i>=0;i--){

            rev= rev+str.charAt(i);

        }
        System.out.println(rev);
    }
}
