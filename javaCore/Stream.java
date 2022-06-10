import java.util.*;
import java.util.stream.*;
import java.util.List;

class Stream {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 3, 4, 5,6,7,8);

        List<String> strs = Arrays.asList("Pavan", "Kalyan", "Kiran", "Raju");

        // Using map(), Finding Sqrt of numbers

        List<Integer> sqrt = nums.stream().map(x -> x * x).collect(Collectors.toList());

        System.out.println(sqrt);

        // Using filter(), finding even numbers

        Set <Integer> even=nums.stream().filter(x -> x%2==0).collect(Collectors.toSet());

        System.out.println(even);

        // Using filter(), Finding Strings
        List <String> st=strs.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());

        System.out.println(st);

        // Using Sorted() , Sorting the strings

        List <String> sortSt=strs.stream().sorted().collect(Collectors.toList());

        System.out.println(sortSt);

        // Using forEach(), Printing all the odd numbers

        nums.stream().filter(x -> x%2!=0).forEach(el -> System.out.print(el+" "));

        // using reduce(), printing even sum

        System.out.println();
        int value=nums.stream().filter(x -> x%2==0).reduce(0,(ans,i) -> ans+i);
        System.out.println(value);
    }
}