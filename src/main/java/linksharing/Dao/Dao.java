package linksharing.Dao;

import java.util.List;

/**
 * Created by miral on 7/14/2017.
 */
public interface Dao<T> {
    List<T> list();

    T get(Integer id);

    T load(Long id);

    T save(T entity);

    T update(T entity);

    T refresh(T entity);

    void delete(T entity);
}
