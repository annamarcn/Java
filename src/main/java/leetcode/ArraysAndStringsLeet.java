package leetcode;

import java.util.*;

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
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;

    HashSet<Integer> set = new HashSet<>(nums);

    for (int i = 0; i < nums.size(); i++) {
      if (!map.containsKey(nums.get(i))) {
        map.put(nums.get(i), 1);
      } else {
        map.remove(nums.get(i));
        set.remove(nums.get(i));
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (set.contains(entry.getKey())) {
        sum += entry.getKey();
      }
    }

    return sum;
  }

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char lowercaseChar = Character.toLowerCase(s.charAt(i));
      map.put(lowercaseChar, i);
    }

    for (int j = 0; j < t.length(); j++) {
      char lowercaseChar = Character.toLowerCase(s.charAt(j));
      if (map.containsKey(lowercaseChar)) {
        map.remove(lowercaseChar);
      }
    }

    return map.isEmpty();
  }

  public int countWords(List<String> words1, List<String> words2) {

    Map<String, Integer> map = new HashMap<>();
    int sum = 0;

    for (int i = 0; i < words1.size(); i++) {
      String lowercaseWord = words1.get(i).toLowerCase();

      if (map.containsKey(lowercaseWord)) {
        map.put(lowercaseWord, map.get(lowercaseWord) + 1);
      } else {
        map.put(lowercaseWord, 1);
      }
    }

    HashMap<String, Integer> tempMap = new HashMap<>(map);

    for (var entry : tempMap.entrySet()) {
      if (entry.getValue() > 1) {
        map.remove(entry.getKey());
      }
    }

    for (int k = 0; k < words2.size(); k++) {
      String lowercaseWord = words2.get(k).toLowerCase();

      if (map.containsKey(lowercaseWord) && map.get(lowercaseWord) == 1) {
        sum += map.get(lowercaseWord);
        map.remove(lowercaseWord);
      }
    }

    return sum;
  }

  public boolean uniqueNumOfOccurrences(List<Integer> arr) {
    // int[] arr => ArrayList<Integer>
    //    var numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());

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
