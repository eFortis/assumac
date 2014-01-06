/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;


import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tg.assurence.DAO.IDAO;

/**
 *
 * @author komilo
 */
public abstract class DAO<T extends Object, PK extends Serializable> implements IDAO<T, PK> {

  @PersistenceContext(unitName="com.mycompany_assurence_war_1.0-SNAPSHOTPU")
  protected EntityManager em;

  protected Class<T> type;

  public DAO(Class<T> type) {
    this.type = type;
  }

    @Override
  public T getOne(final PK id) {
    return (T) em.find(type, id);
  }

    @Override
  public Long count() {
    return (Long) em
            .createQuery("SELECT COUNT(t) FROM " + type.getSimpleName() + " t")
            .getSingleResult();
  }

    @Override
  public List<T> getAll() {
    return (List<T>) em
            .createQuery("SELECT t FROM " + type.getSimpleName() + " t")
            .getResultList();
  }

    @Override
  public List<T> getAll(String sortProperty, boolean sortAsc) {
    return (List<T>) em.createQuery("SELECT t FROM " + type.getSimpleName()
            + " t ORDER BY t." + sortProperty
            + ((sortAsc) ? " ASC" : " DESC"))
            .getResultList();
  }

    @Override
  public List<T> getAll(int first, int count, String sortProperty, boolean sortAsc) {
    return (List<T>) em.createQuery("SELECT t FROM " + type.getSimpleName()
            + " t ORDER BY t." + sortProperty
            + ((sortAsc) ? " ASC" : " DESC"))
            .setFirstResult(first).setMaxResults(count)
            .getResultList();
  }
     @Override
     public T getOne(String property,String value) {
        String query="SELECT t FROM " + type.getSimpleName() + " t"
                +" WHERE t."+property+"=:donnee";
         try {
//             em.getTransaction().begin();
             
         T t=(T) this.em.createQuery(query).setParameter("donnee",value).getSingleResult();
         System.out.println(query);
//             em.getTransaction().commit();
             return t;
         } catch (Exception e) {
//             if ((em.getTransaction().isActive()))
//               em.getTransaction().rollback();
             
         }
//        this.em.createQuery(query).setParameter("value",value).getSingleResult();  
         return null;
    }
    
    @Override
  public T saveOne(final T t) {
    em.persist(t);
    return t;
  }

    @Override
  public T updateOne(final T t) {
    return (T) em.merge(t);
  }

    @Override
  public boolean deleteOne(final PK id) {
    T t = em.find(type, id);
    if (t == null) {
      return false;
    }
    em.remove(t);
    return true;
  }

    @Override
  public boolean deleteOne(final T t) {
    em.remove(t);
    return true;
  }

    @Override
  public void deleteAll() {
    em.createQuery("DELETE FROM " + type.getSimpleName()).executeUpdate();
  }
}
