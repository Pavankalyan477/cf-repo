package Kalyan_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Hash_Maps {

    public static void Copy(HashMap<Integer, String>hm1,HashMap<Integer, String>hm2){
        System.out.println();
System.out.println("Before joining : ");
printAll(hm1);
//printAll(hm2);
hm1.putAll(hm2);
System.out.println();
System.out.println("After Joining");
printAll(hm1);
System.out.println();



    }
public static void printAll(  HashMap<Integer, String>hm){
for(Map.Entry x :hm.entrySet()){
    System.out.println(x.getKey() +":"+x.getValue());
}
}

public static void Contains(HashMap<Integer, String>hm,int k , String s){
    if(hm.containsKey(k)&&hm.get(k).equals(s)){
    System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}



    public static void main(String[]args){
        System.out.println();
    HashMap<Integer, String>hm1 = new HashMap<>();
    List<String>color = new ArrayList<>(Arrays.asList("Red","Blue","Green","Orange","White","Lilac"));
    List<Integer>nums = new ArrayList<>(Arrays.asList(100,101,102,103,104,105));
    for(int i = 0 ; i<color.size();i++){
        hm1.put(nums.get(i), color.get(i));
    }
    System.out.println();
    printAll(hm1);
    System.out.println();
    System.out.println("Size of Hash Map "+hm1.size());
        //
        //Copying one hashmap to another one//
        HashMap<Integer, String>hm2 = new HashMap<>();
               hm2.put(1,"Kalyan");
               hm2.put(2,"Pawan");
               hm2.put(3,"Sonu");
               hm2.put(4,"Akhil");

        Copy(hm1 ,hm2);
//Removing all mappings//
System.out.println();
        HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        System.out.println("Before removal");
        printAll(hash_map);
        System.out.println();
        System.out.println("After clearing");
        HashMap <Integer,String> hash_cl = (HashMap)hash_map.clone();
        hash_cl.clear();

        System.out.println(hash_cl);
        //Checking for a specific key//
        System.out.println(hm1);
        System.out.println();
        System.out.println("Does it contain "+1+" "+hm1.containsKey(1));
        System.out.println("Does it contain "+112+" "+hm1.containsKey(102));
System.out.println();
System.out.println();
//Checking for a sepecific key-value pair//
System.out.println(hm1);
System.out.println();
Contains(hm1,100 ,"Red");
Contains(hm1,101,"Yellow");
System.out.println();
System.out.println();
///so
System.out.println("Original "+hash_map);
System.out.println("Clone "+hash_map);
hash_cl.put(1,"kalyan");
System.out.println("After modifying "+hash_cl);
System.out.println();
System.out.println();


//Checking if the hashmap contains a specific value//
System.out.println("Does it contain the value : neeraj");
System.out.println(hash_cl.containsValue("neeraj"));
System.out.println("Does it contain the value : kalyan");
System.out.println(hash_cl.containsValue("kalyan"));

System.out.println();
System.out.println();
//Set view of the elemnest //
System.out.println(hm1);
System.out.println();
System.out.println("Key value set view : "+hm1.entrySet());
System.out.println();
Set<Integer> keys = hm1.keySet();
Collection <String> values =  hm1.values();
System.out.println("Value collections : "+values);
System.out.println();
System.out.println("Key set value is : "+keys);
System.out.println();
//Merging two hashmaps using bi function//
HashMap<Integer, String>
            map1 = new HashMap<>();
        map1.put(1, "L");
        map1.put(2, "M");
        map1.put(3, "N");
  
        HashMap<Integer, String>
            map2 = new HashMap<>();
        map2.put(1, "B");
        map2.put(2, "G");
        map2.put(3, "R");
  
        // print map details
        System.out.println("HashMap1: "
                           + map1.toString());
  
        System.out.println("HashMap2: "
                           + map2.toString());


                           map2.forEach((key,value)->map1.merge(key, value, (v1,v2)->v1.equalsIgnoreCase(v2)? v1 : v1+" "+v2));
                           System.out.println(map1.toString());

    }
    
}
