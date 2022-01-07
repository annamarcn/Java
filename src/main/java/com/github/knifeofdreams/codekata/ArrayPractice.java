package com.github.knifeofdreams.codekata;

public class ArrayPractice {

  //  Add an item to the array and return the array.
  public int[] add(int[] array, int item)
  {
    int[] temp = new int[array.length + 1];

    for(int i = 0; i < array.length; i++){
      temp[i] = array[i];
    }
    temp[array.length] = item;

    return temp;
  }

  //  Return the item at the given index. Experiment with what happens if you ask for an invalid index (e.g. negative index or an index >= the length of the array)!
  public int get(int[] array, int index) {
    return array[index];
  }

  //  Remove the item by a given index and then return the item.
  //  Experiment with what happens if you try to remove an item at an invalid index (e.g. negative index or an index >= the length of the array)!
  public int[] remove(int[] array, int index)
  {
    int[] newArray = new int[array.length-1];

    for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    for(int i = 0; i < newArray.length; i++)
    {
      newArray[i] = array[i];
    }

    return newArray;
  }

  //  Return true if the array contains the item and false is it doesn't.
  public boolean contains(int[] array, Integer item) {
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] == item){
        return true;
      }
    }
    return false;
  }

  //  Return the index of the given item or -1 if it's not present in the array.
  public int indexOf(int[] array, Integer item) {
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] == item)
      {
        return i;
      }
    }
    return -1;
  }

  //  Return the size of the array.
  public int size(int[] array)
  {
    int count = 0;

    for(int i = 0; i < array.length; i++)
    {
      count++;
    }
    return count;
  }

  //  Double the value of each element in the array and return the result.
  public int[] doubleValues(int[] array)
  {
    for(int i = 0; i < array.length; i++)
    {
      array[i] *= 2;
    }
    return array;
  }

  //  Select even elements from the array and return the result.
  public int[] evenNumbers(int[] array) {

    int count = 0;

    for(int i = 0; i < array.length; i++)
    {
      if(array[i]%2 == 0)
      {
        count++;
      }
    }

    int[] newArray = new int[count];

    for(int i = 0; i < array.length; i++)
    {
      if(array[i]%2==0)
      {
        //newArray.add(array[i],array); //ASK JUDIT: why doesn't this work?
      }
    }

    return newArray;
  }

  // Remove duplicate items from the array. Return the array. (Only works if sorted array. If not, I don't know how to solve it)
  public int[] removeDuplicates(int[] array) {

    int[] newArray = new int[array.length];

    int j = 0;

    for (int i = 0; i < array.length - 1; i++)
    {
      int currentElement = array[i];

      if (currentElement != array[i+1]) {
        newArray[j++] = currentElement;
      }
    }

    newArray[j++] = array[array.length-1];

    return newArray;
  }


  // Find the length of the longest strictly increasing sequence in the array. Example: in [2, 3, 5, 4] it will be 3, in [5, 4, 3] it will be 1.
  public int findLongestIncreasingSequence(int[] array) {
    return 0;
  }

  // Think about as a human what steps you would follow to sort the array [4, 2, 3, 5, 1]. Try to translate these steps into code.
  // You can construct more arrays, variables, use for loops, etc. inside the method.
  public int[] sort(int[] array) {
    return new int[0];
  }
}
