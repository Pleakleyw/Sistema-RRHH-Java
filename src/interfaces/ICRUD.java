
package interfaces;

import java.util.List;

public interface ICRUD <T>{
    public abstract boolean insert(T t);
    public abstract boolean update(T t);
    public abstract List<T> selectAll();
    public abstract T selectById(Object id);
    public abstract boolean delete(Object id);
}
