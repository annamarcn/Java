package leetcode;

import java.util.*;

public class ArraysAndStringsLeet {

  // consistent if all characters in a "words" string appear in the "allowed" string

  public int numberOfConsistentStrings(String allowed, List<String> words) {

    int numConsStrings = 0;

    if (allowed.length() == 0 || words.isEmpty()) {
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

  public int numWordsWithOneOccurence(List<String> words1, List<String> words2) {

    Map<String, Integer> map = new HashMap<>();
    int count = 1;
    int sum = 0;

    for (int i = 0; i < words1.size(); i++) {

      if (map.containsKey(words1.get(i).toLowerCase())) {
        count = map.get(words1.get(i).toLowerCase());
        count++;
      }
      map.put(words1.get(i).toLowerCase(), count);
      count = 1;
    }

    HashMap<String, Integer> tempMap = new HashMap<>(map);

    for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      if (value > 1) {
        map.remove(key);
      }
    }

    for (int k = 0; k < words2.size(); k++) {
      if (map.containsKey(words2.get(k).toLowerCase())) {
        sum += map.get(words2.get(k).toLowerCase());
        map.remove(words2.get(k).toLowerCase());
      }
    }

    return sum;
  }

  public boolean uniqueNumOfOccurrences(List<Integer> arr) {

    if (arr.isEmpty()) {
      return false;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    int count = 1;

    for (int i = 0; i < arr.size(); i++) {
      if (map.containsKey(arr.get(i))) {
        count = map.get(arr.get(i));
        count++;
      }
      map.put(arr.get(i), count);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      Integer value = entry.getValue();
      set.add(entry.getValue());
    }

    return (set.size() == map.size());
  }
}
