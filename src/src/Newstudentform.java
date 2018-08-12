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
@Table(name = "newstudentform", catalog = "student", schema = "")
@NamedQueries({
    @NamedQuery(name = "Newstudentform.findAll", query = "SELECT n FROM Newstudentform n")
    , @NamedQuery(name = "Newstudentform.findById", query = "SELECT n FROM Newstudentform n WHERE n.id = :id")
    , @NamedQuery(name = "Newstudentform.findByName", query = "SELECT n FROM Newstudentform n WHERE n.name = :name")
    , @NamedQuery(name = "Newstudentform.findByFathername", query = "SELECT n FROM Newstudentform n WHERE n.fathername = :fathername")
    , @NamedQuery(name = "Newstudentform.findByMothername", query = "SELECT n FROM Newstudentform n WHERE n.mothername = :mothername")
    , @NamedQuery(name = "Newstudentform.findByGender", query = "SELECT n FROM Newstudentform n WHERE n.gender = :gender")
    , @NamedQuery(name = "Newstudentform.findByEmail", query = "SELECT n FROM Newstudentform n WHERE n.email = :email")
    , @NamedQuery(name = "Newstudentform.findByAddress", query = "SELECT n FROM Newstudentform n WHERE n.address = :address")
    , @NamedQuery(name = "Newstudentform.findByDateofadmiton", query = "SELECT n FROM Newstudentform n WHERE n.dateofadmiton = :dateofadmiton")
    , @NamedQuery(name = "Newstudentform.findByClassname", query = "SELECT n FROM Newstudentform n WHERE n.classname = :classname")
    , @NamedQuery(name = "Newstudentform.findByDateofbirth", query = "SELECT n FROM Newstudentform n WHERE n.dateofbirth = :dateofbirth")})
public class Newstudentform implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "fathername")
    private String fathername;
    @Column(name = "mothername")
    private String mothername;
    @Column(name = "gender")
    private String gender;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "dateofadmiton")
    private String dateofadmiton;
    @Column(name = "classname")
    private String classname;
    @Column(name = "dateofbirth")
    private String dateofbirth;

    public Newstudentform() {
    }

    public Newstudentform(Integer id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        String oldFathername = this.fathername;
        this.fathername = fathername;
        changeSupport.firePropertyChange("fathername", oldFathername, fathername);
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        String oldMothername = this.mothername;
        this.mothername = mothername;
        changeSupport.firePropertyChange("mothername", oldMothername, mothername);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getDateofadmiton() {
        return dateofadmiton;
    }

    public void setDateofadmiton(String dateofadmiton) {
        String oldDateofadmiton = this.dateofadmiton;
        this.dateofadmiton = dateofadmiton;
        changeSupport.firePropertyChange("dateofadmiton", oldDateofadmiton, dateofadmiton);
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        String oldClassname = this.classname;
        this.classname = classname;
        changeSupport.firePropertyChange("classname", oldClassname, classname);
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        String oldDateofbirth = this.dateofbirth;
        this.dateofbirth = dateofbirth;
        changeSupport.firePropertyChange("dateofbirth", oldDateofbirth, dateofbirth);
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
        if (!(object instanceof Newstudentform)) {
            return false;
        }
        Newstudentform other = (Newstudentform) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "src.Newstudentform[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
