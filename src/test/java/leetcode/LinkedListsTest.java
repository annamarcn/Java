package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LinkedListsTest {
  private LinkedLists linkedList = new LinkedLists();

  @Test
  public void addingNodeIncreasesListWithAddedNode() {
    linkedList.add(3);
    assertEquals(linkedList.toString(), "3 -> ");
  }
}
