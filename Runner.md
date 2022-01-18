# Runner test cases

## Array Practice 
```java
 var practice = new ArrayPractice();
    // This is the minimal compiling code. Construct the array with integers inside to test your solutions.
    //int[] array = {1, 2, 3, 4, 22, 44, 1, 2};
    int[] array = {1, 1, 2, 2, 3, 4, 22, 44, 44};

    //System.out.println(Arrays.toString(practice.add(array, 56)));
    //System.out.println(practice.get(array, 5));
    //System.out.println(Arrays.toString(practice.remove(array, 0)));
    //System.out.println(practice.contains(array, 3));
    //System.out.println(practice.indexOf(array, 2));
    //System.out.println(practice.size(array));
    //System.out.println(Arrays.toString(practice.doubleValues(array)));
    //System.out.println(Arrays.toString(practice.evenNumbers(array)));
    System.out.println(Arrays.toString(practice.removeDuplicates(array)));
    //System.out.println(practice.findLongestIncreasingSequence(array));
    //System.out.println(practice.sort(array));
```
## HashMap Practice
``` java

    var practice = new HashMapPractice();
    // This is the minimal compiling code. Set up the HashMap in a way that it's suitable to test your solution.
    HashMap<String, Integer> map = new HashMap<>();

    System.out.println(practice.add(map, "Stockholm", 1));
    practice.add(map, "London", 2);
    practice.add(map, "Uppsala", 3);
    System.out.println(practice.addIfAbsent(map, "Semeltown", 4));
    System.out.println(practice.get(map, "Stockholm"));
    System.out.println("True if value exists in the map, false if it doesnt: " + practice.contains(map, "Stockholm"));
    System.out.println(practice.size(map));
    //System.out.println(practice.clear(map));
    System.out.println(practice.removeByKey(map, "Stockholm"));



    System.out.println(practice.add(map, "Budapest", 3));
    System.out.println(practice.removeByValue(map, 3));
    System.out.println(practice.replace(map, "Göteborg", 3));
    System.out.println(practice.replaceIf(map, "Göteborg", 3, 12));
    System.out.println(practice.keys(map));
    System.out.println(practice.values(map));
    // Add the rest of the tests here. I'll write tests for the last two exercises.

    TrickyObject trickyObj1 = new TrickyObject("1");
    TrickyObject trickyObj2 = new TrickyObject("2");
    TrickyObject trickyObj3 = new TrickyObject("3");
    TrickyObject trickyObj4 = new TrickyObject("4");

    List<TrickyObject> trickyObjects = List.of(trickyObj1, trickyObj3, trickyObj2, trickyObj2, trickyObj2, trickyObj1, trickyObj4);
    System.out.println(practice.countInList(trickyObjects));

    // The following result should be true
   System.out.println(practice.isPangram("thequickbrownfoxjumpsoverthelazydog"));

    // The following result should be false
    System.out.println(practice.isPangram("JuditIsATroll"));
  }

