package com.github.knifeofdreams.codekata;

import java.util.ArrayList;


import java.util.ArrayList;

public class ArrayListPractice {

  //  Add an item to the arraylist and return the list. Use the built-in ArrayList method.
  public ArrayList<Integer> add(ArrayList<Integer> list, Integer item) {
    list.add(item);
    return list;
  }

  //  Return the item at the given index.  Use the built-in ArrayList method. Experiment with what happens if you ask for an invalid index (e.g. negative index or an index >= the length of the list)!
  public Integer get(ArrayList<Integer> list, int index) {
    if (index >= 0) {
      return list.get(index);
    } else {
      return -1;
    }
  }

  //  Remove the item by a given index and then return the item. Use the built-in ArrayList method.
  //  Experiment with the list size before and after the removal.
  //  Experiment with what happens if you try to remove an item at an invalid index (e.g. negative index or an index >= the length of the list)!
  public Integer remove(ArrayList<Integer> list, int index) {

    if(index < 0 || index >= list.size()){
      return -1;
    }else{
      int savedItem = list.get(index);
      list.remove(index);
      return savedItem;
    }
  }

  //  Return true if the arraylist contains the item and false is it doesn't. You can try the
  // built-in method and also writing your own!
  public boolean contains(ArrayList<Integer> list, Integer item) {
    if (list.contains(item)) {
      return true;
    } else {
      return false;
    }
}

  //  Return the index of the given item or -1 if it's not present in the arraylist. You can try the built-in method and also writing your own!
  public int indexOf(ArrayList<Integer> list, Integer item) {

    if(list.contains(item)){
      return list.indexOf(item);
    }else{
      return -1;
    }


    /* Alternative method:
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) == item){
        return i;
      }
    }
    return -1;
     */
  }

  //  Return the size of the arraylist. You can try the built-in method and also writing your own!
  public int size(ArrayList<Integer> list) {

    int count = 0;
    for(Integer i : list){
      count++;
    }
    return count;

     /*
     Alternative method:
     return list.size();
     */
  }

  //  Double the value of each element in the arraylist and return the list. Implement your own solution.
  public ArrayList<Integer> doubleValues(ArrayList<Integer> list) {
    return null;
  }

  //  Select even elements from the arraylist and return the list. Implement your own solution.
  public ArrayList<Integer> evenNumbers(ArrayList<Integer> list) {
    return null;
  }

  // Shuffle the list. Use the built-in ArrayList method.
  public ArrayList<Integer> shuffle(ArrayList<Integer> list) {
    return null;
  }

  // Remove duplicate items from the arraylist. Implement your own solution.
  public ArrayList<String> removeDuplicates(ArrayList<Integer> list) {
    return null;
  }

  // Find the length of the longest strictly increasing sequence in the list. Example: in [2, 3, 5, 4] it will be 3, in [5, 4, 3] it will be 1.
  // Implement your own solution.
  public int findLongestIncreasingSequence(ArrayList<Integer> list) {
    return 0;
  }

  // Don't use a built-in method here, instead try to come up with your own implementation!
  // Think about as a human what steps you would follow to sort the array [4, 2, 3, 5, 1]. Try to translate these steps into code.
  // You can construct more arraylists, variables, use for loops, etc. inside the method.
  public ArrayList<Integer> sort(ArrayList<Integer> list) {
    return null;
  }

}