package kata2;

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
        Integer[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4, 12, 12, 14};
        String[] data2 = {"Pablo", "Pedro","Magdalena", "Pepe", "María", "María", "Facundo", "Pepe", "Pepe"};
        //Para la versión 1 y 2
        /**
         * Map<Integer, Integer> histogram = new HashMap<Integer,Integer>();
         **/
        
        Histogram meta_histogram = new Histogram(data2);
        Map<String, Integer>  histogram = meta_histogram.getHistogram();
        //Esto funciona porque está convirtiéndolo el tipo de dato. 
        //NO IMPORTA: si pone en la línea 22 data o data2.
        /**
         * Map<Integer, Integer>  histogram = meta_histogram.getHistogram();
         **/

        //for (int i = 0; i < data.length; i++) {
            //Versión 1
            /**
             * if (histogram.containsKey(data[i])) { // Miramos si ese valor tiene asignado una clave
             *    histogram.put(data[i],histogram.get(data[i]) + 1); //pone en value las veces que hay de esa clave
             * } else {
             *     histogram.put(data[i], 1);
             * }
            **/
            
            //Versión 2
            //Operador ternario
            /**
             * histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i]) + 1 : 1);
             **/
            
         //}
        //Cuando la línea 23 tiene <Integer, Integer>. Y NO IMPORTA si tiene la linea 22 data o data2
        /*
        *   Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        *   while (entries.hasNext()) {
        *       Map.Entry<Integer, Integer> entry = entries.next();
        *       System.out.println("Key: " + entry.getKey()+ ", Value: " + entry.getValue());           
        *   }
        */
        Iterator<Map.Entry<String, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Key: " + entry.getKey()+ ", Value: " + entry.getValue());
            
        }
        
    }
}
