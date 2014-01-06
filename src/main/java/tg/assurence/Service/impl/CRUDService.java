/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import tg.assurence.Service.ICRUDService;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tg.assurence.Service.ICRUDService;

/**
 *
 * @author komilo
 */
public abstract class CRUDService<T, PK extends Serializable> implements ICRUDService<T, PK> {

//    protected IDAO<T, PK> dao;

//    public CRUDService(IDAO<T, PK> dao) {
//        this.dao = dao;
//    }

    @Override
    public synchronized T getOne(PK id) {
        return this.getDAO().getOne(id);
    }

    @Override
    public synchronized T getOne(String property, String value) {
        return this.getDAO().getOne(property, value);
    }
    @Override
    public synchronized Long count() {
        return this.getDAO().count();
    }

    @Override
    public synchronized List<T> getAll() {
        return this.getDAO().getAll();
    }

    @Override
    public synchronized List<T> getAll(String sortProperty) {
        return this.getDAO().getAll(sortProperty, true);
    }

    @Override
    public synchronized List<T> getAll(String sortProperty, boolean sortAsc) {
        return this.getDAO().getAll(sortProperty, sortAsc);
    }

    @Override
    public synchronized List<T> getAll(int first, int count, String sortProperty, boolean sortAsc) {
        return this.getDAO().getAll(first, count, sortProperty, sortAsc);
    }

    @Override
    public synchronized T saveOne(T t) {
        return this.getDAO().saveOne(t);
    }

    @Override
    public synchronized T updateOne(T t) {
        return this.getDAO().updateOne(t);
    }

    @Override
    public synchronized void deleteOne(PK id) {
        this.getDAO().deleteOne(id);
    }

    @Override
    public synchronized void deleteOne(T t) {
        this.getDAO().deleteOne(t);
    }

    @Override
    public synchronized void deleteRange(PK[] pks) {
        for (int i = 0; i < pks.length; i++) {
            this.getDAO().deleteOne(pks[i]);
        }
    }

    @Override
    public synchronized void deleteRange(Collection<T> ts) {
//        for (T t : ts) {
//            this.getDAO().deleteOne(t);
//        }
        this.deleteRange(ts.iterator());
    }

    @Override
    public void deleteRange(Iterator<T> ts) {
        while (ts.hasNext()) {
            this.getDAO().deleteOne(ts.next());
        }
    }

    @Override
    public synchronized Collection<T> saveRange(Collection<T> ts) {
//        Collection<T> ts2 = new LinkedList<T>();
//        for (T t : ts) {
//            ts2.add(this.getDAO().saveOne(t));
//        }
//        return ts2;
        return this.saveRange(ts.iterator());
    }

    @Override
    public Collection<T> saveRange(Iterator<T> ts) {
        Collection<T> ts2 = new LinkedList<T>();
        while (ts.hasNext()) {
            ts2.add(this.getDAO().saveOne(ts.next()));
        }
        return ts2;
    }

    @Override
    public synchronized Collection<T> updateRange(Collection<T> ts) {
//        Collection<T> ts2 = new LinkedList<T>();
//        for (T t : ts) {
//            ts2.add(this.getDAO().updateOne(t));
//        }
//        return ts2;
        return this.updateRange(ts.iterator());
    }

    @Override
    public Collection<T> updateRange(Iterator<T> ts) {
        Collection<T> ts2 = new LinkedList<T>();
        while (ts.hasNext()) {
            ts2.add(this.getDAO().updateOne(ts.next()));
        }
        return ts2;
    }

    @Override
    public synchronized void deleteAll() {
        this.getDAO().deleteAll();
    }

    @Override
    public boolean exist(PK pk) {
        return this.getDAO().getOne(pk) != null;
    }
}
