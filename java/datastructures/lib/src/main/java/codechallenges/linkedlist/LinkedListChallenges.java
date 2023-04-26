package codechallenges.linkedlist;

import datastructures.linkedlist.*;

public class LinkedListChallenges
{
  LinkedList linkedList;

  public LinkedListChallenges()
  {
    linkedList = new LinkedList();
  }

  public Node zipLinkedLists(Node lN1,Node lN2) {
    Node temp = new Node(-1);
    Node tail = temp;

    while (lN1 != null && lN2 != null) {
      //anchor dummy node to head address of linked list lN1
      tail.next = lN1;
      //then traverse qua address change of lN1
      lN1 = lN1.next;
      //then we anchor dummy node to zip lN2
      tail = tail.next;
      //zip in lN2
      tail.next = lN2;
      lN2 = lN2.next;
      //repeat process till null
      tail = tail.next;
    }


      //Tie off loose ends
      if (lN1 != null) {
        tail.next = lN1;
      }
      else {
        tail.next = lN2;
      }

      return temp.next;


    }

  }

}
