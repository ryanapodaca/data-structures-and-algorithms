package codechallenges.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AnimalShelterTest {
  @Test void testEnqueueDequeue(){
    Animal cat = new Animal("Fred","cat");
    Animal cat2 = new Animal("Frad","cat");
    Animal dog = new Animal("Frid","dog");
    Animal dog2 = new Animal("Frod","dog");
    AnimalShelter as = new AnimalShelter();
    as.enqueue(cat);
    as.enqueue(cat2);
    as.enqueue(dog);
    as.enqueue(dog2);
    assertEquals(cat, as.dequeue("cat"));
    assertEquals(dog, as.dequeue("dog"));
    assertNull(as.dequeue(null));
  }
}
