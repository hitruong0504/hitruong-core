import java.util.List;

public interface CRUD <T>{
    boolean add(T item);
    T get(String id);
    List<T> getAll();
    boolean remove(String id);
    boolean remove(T item);
    boolean update(T item);
}
