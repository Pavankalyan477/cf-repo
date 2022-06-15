import java.util.*;

class Hashmap {


    static int length(HashMap<Integer,String>map){
        return map.size();
    }

    static HashMap<Integer,String> Copy(HashMap<Integer,String>map,HashMap<Integer,String>map1){
       

        map.putAll(map1);
        return map;
        
    }

    static HashMap<Integer,String> Remove(HashMap<Integer,String>map){
        map.clear();
        return map;
    }

    static boolean CheckEmpty(HashMap<Integer,String>map){
        
        return map.isEmpty();
    }

    static void ShallowCopy(HashMap<Integer,String>map){
        
        HashMap <Integer,String> copy=new HashMap<>();
        copy=(HashMap)map.clone();

        System.out.println(copy);
    }

    static String CheckKey(HashMap<Integer,String>map,int n){
        
        if(map.containsKey(n)){
            return map.get(n);
        }
        return "No";
    }
    static String CheckValue(HashMap<Integer,String>map,String n){
        
        if(map.containsValue(n)){
            return "Yes";
        }
        return "No";
    }
    static Set ViewSet(HashMap<Integer,String>map){
        
        Set set=map.entrySet();
        return set;
        
    }
    public static void main(String[] args) {

        // 1. to associate the specified value with the specified key in a HashMap

        HashMap <Integer,String> map=new HashMap<>();

        map.put(1, "Pavan");
        map.put(2,"Kalyan");
        map.put(3,"Sonu");
        map.put(4,"Vinay");

        for(Map.Entry i:map.entrySet()){
            System.out.println(i.getKey()+"-->"+i.getValue());
        }

        // 2. to count the number of key-value (size) mappings in a map
        System.out.println(length(map));

        // 3.to copy all of the mappings from the specified map to another map.
        HashMap <Integer,String> map1=new HashMap<>();

        map1.put(5, "Ravi");
        map1.put(6,"Akhil");
        map1.put(7,"Dheeraj");

        System.out.println(Copy(map,map1));

        // 4.  to remove all of the mappings from a map

        System.out.println(Remove(map));

        // 5  to check whether a map contains key-value mappings (empty) or not

        System.out.println(CheckEmpty(map));System.out.println(CheckEmpty(map1));

        // 6. to get a shallow copy of a HashMap instance.

        ShallowCopy(map1);

        // 7.to test if a map contains a mapping for the specified key. 

        System.out.println(CheckKey(map1,4));
        System.out.println(CheckKey(map1,6));


        // 8. to test if a map contains a mapping for the specified value.

        System.out.println(CheckValue(map1,"Pavan"));
        System.out.println(CheckValue(map1,"Ravi"));

        // 9. to create a set view of the mappings contained in a map
        System.out.println(ViewSet(map1));

        // 10.to get the value of a specified key in a map.
        // i=6
        System.out.println(map1.get(6));

        // 11.to get a set view of the keys contained in this map.

        Set<Integer> st=map1.keySet();
        System.out.println(st);

        // 12. to get a collection view of the values contained in this map
        System.out.println(map1.values());
        

    }
}