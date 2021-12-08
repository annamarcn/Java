package com.github.knifeofdreams.codekata;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice
{

  //  Add an item to the arraylist and return the list. Use the built-in ArrayList method.
  public ArrayList<Integer> add(ArrayList<Integer> list, Integer item)
  {
    list.add(item);
    return list;
  }

  //  Return the item at the given index.  Use the built-in ArrayList method. Experiment with what happens if you ask for an invalid index (e.g. negative index or an index >= the length of the list)!
  public Integer get(ArrayList<Integer> list, int index)
    {
      try
      {
        return list.get(index);
      }
      catch (IndexOutOfBoundsException e){
      System.out.println("The index is out of bounds.");
      return null;
      }
  }

  //  Remove the item by a given index and then return the item. Use the built-in ArrayList method.
  //  Experiment with the list size before and after the removal.
  //  Experiment with what happens if you try to remove an item at an invalid index (e.g. negative
  // index or an index >= the length of the list)!
  public Integer remove(ArrayList<Integer> list, int index) {
    try
    {
      return list.remove(index);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("The index is out of bounds");
      return null;
    }
    }

  //  Return true if the arraylist contains the item and false is it doesn't. You can try the
  // built-in method and also writing your own!
  public boolean contains(ArrayList<Integer> list, Integer item)
  {
    for(int i = 0; i < list.size(); i++)
    {
      if(list.get(i).equals(item))
      {
        System.out.println("The list contains the item: " + item);
        return true;
      }
    }
    System.out.println("The list doesn't contain the item: " + item);
    return false;

    /*Alternative method:
    return list.contains(item);
     */
  }

  //  Return the index of the given item or -1 if it's not present in the arraylist. You can try the built-in method and also writing your own!
  public int indexOf(ArrayList<Integer> list, Integer item)
  {
    if(!list.contains(item)){
      System.out.println("The item doesn't exist in the list.");
    }
    return list.indexOf(item);
  }

  //  Return the size of the arraylist. You can try the built-in method and also writing your own!
  public int size(ArrayList<Integer> list)
  {
    int count = 0;
    for(int i = 0; i < list.size(); i++)
    {
      count++;
    }
    return count;

     /*
     Alternative method:
     return list.size();
     */
  }

  //  Double the value of each element in the arraylist and return the list. Implement your own solution.
  public ArrayList<Integer> doubleValues(ArrayList<Integer> list)
  {
    ArrayList<Integer> doubleValues = new ArrayList<>();

    for(int i = 0; i < list.size(); i++){
      doubleValues.add(i, list.get(i)*2);
    }

    return doubleValues;
  }

  //  Select even elements from the arraylist and return the list. Implement your own solution.
  public ArrayList<Integer> evenNumbers(ArrayList<Integer> list)
  {
    ArrayList<Integer> newList = new ArrayList<>();

    for(int i = 0; i < list.size(); i++){
      if((list.get(i) % 2) == 0){
        newList.add(list.get(i));
      }
    }
    return newList;
  }

  // Shuffle the list. Use the built-in ArrayList method.
  public ArrayList<Integer> shuffle(ArrayList<Integer> list)
  {
    Collections.shuffle(list);
    return list;
  }

  // Remove duplicate items from the arraylist. Implement your own solution.
  public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
  {
    ArrayList<Integer> newList = list;
    System.out.println(newList);

    for(int i = 0; i < list.size(); i++)
    {
      for(int j = i+1; j < list.size()-1; j++)
      {
         if(list.get(i).equals(list.get(j)))
         {
           newList.remove(j);
         }
      }
    }
    return newList;
  }

  // Find the length of the longest strictly increasing sequence in the list. Example: in [2, 3, 5, 4] it will be 3, in [5, 4, 3] it will be 1.
  // Implement your own solution.
  public int findLongestIncreasingSequence(ArrayList<Integer> list)
  {
    int count = 0;
    int maxIncreasingSequence = 0;

    for(int i = 0; i < list.size(); i++)
    {
      if(i+1 < list.size() && list.get(i)<list.get(i+1))
      {
        count++;
        maxIncreasingSequence = Math.max(count, maxIncreasingSequence); // (count >= maxIncreasingSequence) ? count : maxIncreasingSequence;
      }
      else
      {
        count = 0;
      }
    }
    return maxIncreasingSequence+1;
  }

  // Don't use a built-in method here, instead try to come up with your own implementation!
  // Think about as a human what steps you would follow to sort the array [4, 2, 3, 5, 1]. Try to translate these steps into code.
  // You can construct more arraylists, variables, use for loops, etc. inside the method.
  public ArrayList<Integer> sort(ArrayList<Integer> list)
  {
    int temp;
    for(int i = 0; i < list.size(); i++)
    {
      for(int j = i+1; j < list.size(); j++)
      {
        if(list.get(i) > list.get(j))
        {
          temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    return list;
  }
}