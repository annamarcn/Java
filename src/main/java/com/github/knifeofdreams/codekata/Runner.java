package com.github.knifeofdreams.codekata;
 /*
public class Runner {
  public static void main(String[] args) {

    var arrayList = new ArrayListPractice();

    boolean result = arrayList.testMethod();
    //var result2 = arrayList.addItem();
    System.out.println(result);

  }
}
*/
import java.util.ArrayList;
    import java.util.List;

public class Runner {

  public static void main(String[] args) {
    var practice = new ArrayListPractice();

    List<Integer> integers = List.of(4, 2, 3, 5, 1);
    ArrayList<Integer> integerList = new ArrayList<>(integers);

    // Please play around with the items and indexes. These are here just to get you started and make the code compile.
    // I'm encouraging you to change them and even use invalid values to see what happens.
    System.out.println(practice.add(integerList, 12));
    /*System.out.println(practice.get(integerList, 0));
    System.out.println(practice.remove(integerList, 0));
    System.out.println(practice.contains(integerList, 0));
    System.out.println(practice.indexOf(integerList, 0));
    System.out.println(practice.size(integerList));
    System.out.println(practice.doubleValues(integerList));
    System.out.println(practice.evenNumbers(integerList));
    System.out.println(practice.shuffle(integerList));
    System.out.println(practice.removeDuplicates(integerList));
    System.out.println(practice.findLongestIncreasingSequence(integerList));
    System.out.println(practice.sort(integerList));
     */
  }

}