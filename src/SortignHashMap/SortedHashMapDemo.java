package SortignHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortedHashMapDemo {

      public static void main (String args []){
          HashMap<String , Integer>  map = new HashMap<String, Integer>();
          map.put("Eight", 8);
          map.put("four", 4);
          map.put("ten", 10);
          map.put("six", 6);

          ArrayList<Map.Entry<String , Integer>> listOfEntries = new ArrayList<>(map.entrySet());
          Collections.sort(listOfEntries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
          for (Map.Entry<String, Integer> e:listOfEntries){

              System.out.print("key :-> "+e.getKey()+"  value :->"+e.getValue());


          }
         System.out.println();

          listOfEntries.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

          System.out.println();
          listOfEntries.stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.compareTo(o1))).forEach(System.out::println);

      }



}
