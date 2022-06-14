import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Stream {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        List<String> strs = Arrays.asList("Pavan", "Kalyan", "Kiran", "Raju");

        // Using map(), Finding Sqrt of numbers

        List<Integer> sqrt = nums.stream().map(x -> x * x).collect(Collectors.toList());

        System.out.println(sqrt);

        // Using filter(), finding even numbers

        Set<Integer> even = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());

        System.out.println(even);

        // Using filter(), Finding Strings
        List<String> st = strs.stream().filter(s -> s.endsWith("n")).collect(Collectors.toList());

        System.out.println(st);

        // Using Sorted() , Sorting the strings

        List<String> sortSt = strs.stream().sorted().collect(Collectors.toList());

        System.out.println(sortSt);

        // Using forEach(), Printing all the odd numbers

        nums.stream().filter(x -> x % 2 != 0).forEach(el -> System.out.print(el + " "));

        // using reduce(), printing even sum

        System.out.println();
        int value = nums.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(value);

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // int sum=arr.stream().reduce(0,(a,i) -> a+i);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(filtered);

        // Queue<Integer> pq = new LinkedList<>();
        // pq.add(10);
        // pq.add(20);
        // pq.add(15);
        // System.out.println(pq.peek());
        // System.out.println(pq.poll());
        // System.out.println(pq.peek());


        // For Random numbers, applying limit()....

        Random random=new Random();
        random.ints().limit(3).forEach(x->System.out.print(x+" "));

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        // printing distinct() of Square numbers...

        List<Integer> values= numbers.stream().map(i -> i*i).distinct().limit(2).collect(Collectors.toList());
        System.out.println(values);

        random.ints().limit(5).sorted().forEach(System.out::println);


        IntStream strm=Arrays.stream(arr);

        strm.forEach(System.out::println);

       // Stream<int[]> stream = Stream.of(arr);

       HashMap <String,Integer> map=new HashMap<>();
       map.put("books", 100);
       map.put("pens", 50);
       map.put("pencils",60);
       map.put("notes", 30)  ;
       
       Map<String,Integer> res=map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
       
       System.out.println(res);

       res.clear();
       res=map.entrySet().stream().filter(p -> p.getKey().equalsIgnoreCase("Pencils")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
       System.out.println(res);

       res.clear();
       int H=nums.stream().mapToInt(Integer::intValue).sum();

       int val=map.entrySet().stream().mapToInt(x ->x.getValue()).sum();
       System.out.println(val);

       Set <Integer> set=map.entrySet().stream().map(x -> x.getValue()*2).collect(Collectors.toSet());

       System.out.println(set);

    }

}