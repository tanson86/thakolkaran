package com.thakolkaran.model.entity;
// Generated Jun 9, 2018 7:54:38 PM by Hibernate Tools 5.2.3.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Visitors generated by hbm2java
 */
@Entity
@Table(name="visitors"
    ,catalog="thakolkaran"
)
public class Visitors  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Date created;
     private Date updated;

    public Visitors() {
    }

    public Visitors(String name, Date created, Date updated) {
       this.name = name;
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

    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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


