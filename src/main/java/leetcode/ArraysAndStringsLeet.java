package leetcode;

import java.util.*;

public class ArraysAndStringsLeet {

  // consistent if all characters in a "words" string appear in the "allowed" string

  public int numberOfConsistentStrings(String allowed, List<String> words) {

    int numConsStrings = 0;

    if (allowed.length() == 0) {
      return 0;
    }

    if (words.isEmpty()) {
      return 0;
    }

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < allowed.length(); i++) {
      map.put(Character.toLowerCase(allowed.charAt(i)), i);
    }

    for (String str : words) {
      HashMap<Character, Integer> stringMap = new HashMap<>();

      for (int i = 0; i < str.length(); i++) {
        stringMap.put(Character.toLowerCase(str.charAt(i)), i);
      }

      List<Character> keyList = new ArrayList<>(stringMap.keySet());

      for (char c : keyList) {
        if (map.containsKey(c)) {
          stringMap.remove(c);
        }

        if (stringMap.isEmpty()) {
          numConsStrings++;
        }
      }
    }

    return numConsStrings;
  }

  public int numberOfUniqueElements(List<Integer> nums) {

    if (nums.isEmpty()) {
      return 0;
    }

    Set<Integer> setOfNums = new HashSet<>();
    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {
      setOfNums.add(nums.get(i));
    }
    List<Integer> list = new ArrayList<Integer>(setOfNums);

    for (int j = 0; j < setOfNums.size(); j++) {
      sum += list.get(j);
    }

    return sum;
  }

  public boolean isAnagram(String s, String t) {

    if (s.length() == 0 || t.length() == 0 || s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      map.put(Character.toLowerCase(s.charAt(i)), i);
    }

    for (int j = 0; j < t.length(); j++) {
      if (map.containsKey(Character.toLowerCase(t.charAt(j)))) {
        map.remove(Character.toLowerCase(t.charAt(j)));
      }
    }

    return map.isEmpty();
  }
}
