package Tasks_31st_May;

public class Task4_FirstLetterOfEachWord_String {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");

        for(String word : words){
            if(!word.isEmpty()){
                System.out.println(word.charAt(0) + "");
            }
        }
    }
}
