import java.util.*;
import java.util.stream.*;
import java.util.stream.Stream;



class Collection{

    public static void main(String[] args){

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List <Integer> list2=new ArrayList<>(Arrays.asList(7,8,9,0,10));
        List <Integer> list=new ArrayList<>();
        
        list1.addAll(list2);
        System.out.println(list1);
        list = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());

        System.out.println(list);

        
    }
}