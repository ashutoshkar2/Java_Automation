package Tasks_1st_June;

public class Task1_ElementsOfAnArrayInReverseOrder {
    public static void main(String[] args) {
        String[] names= {"Amit","Ashutosh","Chirag","Jasmine"};
        //System.out.println(name[1]);

        //for (String name: names){
            //System.out.println(name);

        //Printing in Reverse Order

        for (int i=names.length;i>0;i--){
            System.out.println(names[i-1]);
        }
    }
}
