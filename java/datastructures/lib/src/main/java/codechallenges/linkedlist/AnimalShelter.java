package codechallenges.linkedlist;

import datastructures.linkedlist.Queue;

import java.util.Objects;

public class AnimalShelter {
  Queue<Animal> catQueue = new Queue<>();
  Queue<Animal> dogQueue = new Queue<>();
  public void enqueue(Animal animal){
    if (animal.species.equals("cat")){
      catQueue.enqueue(animal);
     }
    else {
      dogQueue.enqueue(animal);
    }
  }

  public Animal dequeue(String pref) {
    if (pref == null)
      return null;

    if (pref.equals("cat")) {
      if (catQueue == null) {
        return null;
      } else
        return catQueue.dequeue();
    }

    if (pref.equals("dog")) {
      if (dogQueue.front == null) {
        return null;
      }
    }
    return dogQueue.dequeue();
  }
}
