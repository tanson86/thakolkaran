package com.thakolkaran.model.entity;
// Generated Jun 9, 2018 7:54:38 PM by Hibernate Tools 5.2.3.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Userdetails generated by hbm2java
 */
@Entity
@Table(name="userdetails"
    ,catalog="thakolkaran"
)
public class Userdetails  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String email;
     private String mobile;
     private boolean notification;
     private Date created;
     private Date updated;

    public Userdetails() {
    }

	
    public Userdetails(User user, boolean notification, Date created, Date updated) {
        this.user = user;
        this.notification = notification;
        this.created = created;
        this.updated = updated;
    }
    public Userdetails(User user, String email, String mobile, boolean notification, Date created, Date updated) {
       this.user = user;
       this.email = email;
       this.mobile = mobile;
       this.notification = notification;
       this.created = created;
       this.updated = updated;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    //@ManyToOne(fetch=FetchType.LAZY)
    //@JoinColumn(name="userid", nullable=false)
    @OneToOne
    @JoinColumn (name="userid",nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="email", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="mobile", length=20)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    @Column(name="notification", nullable=false)
    public boolean isNotification() {
        return this.notification;
    }
    
    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated", nullable=false, length=26)
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }




}


