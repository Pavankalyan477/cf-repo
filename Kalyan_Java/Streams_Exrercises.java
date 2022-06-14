package Kalyan_Java;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams_Exrercises {



    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,1,1,2,4,5,6,7,10,11,10000,12121);
        List<String> color = Arrays.asList("Red","Blue","Green","Black","White","Orange");


        //Applying map to get the squares of the elements//
        List<Integer>sq = nums.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("Original is : "+nums);
        System.out.println("After applying streams : "+sq);

        System.out.println();
        System.out.println();

        //Filtering all the strings that contain char e in them//
        List<String>common = color.stream().filter(i->i.contains("e")==true).collect(Collectors.toList());
        System.out.println(color);
        System.out.println(common);
System.out.println();
System.out.println();

//Converting a List to Frequency Map //
System.out.println(nums);
Map<Integer,Long>mp = nums.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(mp);

//Converting in[]arr to streams//
int[]arr = {1,2,3,4,5,6,7,8,9,-100};
IntStream a1 = Arrays.stream(arr);
//a1.forEach(i->System.out.print(i+1+" "));
//Stream<int[]> a2 = Stream.of(a1);
System.out.println();
//a2.forEach(i->System.out.print(i+" "));

//Get the min value from the list using streams//

  // System.out.println(a1.min());
   System.out.println(a1.reduce(Integer.MAX_VALUE,(ans,x)->Math.min(ans, x)));
   //
   Map<String, Integer> budget = new HashMap<>(); 
    budget.put("clothes", 120); 
    budget.put("grocery", 150);
    budget.put("transportation", 100);
    budget.put("utility", 130);
    budget.put("rent", 1150);
    budget.put("miscellneous", 90);
 Map <String , Integer>sorted = budget.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

System.out.println(sorted);
List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
//Performing sum using Stream.reduce()//
int sum = numbers.stream().reduce(0, (a,i)->a+i);
System.out.println("Sum of the stream is : "+sum);

System.out.println(numbers.stream().mapToInt(i->i.intValue()).sum());


Map<Integer,String>hm = new HashMap<>();
hm.put(1,"red");
hm.put(2,"blue");
hm.put(3,"green");
hm.put(4,"black");
hm.put(5,"white");
hm.put(6,"ornage");
hm.put(7,"magenta");


//Creating a new map that has only even keys//
Map<Integer, String>even = hm.entrySet().stream().filter(x->x.getKey()%2==0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
System.out.println("Even Integer map"+even);
Map<Integer, String>str =hm.entrySet().stream().filter(x->x.getValue().contains("e")==true).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

int summer =hm.entrySet().stream().mapToInt(x->x.getKey()).sum();
System.out.println(summer);


    }
    
}
