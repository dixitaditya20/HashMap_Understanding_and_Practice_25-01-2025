import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //Inserting elements Start
        map.put("D", 14);
        map.put("B", 22);
        map.put("E", 6);
        map.put("A", 1);
        map.put("Z", 3);

        System.out.println("Printing HashMap: " + map);
        //Inserting elements End

        //Searching elements Start
        System.out.println("Searching element with key 'A': " + map.get("A"));

        for(int i : map.values()){
            System.out.println("Value printed from advanced for loop : " + i);
        }

        if(map.containsKey("A"))
            System.out.println("Key 'A' is present in the HashMap");
        //Searching element End

        //Iterating elements Start
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
        //Iterating elements End

        //Removing elements Start
        //Removing element with key 'A'
        map.remove("A");
        //Removing element with key 'B' and value 22
        map.remove("B", 22);
        System.out.println("Map After removing elements: " + map);
        //Removing elements End
    }
}