import java.io.PrintStream;

public interface MapADT<K, V> {
    boolean insert(K key, V value);
    boolean remove(K key);
    V get(K key);
    boolean contains(K key);
    int getLength();
    boolean isEmpty();
    void print(PrintStream out);
}
