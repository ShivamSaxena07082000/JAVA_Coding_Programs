package StringsQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShrinkingOfAnString {

    public static void main(String[] args) {

        //aabbbcc => a2b3c2
        String str = "aabbbcc";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Character key:map.keySet())
        {
            System.out.print(key.toString() + map.get(key));
        }
    }
}
