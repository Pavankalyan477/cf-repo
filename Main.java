
import java.util.*;

import javax.sound.sampled.SourceDataLine;
class Main{


//Exercise 6 //
public static void Delete(List<Integer>arr, int k){
    arr.remove(arr.get(k));
    System.out.println(arr);
}
//Exercise 7
public static void Search(List<Integer>arr , int element){
    if(arr.contains(element)){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
}

public static void Sort(List<Integer>unsorted){
    List<Integer>sorted = new ArrayList<>(unsorted);
    Collections.sort(sorted);
    System.out.println(unsorted);
    System.out.println(sorted);
    
}
public static void Shuffle(List<Integer>sorted){
    Collections.sort(sorted);
List<Integer> Shuffle = new ArrayList<>(sorted);
System.out.println("Un shuffled array is : "+sorted);
Collections.shuffle(Shuffle,new Random(5));
System.out.println("Shuffles array is : "+Shuffle);

}
public static void Reverse(List<Integer>sorted){
    List<Integer>reverse = new ArrayList<>(sorted);
    System.out.println(sorted);
    Collections.reverse(reverse);
    System.out.println(reverse);
}

public static void SubList(List<String>color){
List<String>sub_List = color.subList(0, color.size()/2);
System.out.println("Original"+color);
System.out.println("SubList is"+sub_List);


}
public static void Common(){
    ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          ArrayList<String> c2= new ArrayList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Pink");

          //Storing the comparison output in ArrayList<String>
          System.out.println(c1);
          c1.retainAll(c2);
          System.out.println(c1);
}


public static void Swap(){
    List<String>alpha = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
    //swapping the elemnts  a and d
//
System.out.println("Before swap "+alpha);
Collections.swap(alpha, alpha.indexOf("A"), alpha.indexOf("D"));
System.out.println("After swap  "+alpha);
    
}





public static List<String>Join(List<String>l1 , List<String>l2){
System.out.println("Before Joining"+l1);
l1.addAll(l2);

    return l1;
}

public static void Clone(ArrayList<String>names){
    ArrayList<String>cl = (ArrayList)names.clone();
    Collections.sort(cl);
    System.out.println("Unmodified"+names);
    System.out.println("Clone is modified"+cl);
}


public static void Empty(ArrayList<String>names){
    System.out.println("Before emptying : "+names);
    names.removeAll(names);
    System.out.println("After emptying : "+names);
}




public static void IsEmpty(){
List<Integer>num = new ArrayList<>();

for(int i = 1 ; i<=20 ; i++){
num.add(i);
}
System.out.println(num);
num.removeIf(n->(n%2==0));
System.out.println(num.isEmpty()+" "+num);
num.removeIf(n->(n%2==1));
System.out.println(num.isEmpty()+" "+num);

}


public static void Incr(){
    ArrayList<Integer> arr = new ArrayList<>(5);
   
    arr.add(0);
    arr.add(0);
    arr.add(0);
    arr.add(0);
    arr.add(0);
    System.out.println(arr.size());

    arr.ensureCapacity(10);
    
    arr.add(0);
    arr.add(0);
    arr.add(0);
    System.out.println(arr.size());
}

public static void replacing(ArrayList<Integer>nums,int index){
    System.out.println("Before replcement: "+nums);
nums.set(index , 11111);
    System.out.println("After replacement: "+nums);


}

public static void printAll(){
    List<Integer>num = new ArrayList<>();

for(int i = 1 ; i<=5 ; i++){
num.add(i);
}
for(int i :num){
    System.out.println("Index : "+num.indexOf(i)+" Element is : "+i);
}

}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
 public static void main(String[] args) {


System.out.println();
System.out.println();
    //Exercise creation of arrayList of strings//
    List<String>color = new ArrayList<>(Arrays.asList("Red","Blue","Green","Orange","White","Lilac"));
    List<Integer> numbers = new ArrayList<Integer>(){{  add(20);add(30) ;add(40) ;}};
    List<Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(20);
    arr.add(40);
    arr.add(80);
    arr.add(100);



//Exercise 2    Iterating over the elements//
System.out.println("Using for Each Loop");
for(int i :numbers){
    System.out.print(i+" ");
}
System.out.println();

System.out.println("Using index");
for(int i = 0 ; i<numbers.size();i++){
System.out.print(i+":"+arr.get(i)+" ");

}
System.out.println();
System.out.println("Using iterator");
Iterator<Integer>itr = numbers.iterator();
while(itr.hasNext()){

    System.out.print(itr.next()+" ");
}

System.out.println();

System.out.println("Exrercise 3 Inserting elment to firt index");
numbers.add(0 ,15 );
numbers.add(0,10);
System.out.println(numbers);
System.out.println();


 //Retrieving element say 20//
 System.out.println(arr.indexOf(20));
 System.out.println();
 System.out.println("Updating a particular elemnt");
 System.out.println(arr);
 //Say I updated elemnt 40
 arr.set(arr.indexOf(40),80);
 System.out.println(arr);
 System.out.println();
 
//Deleting kth elemnt//
int k = 3;
Delete(arr, k);
System.out.println();
//serch for element in array//
int element = 40;
System.out.println("Element to be searched : "+element);
Search(arr , element);
System.out.println();
List<Integer>unsorted = new ArrayList<>(){{add(100);add(-10);add(1);add(90);add(25);}};
//
Sort(unsorted);
List<Integer>sorted = new ArrayList<>(unsorted);
Collections.sort(sorted);
System.out.println();
//Shuffling
Shuffle(unsorted);
System.out.println();

//Reversing
Reverse(sorted);
System.out.println();
//Extracting sublist from the given list//
SubList(color);

System.out.println();
//Printing common elemnts of two arrayLists//
Common();
//Swapping two elements of a arrayList//
System.out.println();
Swap();

//Joining two arrays//
System.out.println();
List<String>l1 = new ArrayList<>(Arrays.asList("a","b","c","z","k","l"));
List<String>l2 = new ArrayList<>(Arrays.asList("1","2","c","3","4"));
System.out.println("After Joining"+Join(l1,l2));
System.out.println();

//Clonning the array//
ArrayList<String>names = new ArrayList<>(){{add("Kalyan");add("Pawan");add("Sonu");add("Akhil");}};
//Clone creates a clone of our orginal array and any modification done to clone wont affect the oridginal
Clone(names);
System.out.println();

//Emptying a list//
IsEmpty();
System.out.println();

//Trim to size()//ArrayList size will be trimmed to current List capacity//
ArrayList<Integer>nums = new ArrayList<>();
for(int i = 1 ; i<=20 ; i++){
    nums.add(i);
    }
//Here the arrayList is not bounded//
nums.trimToSize();
System.out.println(nums);
nums.add(21);//Array list will be bouned to 20//
System.out.println(nums);

//Increase the size//
Incr();

//Replacing specific index element //
replacing(nums,3);
System.out.println();

//Printing elements along with indexes//
System.out.println();
printAll();

}
}









    
 


