/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author B1
 */
@Entity
@Table(name = "studentattend", catalog = "student", schema = "")
@NamedQueries({
    @NamedQuery(name = "Studentattend.findAll", query = "SELECT s FROM Studentattend s")
    , @NamedQuery(name = "Studentattend.findById", query = "SELECT s FROM Studentattend s WHERE s.id = :id")
    , @NamedQuery(name = "Studentattend.findByClassname", query = "SELECT s FROM Studentattend s WHERE s.classname = :classname")
    , @NamedQuery(name = "Studentattend.findByTotalstu", query = "SELECT s FROM Studentattend s WHERE s.totalstu = :totalstu")
    , @NamedQuery(name = "Studentattend.findByPresentstu", query = "SELECT s FROM Studentattend s WHERE s.presentstu = :presentstu")
    , @NamedQuery(name = "Studentattend.findByAbsence", query = "SELECT s FROM Studentattend s WHERE s.absence = :absence")
    , @NamedQuery(name = "Studentattend.findByAttendDate", query = "SELECT s FROM Studentattend s WHERE s.attendDate = :attendDate")})
public class Studentattend implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "classname")
    private String classname;
    @Column(name = "totalstu")
    private String totalstu;
    @Column(name = "presentstu")
    private String presentstu;
    @Column(name = "absence")
    private String absence;
    @Column(name = "attend_date")
    @Temporal(TemporalType.DATE)
    private Date attendDate;

    public Studentattend() {
    }

    public Studentattend(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        String oldClassname = this.classname;
        this.classname = classname;
        changeSupport.firePropertyChange("classname", oldClassname, classname);
    }

    public String getTotalstu() {
        return totalstu;
    }

    public void setTotalstu(String totalstu) {
        String oldTotalstu = this.totalstu;
        this.totalstu = totalstu;
        changeSupport.firePropertyChange("totalstu", oldTotalstu, totalstu);
    }

    public String getPresentstu() {
        return presentstu;
    }

    public void setPresentstu(String presentstu) {
        String oldPresentstu = this.presentstu;
        this.presentstu = presentstu;
        changeSupport.firePropertyChange("presentstu", oldPresentstu, presentstu);
    }

    public String getAbsence() {
        return absence;
    }

    public void setAbsence(String absence) {
        String oldAbsence = this.absence;
        this.absence = absence;
        changeSupport.firePropertyChange("absence", oldAbsence, absence);
    }

    public Date getAttendDate() {
        return attendDate;
    }

    public void setAttendDate(Date attendDate) {
        Date oldAttendDate = this.attendDate;
        this.attendDate = attendDate;
        changeSupport.firePropertyChange("attendDate", oldAttendDate, attendDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentattend)) {
            return false;
        }
        Studentattend other = (Studentattend) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "src.Studentattend[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
