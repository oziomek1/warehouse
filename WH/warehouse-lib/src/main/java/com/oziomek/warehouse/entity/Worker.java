/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oziomek.warehouse.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author oziomek
 */
@Entity
@Table(name = "WORKER")
@NamedQueries({
    @NamedQuery(name = "Worker.showAll", query = "SELECT w FROM Worker w")})
public class Worker implements Serializable {
    
    @Id
    @NotNull
    @Column(name = "ID")
    private Integer workerId;
    
    @Size(min = 1, max = 40)
    @Column(name = "NAME")
    private String workerName;
    
    @Size(min = 3, max = 40)
    @Column(name = "CITY")
    private String workerCity;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BIRTH_DATE")
    private String workerBirthDate;
    
    @Column(name = "EXPERIENCE")
    private Integer workerExperience;
    
    @Column(name = "JOB")
    private JobType workerJob;
            
    @Column(name = "HOURS_A_WEEK")
    private Integer workerHoursPerWeek;
    
    @Column(name = "NIGHT_SHIFT")
    private Boolean canNightShift;

    public Worker() {
    }

    public Worker(Integer workerId, String workerName, String workerCity, String workerBirthDate, Integer workerExperience, JobType workerJob, Integer workerHoursPerWeek, Boolean canNightShift) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerCity = workerCity;
        this.workerBirthDate = workerBirthDate;
        this.workerExperience = workerExperience;
        this.workerJob = workerJob;
        this.workerHoursPerWeek = workerHoursPerWeek;
        this.canNightShift = canNightShift;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerCity() {
        return workerCity;
    }

    public void setWorkerCity(String workerCity) {
        this.workerCity = workerCity;
    }

    public String getWorkerBirthDate() {
        return workerBirthDate;
    }

    public void setWorkerBirthDate(String workerBirthDate) {
        this.workerBirthDate = workerBirthDate;
    }

    public Integer getWorkerExperience() {
        return workerExperience;
    }

    public void setWorkerExperience(Integer workerExperience) {
        this.workerExperience = workerExperience;
    }

    public JobType getWorkerJob() {
        return workerJob;
    }

    public void setWorkerJob(JobType workerJob) {
        this.workerJob = workerJob;
    }

    public Integer getWorkerHoursPerWeek() {
        return workerHoursPerWeek;
    }

    public void setWorkerHoursPerWeek(Integer workerHoursPerWeek) {
        this.workerHoursPerWeek = workerHoursPerWeek;
    }

    public Boolean getCanNightShift() {
        return canNightShift;
    }

    public void setCanNightShift(Boolean canNightShift) {
        this.canNightShift = canNightShift;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = (workerId != null ? workerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Worker other = (Worker) obj;
        return Objects.equals(this.workerId, other.workerId);
    }

    @Override
    public String toString() {
        return "Worker{" + "workerId=" + workerId + ", workerName=" + workerName + ", workerCity=" + workerCity + ", workerBirthDate=" + workerBirthDate + ", workerExperience=" + workerExperience + ", workerJob=" + workerJob + ", workerHoursPerWeek=" + workerHoursPerWeek + ", canNightShift=" + canNightShift + '}';
    }
    
    public enum JobType {
        BEGINNER(0), JUNIOR(1), MIDDLE(2), SENIOR(3), MANAGER(4);
        
        private int value;
        
        JobType(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return this.value;
        }
        
        public static JobType parse(int id) {
            JobType jobType = null;
            for (JobType job : JobType.values()) {
                if (job.getValue() == id) {
                    jobType = job;
                    break;
                }
            }
            return jobType;
        }
    }
}
