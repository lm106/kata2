package kata1;

/**
 *
 * @author Luzma
 * @version 14-10-2020
 * @since Práctica Laboratorio
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        map.put(0, -1);
        map.put(8, 3);
        map.put(6, 8);
        map.put(3, 0);
        map.put(5, 12);
        map.put(7, 23);
        map.put(90, 89);        
        
        /**
         * for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         *  System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
         * } 
        **/
        //Otra forma
        //Necesita más tiemp que la anterior versión
        /**
         * for (Integer key : map.keySet()) {
         *   System.out.println("Key: " + key + " Value: " + map.get(key));
         *   
         * }
        **/
        //Otra forma
        for (Integer value : map.values()) {
            System.out.println("Value " + value);
            
        }
        Iterator<Map.Entry<Integer,Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key: " + entry.getKey()+ ", Value: " + entry.getValue());
            
        }
        
        
    }
    
}
