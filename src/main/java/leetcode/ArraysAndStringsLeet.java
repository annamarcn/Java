package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ArraysAndStringsLeet {

  public int numberOfConsistentStrings(String allowed, List<String> words) {
    int numConsStrings = 0;

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

  public int sumOfUniqueElements(List<Integer> nums) {
    if (nums.isEmpty()) {
      return 0;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 1;

    for (int i = 0; i < nums.size(); i++) {
      if (map.containsKey(nums.get(i))) {
        count = map.get(nums.get(i));
        count++;
      }
      map.put(nums.get(i), count);
    }

    Set<Integer> set = new HashSet<>();
    int sum = 0;

    for (int i = 0; i < nums.size(); i++) {
      if (map.get(nums.get(i)) == 1) {
        set.add(nums.get(i));
      }
    }
    List<Integer> list = new ArrayList<Integer>(set);

    for (int j = 0; j < set.size(); j++) {
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

  public int numWordsWithOneOccurrence(List<String> words1, List<String> words2) {
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
    // int[] arr => ArrayList<Integer>
    //    var numbers = Arrays.stream(arr)
    //        .boxed()
    //        .collect(Collectors.toList());

    HashMap<Integer, Integer> occurrences = new HashMap<>();

    for (int i = 0; i < arr.size(); i++) {
      if (occurrences.containsKey(arr.get(i))) {
        occurrences.put(arr.get(i), occurrences.get(arr.get(i)) + 1);
      } else {
        occurrences.put(arr.get(i), 1);
      }
    }

    var uniqueNums = new HashSet<>();
    for (Integer count : occurrences.values()) {
      uniqueNums.add(count);
    }

    return uniqueNums.size() == occurrences.size();
  }

  public boolean validParentheses(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      } else if (stack.size() > 0
          && ((stack.peek() == '(' && s.charAt(i) == ')')
              || (stack.peek() == '[' && s.charAt(i) == ']')
              || (stack.peek() == '{' && s.charAt(i) == '}'))) {
        stack.pop();
      } else {
        return false;
      }
    }

    return stack.size() == 0;
  }
}
