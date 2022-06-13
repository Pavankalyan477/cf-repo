
import java.util.*;


class Arraylist{

    static String Search(List <String> list,String color){
        if(list.contains(color)){
            return "YES";
        }

        return "NO";

        //or
        // use forEach
        // for(String i:list){
        //     if(i.equals(color)){
        //         return "YES";
        //     }
        // }
        // return "No";
    }

    static List<String> Sort(List <String> list){
        Collections.sort(list);
        return list;
    }

    static List<String> Copy(List <String> list){
        List <String> numbers=new ArrayList<>(Arrays.asList("A","B","C","D"));

        System.out.println(numbers);

        Collections.copy(list, numbers);

        System.out.println(list + "Copied" + numbers);
        return list;

       
    }

    static List<String> Shuffle(List<String> list){
        Collections.shuffle(list);
        return list;
    }

    static List<String> Reverse(List<String> list){
        Collections.reverse(list);;
        return list;
    }

    static List<String> ExtractPortion(List<String>list){

        return list.subList(1, 3);
    }

    static List<String> Compare(List<String> list){
        List<String> str=new ArrayList<>(Arrays.asList("C","D","E","F"));

        List <String> ans=new ArrayList<>();

        for(String i:str){
            ans.add(list.contains(i)?"Yes":"No");
        }
        return ans;
    }

    static List<String> Swap(List<String>list){
        // to swap 1 and 3

    //    String temp=list.get(1);
    //     list.set(1,list.get(3));
    //     list.set(3,temp);

        // OR
        Collections.swap(list, 0, 3);

        return list;
    }

    static List<String> Join(List <String> list1, List <String> list2){

        list1. addAll(list2);

        return list1;

        // OR
        // List<String> list=new ArrayList<>();
        // list.addAll(list1);
        // list.addAll(list2);
        // return list;


    }

    static ArrayList<String> Clone(ArrayList <String> list1){
        //System.out.println(list1);

        ArrayList<String> list=(ArrayList<String>)list1.clone();

        return list;
    }

    static List<String> Empty(List <String> list){
        
        list.removeAll(list);
        return list;
    }

    static boolean CheckEmpty(List <String> list){
        return list.isEmpty();
    }


    static int Trim(ArrayList <String> list){
        list.trimToSize();
        return list.size();
    }

    static int Increse(ArrayList <String> list){
        list.ensureCapacity(6);
        return list.size();
    }

    static void Print(List <String> list){

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }




    public static void main(String[] args){

        // 1.  to create a new array list, add some colors (string) and print out the collection

        List <String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println(colors);

        // 2. to iterate through all elements in a array list.

        // normal looping
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

        // using forEach

        for(String str:colors){
            System.out.println(str);
        }

        // 3 . to insert an element into the array list at the first position.

        colors.add(0,"pink");
        colors.add(colors.size(),"Black");

        System.out.println(colors);

        // 4. to retrieve an element (at a specified index) from a given array list.

             // need 1st and n-1 position

        System.out.println(colors.get(1));
        System.out.println(colors.get(colors.size()-1));   


        // 5 . to update specific array element by given element.
    
            // update Yellow color at Green

        colors.set(3, "Yellow");
        
        System.out.println(colors);


        // 6. to remove the third element from a array list.

        colors.remove(3);
        System.out.println(colors);

        // 7. to search an element in a array list
        System.out.println(Search(colors,"Red"));
        System.out.println(Search(colors,"Black"));

        // 8. to sort a given array list

        System.out.println(Sort(colors));

        // 9. to copy one array list into another

       System.out.println(Copy(colors));

        // 10.to shuffle elements in a array list

        System.out.println(Shuffle(colors));

        //11 . to reverse elements in a array list
        System.out.println(Reverse(colors));

        // 12 . to extract a portion of a array list

        System.out.println(ExtractPortion(colors));

        // 13 . to compare two array lists

        System.out.println(Compare(colors));

        // 14. swap two elements in an array list.
        System.out.println(Swap(colors));

        // 15 .  to join two array lists.

        List<String> list=new ArrayList<>(Arrays.asList("a","b","c","d"));

        System.out.println(Join(colors, list));

        // 16. List <String> list1, List <String> list2
        ArrayList <String> color=new ArrayList<>();
        color.add("blue");
        color.add("red");
        color.add("green");
        //System.out.println(colors);

        System.out.println(Clone(color));


        // 17.  to empty an array list

        System.out.println(Empty(colors));

        //18. to test an array list is empty or not.

        System.out.println(CheckEmpty(colors));
        System.out.println(CheckEmpty(color));

        // 19 .  to trim the capacity of an array list the current list size

        System.out.println(Trim(color));

        // 20 .  to increase the size of an array list.

        System.out.println(Increse(color));

        // 21. to replace the second element of a ArrayList with the specified element.
        color.set(1,"Black");
        System.out.println(color);

        // 22. to print all the elements of a ArrayList using the position of the elements.
        Print(color);

    }
}