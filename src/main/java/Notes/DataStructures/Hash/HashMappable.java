package Notes.DataStructures.Hash;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMaps works in key / value pairs, DOES allow duplicate keys
 */


public class HashMappable {
    public static void main(String[] args){
        HashMap<String, String> citiesCapitals = new HashMap<String, String>();

        citiesCapitals.put("England", "London");
        citiesCapitals.put("Germany", "Berlin");
        citiesCapitals.put("USA", "WDC");
        citiesCapitals.put("Norway", "Oslo");

        System.out.println(citiesCapitals);

        //can fetch specific key's value
        System.out.println("The Capital of England is " + citiesCapitals.get("England"));

        //can remove specific pair
        citiesCapitals.remove("England"); //the .clear() method will also work here
        System.out.println(citiesCapitals);

        //can find size of whole list
        System.out.println("Size: " + citiesCapitals.size());

        //can interate through each Key ONLY
        for (String i : citiesCapitals.keySet()){
            System.out.println(i);
        }

        //can interate through each value ONLY
        for (String i : citiesCapitals.values()){
            System.out.println(i);
        }

        //how to print with for-loop
        for (Map.Entry<String, String> entry : citiesCapitals.entrySet()) { //entry set gets the whole set both key and value
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }
}
