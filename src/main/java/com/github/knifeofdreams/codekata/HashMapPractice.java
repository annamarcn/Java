package com.github.knifeofdreams.codekata;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
    return map.containsKey(key);
  }

  // Return the number of key-value mappings present in a HashMap (the size of the map). Use the built-in HashMap method.
  public int size(HashMap<String, Integer> map)
  {
    System.out.print("The map has this many key-value mappings: ");
    return map.size();
  }

  // Remove all key-value pairs from a HashMap. Use the built-in HashMap method.
  public HashMap<String, Integer> clear(HashMap<String, Integer> map)
  {
    map.clear();
    return map;
  }

  // Remove a key-value pair from the HashMap. Use the built-in HashMap method.
  public HashMap<String, Integer> removeByKey(HashMap<String, Integer> map, String key) {
    map.remove(key);
    return map;
  }

  // Remove a key-value pair from a HashMap if the key is currently mapped to the input value.
  public HashMap<String, Integer> removeByValue(HashMap<String, Integer> map, Integer value) {

    map.values().removeAll(Collections.singleton(value));
    return map;

//    Integer currentVal;
//    HashMap result = new HashMap<String, Integer>();
//    for (Entry<String, Integer> entry : map.entrySet())
//    {
//      currentVal = entry.getValue();
//      if(!currentVal.equals(value))
//      {
//        result.put(entry.getKey(), entry.getValue());
//      }
//    }
//    return result;
  }

  // Replace a value associated with a given key in the HashMap.
  public HashMap<String, Integer> replace(HashMap<String, Integer> map, String key, Integer value) {
    map.put(key, value); //If the mapping exists for the key, the old value is overwritten. In this line, the old value is returned.
    return map; //the map with the new updated value
  }

  // Replace a value associated with a key if it is mapped to given value.
  public HashMap<String, Integer> replaceIf(HashMap<String, Integer> map, String key, Integer oldValue, Integer newValue) {
    if(map.get(key).equals(oldValue))
    {
      map.put(key, newValue);
    }
    return map;
  }

  // Return all keys present in a HashMap. Use the built-in HashMap method.
  public Set<String> keys(HashMap<String, Integer> map) {
    return map.keySet();
  }

  // Return all the values present in a HashMap. Use the built-in HashMap method.
  public Collection<Integer> values(HashMap<String, Integer> map) {
    return map.values();
  }

  /*
  For the following exercises use HashMap in the implementation even if the method signature doesn't require you to do so.
   */

  // Count the number of occurrences of the tricky objects in the array list.
  // Return a HashMap where the keys are the tricky objects and the values are the number of their occurrences.
  /*
  public HashMap<TrickyObject, Integer> countInList(List<TrickyObject> trickyObjects) {
    HashMap<TrickyObject, Integer> map = new HashMap<>();
    int value = 1;
    for(int i = 0; i < trickyObjects.size(); i++) //let's also write it the other way
    {
      if(map.containsKey(trickyObjects.get(i))){
        map.put(trickyObjects.get(i), value++);
      }else{
        map.put(trickyObjects.get(i), value);
      }
    }
    return map;
  */
  public HashMap<TrickyObject, Integer> countInList(List<TrickyObject> trickyObjects) {
    HashMap<TrickyObject, Integer> counter = new HashMap<>();

    for(TrickyObject object : trickyObjects) {
      Integer numberOfOccurrences = counter.get(object);
      if(numberOfOccurrences == null) {
        numberOfOccurrences = 1;
      } else {
        numberOfOccurrences++;
      }
      counter.put(object, numberOfOccurrences);
    }
    return counter;

//    HashMap<TrickyObject, Integer> counter = new HashMap<>();
//
//    for (TrickyObject object : trickyObjects) {
//      Integer value = counter.getOrDefault(object, 0);
//      value++;
//      counter.put(object, value);
//    }
//
//    return counter;
  }

  // Check if the Sentence Is Pangram. A pangram is a sentence where every letter of the English alphabet appears at least once.
  // Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
  public boolean isPangram(String sentence) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    HashMap<Character, Integer> map = new HashMap<>();
    HashMap<Character, Integer> sentenceMap = new HashMap<>();

    for(int i = 0; i < alphabet.length(); i++)
    {
      map.put(alphabet.charAt(i), i);
    }

    for(int j = 0; j < sentence.length(); j++)
    {
     map.remove(sentence.charAt(j));
    }

    return map.isEmpty();

//    HashMap<Character, Integer> characters = new HashMap<>();
//    for (int i = 0; i < sentence.length(); i++) {
//      Integer numberOfOccurrences = characters.getOrDefault(sentence.charAt(i), 0);
//      numberOfOccurrences++;
//      characters.put(Character.toLowerCase(sentence.charAt(i)), numberOfOccurrences);
//    }
//
//    return characters.size() == 26;
  }

  static class TrickyObject {

    private final String id;

    public TrickyObject(String id) {
      this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
      return super.equals(obj);
    }

    @Override
    public int hashCode() {
      return super.hashCode();
    }

    @Override
    public String toString() {
      return "TrickyObject{" + id + "}";
    }
  }
}
