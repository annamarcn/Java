package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListsTest {
  private LinkedLists linkedList;

  @BeforeEach // will be executed before each test
  public void setup() {
    linkedList = new LinkedLists();
  }

  @Test
  public void addingNodeIncreasesListWithAddedNode() {
    linkedList.add(3);
    assertEquals(linkedList.toString(), "3 -> ");
    // assertEquals(linkedList.head.data, 3);
  }

  @Test
  public void newNodesAreAddedFromBeginningOfList() {
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(2);
    expected.add(3);

    linkedList.add(3);
    linkedList.add(2);
    linkedList.add(1);

    int index = 0;
    Node current = linkedList.head;

    while (current != null) {
      assertEquals(current.data, expected.get(index));
      index++;
      current = current.next;
    }
  }

  @Test
  public void nodeIsDeletedFromList() {
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(3);

    linkedList.add(3);
    linkedList.add(2);
    linkedList.add(1);
    linkedList.delete(2);

    int index = 0;
    Node current = linkedList.head;

    while (current != null) {
      assertEquals(current.data, expected.get(index));
      index++;
      current = current.next;
    }
  }
}
