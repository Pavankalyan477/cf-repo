
import java.util.*;


class Arraylist{
    public static void main(String[] args){

        // 1.  to create a new array list, add some colors (string) and print out the collection

        List <String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println(colors);

        // 2. to iterate through all elements in a array list.
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}