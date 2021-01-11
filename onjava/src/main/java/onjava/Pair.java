package onjava;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class Pair<K,V> {
  public final K key;
  public final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }
  public K key(){
    return key;
  }
  public V value(){
    return value;
  }
  public static <K,V> Pair<K,V> make(K k,V v){
    return new Pair<K, V>(k, v);
  }
}
