/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author komilo
 */
@Entity
@Table(name = "permission_categories")
public class PermissionCategory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", length = 128)
    private String id;

    @Column(name = "wording_key", nullable = true)
    private String wordingKey;

    @Column(name = "default_wording", nullable = true)
    private String defaultWording;

    public PermissionCategory() {
    }

    public PermissionCategory(String id) {
        this.id = id;
    }

    public PermissionCategory(String id, String wordingKey, String defaultWording) {
        this.id = id;
        this.wordingKey = wordingKey;
        this.defaultWording = defaultWording;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefaultWording() {
        return defaultWording;
    }

    public void setDefaultWording(String defaultWording) {
        this.defaultWording = defaultWording;
    }

    public String getWordingKey() {
        return wordingKey;
    }

    public void setWordingKey(String wordingKey) {
        this.wordingKey = wordingKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PermissionCategory) || (object == null )) {
            return false;
        }
        PermissionCategory other = (PermissionCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.defaultWording;
    }

}
