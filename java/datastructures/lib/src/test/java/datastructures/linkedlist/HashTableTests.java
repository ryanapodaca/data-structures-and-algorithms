package datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashTableTests {
  private HashTable<String, Integer> hashtable;


  @Test public void testSetValueAndGet() {
    hashtable = new HashTable<>();
    hashtable.set("key1", 10);
    hashtable.set("key2", 20);


    assertEquals(10, hashtable.get("key1"));
    assertEquals(20, hashtable.get("key2"));
  }

  @Test public void testGetValueForNonexistentKey() {
    hashtable = new HashTable<>();
    Integer value = hashtable.get("nonexistentKey");
    assertNull(value);
  }

  @Test public void testGetAllKeys() {
    hashtable = new HashTable<>();
    hashtable.set("key1", 10);
    hashtable.set("key2", 20);
    hashtable.set("key3", 30);

    Collection<String> keys = hashtable.keys();
    assertEquals(3, keys.size());
    Assertions.assertTrue(keys.contains("key1"));
    Assertions.assertTrue(keys.contains("key2"));
    Assertions.assertTrue(keys.contains("key3"));
  }

  @Test public void testCollisionHandling() {
    hashtable = new HashTable<>();
    hashtable.set("key1", 10);
    hashtable.set("key11", 20); // Collision with "key1"

    assertEquals(10, hashtable.get("key1"));
    assertEquals(20, hashtable.get("key11"));
  }

  @Test public void testRetrieveValueFromCollisionBucket() {
    hashtable = new HashTable<>(1);
    hashtable.set("key1", 10);
    hashtable.set("key11", 20); // Collision with "key1"

    int bucketIndex = hashtable.hash("key1");
    assertEquals(10, hashtable.get("key1"));
    assertEquals(20, hashtable.get("key11"));
    assertEquals(2, hashtable.table.get(bucketIndex).size());
  }

  @Test public void testHashInRangeValue() {
    hashtable = new HashTable<>();
    int hashValue = hashtable.hash("key");
    Assertions.assertTrue(hashValue >= 0 && hashValue < hashtable.table.size());
  }
}

