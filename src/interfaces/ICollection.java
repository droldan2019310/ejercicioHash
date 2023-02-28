package interfaces;

public interface ICollection<T> {
    void insert(T value);
    void insertMany(T[] values);
    T getNext();
    void deleteNext();
}
