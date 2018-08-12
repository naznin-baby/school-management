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
@Table(name = "studentresult", catalog = "student", schema = "")
@NamedQueries({
    @NamedQuery(name = "Studentresult_1.findAll", query = "SELECT s FROM Studentresult_1 s")
    , @NamedQuery(name = "Studentresult_1.findById", query = "SELECT s FROM Studentresult_1 s WHERE s.id = :id")
    , @NamedQuery(name = "Studentresult_1.findByClassname", query = "SELECT s FROM Studentresult_1 s WHERE s.classname = :classname")
    , @NamedQuery(name = "Studentresult_1.findBySturoll", query = "SELECT s FROM Studentresult_1 s WHERE s.sturoll = :sturoll")
    , @NamedQuery(name = "Studentresult_1.findByStuname", query = "SELECT s FROM Studentresult_1 s WHERE s.stuname = :stuname")
    , @NamedQuery(name = "Studentresult_1.findByBan1", query = "SELECT s FROM Studentresult_1 s WHERE s.ban1 = :ban1")
    , @NamedQuery(name = "Studentresult_1.findByBan2", query = "SELECT s FROM Studentresult_1 s WHERE s.ban2 = :ban2")
    , @NamedQuery(name = "Studentresult_1.findByEng", query = "SELECT s FROM Studentresult_1 s WHERE s.eng = :eng")
    , @NamedQuery(name = "Studentresult_1.findByEng1", query = "SELECT s FROM Studentresult_1 s WHERE s.eng1 = :eng1")
    , @NamedQuery(name = "Studentresult_1.findByMath", query = "SELECT s FROM Studentresult_1 s WHERE s.math = :math")
    , @NamedQuery(name = "Studentresult_1.findByScience", query = "SELECT s FROM Studentresult_1 s WHERE s.science = :science")
    , @NamedQuery(name = "Studentresult_1.findBySocal", query = "SELECT s FROM Studentresult_1 s WHERE s.socal = :socal")
    , @NamedQuery(name = "Studentresult_1.findByReligien", query = "SELECT s FROM Studentresult_1 s WHERE s.religien = :religien")
    , @NamedQuery(name = "Studentresult_1.findByAgri", query = "SELECT s FROM Studentresult_1 s WHERE s.agri = :agri")
    , @NamedQuery(name = "Studentresult_1.findByTotal", query = "SELECT s FROM Studentresult_1 s WHERE s.total = :total")})
public class Studentresult_1 implements Serializable {

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
    @Column(name = "sturoll")
    private String sturoll;
    @Column(name = "stuname")
    private String stuname;
    @Column(name = "ban1")
    private String ban1;
    @Column(name = "ban2")
    private String ban2;
    @Column(name = "eng")
    private String eng;
    @Column(name = "eng1")
    private String eng1;
    @Column(name = "math")
    private String math;
    @Column(name = "science")
    private String science;
    @Column(name = "socal")
    private String socal;
    @Column(name = "religien")
    private String religien;
    @Column(name = "agri")
    private String agri;
    @Column(name = "total")
    private String total;

    public Studentresult_1() {
    }

    public Studentresult_1(Integer id) {
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

    public String getSturoll() {
        return sturoll;
    }

    public void setSturoll(String sturoll) {
        String oldSturoll = this.sturoll;
        this.sturoll = sturoll;
        changeSupport.firePropertyChange("sturoll", oldSturoll, sturoll);
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        String oldStuname = this.stuname;
        this.stuname = stuname;
        changeSupport.firePropertyChange("stuname", oldStuname, stuname);
    }

    public String getBan1() {
        return ban1;
    }

    public void setBan1(String ban1) {
        String oldBan1 = this.ban1;
        this.ban1 = ban1;
        changeSupport.firePropertyChange("ban1", oldBan1, ban1);
    }

    public String getBan2() {
        return ban2;
    }

    public void setBan2(String ban2) {
        String oldBan2 = this.ban2;
        this.ban2 = ban2;
        changeSupport.firePropertyChange("ban2", oldBan2, ban2);
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        String oldEng = this.eng;
        this.eng = eng;
        changeSupport.firePropertyChange("eng", oldEng, eng);
    }

    public String getEng1() {
        return eng1;
    }

    public void setEng1(String eng1) {
        String oldEng1 = this.eng1;
        this.eng1 = eng1;
        changeSupport.firePropertyChange("eng1", oldEng1, eng1);
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        String oldMath = this.math;
        this.math = math;
        changeSupport.firePropertyChange("math", oldMath, math);
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        String oldScience = this.science;
        this.science = science;
        changeSupport.firePropertyChange("science", oldScience, science);
    }

    public String getSocal() {
        return socal;
    }

    public void setSocal(String socal) {
        String oldSocal = this.socal;
        this.socal = socal;
        changeSupport.firePropertyChange("socal", oldSocal, socal);
    }

    public String getReligien() {
        return religien;
    }

    public void setReligien(String religien) {
        String oldReligien = this.religien;
        this.religien = religien;
        changeSupport.firePropertyChange("religien", oldReligien, religien);
    }

    public String getAgri() {
        return agri;
    }

    public void setAgri(String agri) {
        String oldAgri = this.agri;
        this.agri = agri;
        changeSupport.firePropertyChange("agri", oldAgri, agri);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        String oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
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
        if (!(object instanceof Studentresult_1)) {
            return false;
        }
        Studentresult_1 other = (Studentresult_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "src.Studentresult_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
