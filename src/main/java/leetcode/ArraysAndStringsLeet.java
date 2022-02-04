package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ArraysAndStringsLeet {

  //consistent if all characters in a "words" string appear in the "allowed" string
  public int numberOfConsistentStrings(String allowed, List<String> words){

    int numConsStrings = 0;

    if(allowed.length() == 0) {
      return 0;
    }

    if(words.isEmpty()) {
      return 0;
    }

    HashMap<Character, Integer> map = new HashMap<>();

    for(int i = 0; i < allowed.length(); i++) {
      map.put(Character.toLowerCase(allowed.charAt(i)), i);
    }

    for(String str : words) {
      HashMap<Character, Integer> stringMap = new HashMap<>();

      for(int i = 0; i < str.length(); i++) {
        stringMap.put(Character.toLowerCase(str.charAt(i)), i);
      }

      for(char c : stringMap.keySet())
      {
        if(map.containsKey(c))
        {
          stringMap.remove(c);
        }
        if(stringMap.isEmpty())
        {
          numConsStrings++;
        }
      }
    }

    return numConsStrings;
  }

}
