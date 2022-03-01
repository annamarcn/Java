package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LinkedListsTest {
  private LinkedLists linkedList = new LinkedLists();

  @Test
  public void canAddOneNodeToEmptyLinkedList() {
    linkedList.add(3);
    assertEquals(linkedList.toString(), "3 -> ");
  }

  @Test
  public void canAddMultipleNodesToLinkedList() {
    linkedList.add(3);
    linkedList.add(5);
    linkedList.add(7);
    linkedList.add(9);
    assertEquals("3 -> 5 -> 7 -> 9 -> ", linkedList.toString());
  }
}
