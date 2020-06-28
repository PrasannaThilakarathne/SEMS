/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sems;

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
 * @author ASUS
 */
@Entity
@Table(name = "student", catalog = "exmsystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student_1.findAll", query = "SELECT s FROM Student_1 s"),
    @NamedQuery(name = "Student_1.findByRegid", query = "SELECT s FROM Student_1 s WHERE s.regid = :regid"),
    @NamedQuery(name = "Student_1.findByFirstname", query = "SELECT s FROM Student_1 s WHERE s.firstname = :firstname"),
    @NamedQuery(name = "Student_1.findByLastname", query = "SELECT s FROM Student_1 s WHERE s.lastname = :lastname"),
    @NamedQuery(name = "Student_1.findByEmail", query = "SELECT s FROM Student_1 s WHERE s.email = :email"),
    @NamedQuery(name = "Student_1.findByAge", query = "SELECT s FROM Student_1 s WHERE s.age = :age"),
    @NamedQuery(name = "Student_1.findByAddress", query = "SELECT s FROM Student_1 s WHERE s.address = :address"),
    @NamedQuery(name = "Student_1.findByGender", query = "SELECT s FROM Student_1 s WHERE s.gender = :gender"),
    @NamedQuery(name = "Student_1.findByFaculty", query = "SELECT s FROM Student_1 s WHERE s.faculty = :faculty"),
    @NamedQuery(name = "Student_1.findByDepartment", query = "SELECT s FROM Student_1 s WHERE s.department = :department"),
    @NamedQuery(name = "Student_1.findByYearofreg", query = "SELECT s FROM Student_1 s WHERE s.yearofreg = :yearofreg")})
public class Student_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "regid")
    private Integer regid;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "faculty")
    private String faculty;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "yearofreg")
    private int yearofreg;

    public Student_1() {
    }

    public Student_1(Integer regid) {
        this.regid = regid;
    }

    public Student_1(Integer regid, String firstname, String lastname, String email, int age, String address, String gender, String faculty, String department, int yearofreg) {
        this.regid = regid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.faculty = faculty;
        this.department = department;
        this.yearofreg = yearofreg;
    }

    public Integer getRegid() {
        return regid;
    }

    public void setRegid(Integer regid) {
        Integer oldRegid = this.regid;
        this.regid = regid;
        changeSupport.firePropertyChange("regid", oldRegid, regid);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        String oldFaculty = this.faculty;
        this.faculty = faculty;
        changeSupport.firePropertyChange("faculty", oldFaculty, faculty);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public int getYearofreg() {
        return yearofreg;
    }

    public void setYearofreg(int yearofreg) {
        int oldYearofreg = this.yearofreg;
        this.yearofreg = yearofreg;
        changeSupport.firePropertyChange("yearofreg", oldYearofreg, yearofreg);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regid != null ? regid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student_1)) {
            return false;
        }
        Student_1 other = (Student_1) object;
        if ((this.regid == null && other.regid != null) || (this.regid != null && !this.regid.equals(other.regid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sems.Student_1[ regid=" + regid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
