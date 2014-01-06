/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.DAO;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author komilo
 */
@Local
public interface IDAO<T, PK extends Serializable> {

  T getOne(final PK id);
  T getOne(String property, String value);
  Long count();

  List<T> getAll();

  List<T> getAll(String sortProperty, boolean sortAsc);

  List<T> getAll(int first, int count, String sortProperty, boolean sortAsc);

  T saveOne(final T t);

  T updateOne(final T t);

  boolean deleteOne(final PK id);

  boolean deleteOne(final T t);

  void deleteAll();
}
