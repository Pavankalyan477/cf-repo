
import java.util.*;
class Main{

 public static void main(String[] args) {
    //Exercise creation of arrayList of strings//
    List<String>color = new ArrayList<>(Arrays.asList("Red","Blue","Green"));
    List<Integer> numbers = new ArrayList<Integer>(){{  add(20);add(30) ;add(40) ;}};


//Exercise 2    Iterating over the elements//
System.out.println("Using for Each Loop");
for(int i :numbers){
    System.out.print(i+" ");
}
System.out.println();

System.out.println("Using index");
for(int i = 0 ; i<numbers.size();i++){
System.out.print(i+" ");

}
System.out.println();
System.out.println("Using iterator");
Iterator<Integer>itr = numbers.iterator();
while(itr.hasNext()){

    System.out.print(itr.next()+" ");
}


    }
 


}