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
@Table(name = "nameofclass", catalog = "student", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nameofclass_1.findAll", query = "SELECT n FROM Nameofclass_1 n")
    , @NamedQuery(name = "Nameofclass_1.findById", query = "SELECT n FROM Nameofclass_1 n WHERE n.id = :id")
    , @NamedQuery(name = "Nameofclass_1.findByClsId", query = "SELECT n FROM Nameofclass_1 n WHERE n.clsId = :clsId")
    , @NamedQuery(name = "Nameofclass_1.findByNameofclass", query = "SELECT n FROM Nameofclass_1 n WHERE n.nameofclass = :nameofclass")
    , @NamedQuery(name = "Nameofclass_1.findByRoomno", query = "SELECT n FROM Nameofclass_1 n WHERE n.roomno = :roomno")
    , @NamedQuery(name = "Nameofclass_1.findByClasstime", query = "SELECT n FROM Nameofclass_1 n WHERE n.classtime = :classtime")})
public class Nameofclass_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cls_id")
    private String clsId;
    @Column(name = "nameofclass")
    private String nameofclass;
    @Column(name = "roomno")
    private String roomno;
    @Column(name = "classtime")
    private String classtime;

    public Nameofclass_1() {
    }

    public Nameofclass_1(Integer id) {
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

    public String getClsId() {
        return clsId;
    }

    public void setClsId(String clsId) {
        String oldClsId = this.clsId;
        this.clsId = clsId;
        changeSupport.firePropertyChange("clsId", oldClsId, clsId);
    }

    public String getNameofclass() {
        return nameofclass;
    }

    public void setNameofclass(String nameofclass) {
        String oldNameofclass = this.nameofclass;
        this.nameofclass = nameofclass;
        changeSupport.firePropertyChange("nameofclass", oldNameofclass, nameofclass);
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        String oldRoomno = this.roomno;
        this.roomno = roomno;
        changeSupport.firePropertyChange("roomno", oldRoomno, roomno);
    }

    public String getClasstime() {
        return classtime;
    }

    public void setClasstime(String classtime) {
        String oldClasstime = this.classtime;
        this.classtime = classtime;
        changeSupport.firePropertyChange("classtime", oldClasstime, classtime);
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
        if (!(object instanceof Nameofclass_1)) {
            return false;
        }
        Nameofclass_1 other = (Nameofclass_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "src.Nameofclass_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
