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
 * Pagevisited generated by hbm2java
 */
@Entity
@Table(name="pagevisited"
    ,catalog="thakolkaran"
)
public class Pagevisited  implements java.io.Serializable {


     private Integer id;
     private String page;
     private Date created;

    public Pagevisited() {
    }

    public Pagevisited(String page, Date created) {
       this.page = page;
       this.created = created;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="page", nullable=false, length=100)
    public String getPage() {
        return this.page;
    }
    
    public void setPage(String page) {
        this.page = page;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=26)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }




}


