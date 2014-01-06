/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service;

import tg.assurence.DAO.IDAO;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author komilo
 */

public interface ICRUDService<T, PK extends Serializable> {

    IDAO<T, PK> getDAO();

    T getOne(PK id);
    T getOne(String property, String value);
    Long count();

    List<T> getAll();

    List<T> getAll(String sortProperty);

    List<T> getAll(String sortProperty, boolean sortAsc);

    List<T> getAll(int first, int count, String sortProperty, boolean sortAsc);

    T saveOne(final T t);

    T updateOne(final T t);

    void deleteOne(PK id);

    void deleteOne(final T t);

    void deleteRange(PK[] pks);

    void deleteRange(Collection<T> ts);

    void deleteRange(Iterator<T> ts);

    Collection<T> saveRange(Collection<T> ts);

    Collection<T> saveRange(Iterator<T> ts);

    Collection<T> updateRange(Collection<T> ts);

    Collection<T> updateRange(Iterator<T> ts);

    void deleteAll();

    boolean exist(final PK pk);
}
