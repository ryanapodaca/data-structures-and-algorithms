package datastructures.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;


public class HashTable<K, V> {
  ArrayList<LinkedList<Entry<K, V>>> table;
  private static final int defaultCapacity = 10; //default bucket size
  private int capacity;

  public HashTable() {
    this(defaultCapacity);  //pushes def cap into constructor below
  }

  public HashTable(int capacity) {
    this.capacity = capacity;
    table = new ArrayList<>(capacity);
    for (int i = 0; i < capacity; i++)
      table.add(new LinkedList<Entry<K, V>>());
  }

  public void set(K key, V value) {
    int index = hash(key);
    LinkedList<Entry<K, V>> bucket = table.get(index);

    for (Entry<K, V> entry : bucket) {
      if (entry.getKey().equals(key)) {
        entry.setValue(value);
        return;
      }
    }

    bucket.add(new Entry<>(key, value));
  }

  public V get(K key) {
    int index = hash(key);
    LinkedList<Entry<K, V>> bucket = table.get(index);

    for (Entry<K, V> entry : bucket) {
      if (entry.getKey().equals(key)) {
        return entry.getValue();
      }
    }

    return null;
  }

  public boolean has(K key) {
    int index = hash(key);
    LinkedList<Entry<K, V>> bucket = table.get(index);

    for (Entry<K, V> entry : bucket) {
      if (entry.getKey().equals(key)) {
        return true;
      }
    }

    return false;
  }

  public ArrayList<K> keys() {
    ArrayList<K> keys = new ArrayList<>();

    for (LinkedList<Entry<K, V>> bucket : table) {
      for (Entry<K, V> entry : bucket) {
        keys.add(entry.getKey());
      }
    }

    return keys;
  }

  public int hash(K key) {
    return key.hashCode() % capacity;
  }


  private static class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }
  }

}
