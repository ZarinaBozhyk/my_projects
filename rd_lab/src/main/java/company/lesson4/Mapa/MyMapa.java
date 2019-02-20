package company.lesson4.Mapa;

import java.util.HashMap;

public class MyMapa {
    public static void main(String[] args) {
        String sentence  = "Мама мыла раму";
        HashMap<String, Integer > someHashMap = new HashMap<>();
        for (int i = 0; i<sentence.length(); i++){
            String key = sentence.substring(i, i+1);
            //someHashMap.put( stringMy.substring(i, i+1), i);
            if (someHashMap.containsKey(key)){
                Integer value = someHashMap.get(key)+1;
                someHashMap.put(key, value);
            }else {
                someHashMap.put(key, 1);
            }
        }
        for (int i = 0; i<sentence.length(); i++) {
            String key = sentence.substring(i, i + 1);
        }

        System.out.println(someHashMap.keySet());
    }
}
