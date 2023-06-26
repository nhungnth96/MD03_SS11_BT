package bt08;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character,Integer> strMap = new TreeMap<>();
        String str = "hello world";
        str = str.replaceAll(" ","");
        str = str.toLowerCase();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(strMap.containsKey(c)){
                strMap.put(c, strMap.get(c)+1);
            } else {
                strMap.put(c,1);
            }
        }
        System.out.println(strMap);
    }
}
