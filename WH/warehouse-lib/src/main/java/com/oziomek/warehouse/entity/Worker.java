/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oziomek.warehouse.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oziomek
 */
@Entity
@Table(name = "WORKER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Worker.findAll", query = "SELECT w FROM Worker w")
    , @NamedQuery(name = "Worker.findById", query = "SELECT w FROM Worker w WHERE w.id = :id")
    , @NamedQuery(name = "Worker.findByName", query = "SELECT w FROM Worker w WHERE w.name = :name")
    , @NamedQuery(name = "Worker.findByBirthDate", query = "SELECT w FROM Worker w WHERE w.birthDate = :birthDate")
    , @NamedQuery(name = "Worker.findByExperience", query = "SELECT w FROM Worker w WHERE w.experience = :experience")
    , @NamedQuery(name = "Worker.findByJob", query = "SELECT w FROM Worker w WHERE w.job = :job")
    , @NamedQuery(name = "Worker.findByHoursAWeek", query = "SELECT w FROM Worker w WHERE w.hoursAWeek = :hoursAWeek")
    , @NamedQuery(name = "Worker.findByNightShift", query = "SELECT w FROM Worker w WHERE w.nightShift = :nightShift")})
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    
    @Column(name = "EXPERIENCE")
    private Integer experience;
    
    @Column(name = "JOB")
    private JobType job;
    
    @Column(name = "HOURS_A_WEEK")
    private Integer hoursAWeek;
    
    @Column(name = "NIGHT_SHIFT")
    private Boolean nightShift;

    public Worker() {
    }

    public Worker(Integer id) {
        this.id = id;
    }

    public Worker(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public JobType getJob() {
        return job;
    }

    public void setJob(JobType job) {
        this.job = job;
    }

    public Integer getHoursAWeek() {
        return hoursAWeek;
    }

    public void setHoursAWeek(Integer hoursAWeek) {
        this.hoursAWeek = hoursAWeek;
    }

    public Boolean getNightShift() {
        return nightShift;
    }

    public void setNightShift(Boolean nightShift) {
        this.nightShift = nightShift;
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
        if (!(object instanceof Worker)) {
            return false;
        }
        Worker other = (Worker) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oziomek.warehouse.entity.Worker[ id=" + id + " ]";
    }
    
    public enum JobType {
        BEGINNER, JUNIOR, MIDDLE, SENIOR, MANAGER;
    }
    
}
