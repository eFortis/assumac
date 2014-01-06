/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tg.assurence.entity;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;


@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Version
    @Column(name="version", nullable=false)
    protected Integer version = 1;

    public BaseEntity() {
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public String getDateAsString(Date date) {
        DateFormat fullDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        return fullDateFormat.format(date) ;
    }
}
