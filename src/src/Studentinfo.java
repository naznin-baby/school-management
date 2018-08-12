/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author B1
 */
@Entity
@Table(name = "studentinfo", catalog = "student", schema = "")
@NamedQueries({
    @NamedQuery(name = "Studentinfo.findAll", query = "SELECT s FROM Studentinfo s")
    , @NamedQuery(name = "Studentinfo.findByRoomNo", query = "SELECT s FROM Studentinfo s WHERE s.roomNo = :roomNo")
    , @NamedQuery(name = "Studentinfo.findByClassName", query = "SELECT s FROM Studentinfo s WHERE s.className = :className")
    , @NamedQuery(name = "Studentinfo.findByClassTime", query = "SELECT s FROM Studentinfo s WHERE s.classTime = :classTime")})
public class Studentinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RoomNo")
    private Integer roomNo;
    @Column(name = "ClassName")
    private String className;
    @Column(name = "ClassTime")
    private String classTime;

    public Studentinfo() {
    }

    public Studentinfo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        Integer oldRoomNo = this.roomNo;
        this.roomNo = roomNo;
        changeSupport.firePropertyChange("roomNo", oldRoomNo, roomNo);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        String oldClassName = this.className;
        this.className = className;
        changeSupport.firePropertyChange("className", oldClassName, className);
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        String oldClassTime = this.classTime;
        this.classTime = classTime;
        changeSupport.firePropertyChange("classTime", oldClassTime, classTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomNo != null ? roomNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentinfo)) {
            return false;
        }
        Studentinfo other = (Studentinfo) object;
        if ((this.roomNo == null && other.roomNo != null) || (this.roomNo != null && !this.roomNo.equals(other.roomNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "src.Studentinfo[ roomNo=" + roomNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
