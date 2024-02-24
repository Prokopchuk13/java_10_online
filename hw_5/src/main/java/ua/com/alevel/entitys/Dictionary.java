package ua.com.alevel.entitys;

public class Dictionary<K,V> {
  private K keys[] = (K[]) new Object[100];
  private V values[] = (V[]) new Object[100];

  public boolean put(K key, V value){
    for (int i = 0; i <keys.length; i++) {
      if (keys[i] == null){
        keys[i] = key;
        values[i] = value;
      }
    }
    return true;
  }
  public boolean isEmpty() {
    if (keys.length == 0 && values.length == 0) {
      return true;
    }
    return false;
  }
  public int size() {
    return keys.length;
  }
  public boolean containsKey(K key) {
    for (int i = 0; i < keys.length; i++) {
      if (keys[i] == key) {
        return true;
      }
    }
    return false;
  }
  public boolean containsValue(V value){
    for (int i = 0; i <values.length ; i++) {
      if (values[i] == value){
        return true;
      }
    }
    return false;
  }
  public V get(K key){
    for (int i = 0; i < keys.length ; i++) {
      if (keys[i] == key){
        return values[i];
      }
    }
    return null;
  }
  public boolean remove(K key){
    for (int i = 0; i < keys.length ; i++) {
      if (keys[i] == key){
        keys[i] = null;
        values[i] = null;
      }
    }
    return true;
  }
  public boolean putAll(Dictionary<K,V> dictionary){
    for (int i = 0; i <dictionary.keys().length ; i++) {
      for (int q = 0; q <keys.length; q++) {
        if (keys[q] == null){
          keys[q] = dictionary.keys()[i];
          values[q] = dictionary.values()[i];
        }
      }
    }
    return true;
  }
  public K[] keys(){
    return keys;
  }
  public V[]  values(){
    return values;
  }
  public boolean clear(){
    keys = (K[]) new Object[100];
    values = (V[]) new Object[100];
    return true;
  }
}

