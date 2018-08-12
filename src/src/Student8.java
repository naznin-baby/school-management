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
@Table(name = "student8", catalog = "student", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student8.findAll", query = "SELECT s FROM Student8 s")
    , @NamedQuery(name = "Student8.findBySRoll", query = "SELECT s FROM Student8 s WHERE s.sRoll = :sRoll")
    , @NamedQuery(name = "Student8.findByStudentname", query = "SELECT s FROM Student8 s WHERE s.studentname = :studentname")
    , @NamedQuery(name = "Student8.findByNameofclass", query = "SELECT s FROM Student8 s WHERE s.nameofclass = :nameofclass")})
public class Student8 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "s_roll")
    private Integer sRoll;
    @Column(name = "studentname")
    private String studentname;
    @Column(name = "nameofclass")
    private String nameofclass;

    public Student8() {
    }

    public Student8(Integer sRoll) {
        this.sRoll = sRoll;
    }

    public Integer getSRoll() {
        return sRoll;
    }

    public void setSRoll(Integer sRoll) {
        Integer oldSRoll = this.sRoll;
        this.sRoll = sRoll;
        changeSupport.firePropertyChange("SRoll", oldSRoll, sRoll);
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        String oldStudentname = this.studentname;
        this.studentname = studentname;
        changeSupport.firePropertyChange("studentname", oldStudentname, studentname);
    }

    public String getNameofclass() {
        return nameofclass;
    }

    public void setNameofclass(String nameofclass) {
        String oldNameofclass = this.nameofclass;
        this.nameofclass = nameofclass;
        changeSupport.firePropertyChange("nameofclass", oldNameofclass, nameofclass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sRoll != null ? sRoll.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student8)) {
            return false;
        }
        Student8 other = (Student8) object;
        if ((this.sRoll == null && other.sRoll != null) || (this.sRoll != null && !this.sRoll.equals(other.sRoll))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "src.Student8[ sRoll=" + sRoll + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
