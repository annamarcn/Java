package leetcode;

import org.junit.jupiter.api.Test;

class LinkedListsTest {
  private LinkedLists linkedList = new LinkedLists();

  @Test
  public void addingNodeIncreasesListWithAddedNode() {
    assertEquals(linkedList.head.data, linkedList.add(3).toString());
  }
}
