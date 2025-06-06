package Tasks_31st_May;

public class Task5_CountNumberOfWords_String {
    public static void main(String[] args) {
        String sentence="Hello Ashutosh, How are you?";
        String[] word = sentence.split(" ");

        System.out.println("Total words: " + word.length);
    }
}
