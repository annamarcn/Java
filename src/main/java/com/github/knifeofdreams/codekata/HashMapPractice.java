package com.github.knifeofdreams.codekata;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapPractice {

  // Add the key-value pair to the hashmap. Use the built-in HashMap method.
  public HashMap<String, Integer> add(HashMap<String, Integer> map, String key, Integer value)
  {
    map.put(key,value);
    return map;
  }

  // Add the key-value pair to the hashmap IF AND ONLY IF the key is not present in the map. Use the built-in HashMap method.
  public HashMap<String, Integer> addIfAbsent(HashMap<String, Integer> map, String key, Integer value) {
    map.putIfAbsent(key, value);
    return map;
  }

  // Return a value associated with a given key from the HashMap. Use the built-in HashMap method.
  public Integer get(HashMap<String, Integer> map, String key)
  {
    return map.get(key);
  }

  // check whether a particular key/value exist in a HashMap. Use the built-in HashMap method.
  public boolean contains(HashMap<String, Integer> map, String key)
  {
    if(map.containsKey(key))
    {
      return true;
    }
    return false;
  }

  // Return the number of key-value mappings present in a HashMap (the size of the map). Use the built-in HashMap method.
  public int size(HashMap<String, Integer> map)
  {
    System.out.print("The map has this many key-value mappings: ");
    return map.size();
  }

  // Remove all key-value pairs from a HashMap. Use the built-in HashMap method.
  public HashMap<String, Integer> clear(HashMap<String, Integer> map) {
    return null;
  }

  // Remove a key-value pair from the HashMap. Use the built-in HashMap method.
  public HashMap<String, Integer> removeByKey(HashMap<String, Integer> map, String key) {
    return null;
  }

  // Remove a key-value pair from a HashMap if the key is currently mapped to the input value.
  public HashMap<String, Integer> removeByValue(HashMap<String, Integer> map, Integer value) {
    return null;
  }

  // Replace a value associated with a given key in the HashMap.
  public HashMap<String, Integer> replace(HashMap<String, Integer> map, String key, Integer value) {
    return null;
  }

  // Replace a value associated with a key if it is mapped to given value.
  public HashMap<String, Integer> replaceIf(HashMap<String, Integer> map, Integer oldValue, Integer newValue) {
    return null;
  }

  // Return all keys present in a HashMap. Use the built-in HashMap method.
  public Set<String> keys(HashMap<String, Integer> map) {
    return null;
  }

  // Return all the values present in a HashMap. Use the built-in HashMap method.
  public Collection<Integer> values(HashMap<String, Integer> map) {
    return null;
  }

  /*
  For the following exercises use HashMap in the implementation even if the method signature doesn't require you to do so.
   */

  // Count the number of occurrences of the tricky objects in the array list.
  // Return a HashMap where the keys are the tricky objects and the values are the number of their occurrences.
  public HashMap<TrickyObject, Integer> countInList(List<TrickyObject> trickyObjects) {
    return null;
  }

  // Check if the Sentence Is Pangram. A pangram is a sentence where every letter of the English alphabet appears at least once.
  // Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
  public boolean isPangram(String sentence) {
    return false;
  }

  static class TrickyObject {

    @Override
    public boolean equals(Object obj) {
      return super.equals(obj);
    }

    @Override
    public int hashCode() {
      return super.hashCode();
    }
  }
}
