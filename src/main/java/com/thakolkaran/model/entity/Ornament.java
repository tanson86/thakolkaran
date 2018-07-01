package com.thakolkaran.model.entity;
// Generated Jun 9, 2018 7:54:38 PM by Hibernate Tools 5.2.3.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Ornament generated by hbm2java
 */
@Entity
@Table(name="ornament"
    ,catalog="thakolkaran"
    , uniqueConstraints = {@UniqueConstraint(columnNames="imagepath"), @UniqueConstraint(columnNames="name")} 
)
public class Ornament  implements java.io.Serializable {


     private Integer id;
     private Metal metal;
     private String name;
     private String imagepath;
     private float goldweight;
     private float stoneweight;
     private float stonecost;
     private float makingcharge;
     private String purity;
     private String certification;
     private boolean isvisible;
     private Date created;
     private Date updated;
     private Set<Categoryornamentmapping> categoryornamentmappings = new HashSet<Categoryornamentmapping>(0);
     private Set<Cartornamentmapping> cartornamentmappings = new HashSet<Cartornamentmapping>(0);

    public Ornament() {
    }

	
    public Ornament(Metal metal, String name, String imagepath, float goldweight, float stoneweight, float stonecost, float makingcharge, String purity, String certification, boolean isvisible, Date created, Date updated) {
        this.metal = metal;
        this.name = name;
        this.imagepath = imagepath;
        this.goldweight = goldweight;
        this.stoneweight = stoneweight;
        this.stonecost = stonecost;
        this.makingcharge = makingcharge;
        this.purity = purity;
        this.certification = certification;
        this.isvisible = isvisible;
        this.created = created;
        this.updated = updated;
    }
    public Ornament(Metal metal, String name, String imagepath, float goldweight, float stoneweight, float stonecost, float makingcharge, String purity, String certification, boolean isvisible, Date created, Date updated, Set<Categoryornamentmapping> categoryornamentmappings, Set<Cartornamentmapping> cartornamentmappings) {
       this.metal = metal;
       this.name = name;
       this.imagepath = imagepath;
       this.goldweight = goldweight;
       this.stoneweight = stoneweight;
       this.stonecost = stonecost;
       this.makingcharge = makingcharge;
       this.purity = purity;
       this.certification = certification;
       this.isvisible = isvisible;
       this.created = created;
       this.updated = updated;
       this.categoryornamentmappings = categoryornamentmappings;
       this.cartornamentmappings = cartornamentmappings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="metalid", nullable=false)
    public Metal getMetal() {
        return this.metal;
    }
    
    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    
    @Column(name="name", unique=true, nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="imagepath", unique=true, nullable=false, length=100)
    public String getImagepath() {
        return this.imagepath;
    }
    
    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    
    @Column(name="goldweight", nullable=false, precision=12, scale=0)
    public float getGoldweight() {
        return this.goldweight;
    }
    
    public void setGoldweight(float goldweight) {
        this.goldweight = goldweight;
    }

    
    @Column(name="stoneweight", nullable=false, precision=12, scale=0)
    public float getStoneweight() {
        return this.stoneweight;
    }
    
    public void setStoneweight(float stoneweight) {
        this.stoneweight = stoneweight;
    }

    
    @Column(name="stonecost", nullable=false, precision=12, scale=0)
    public float getStonecost() {
        return this.stonecost;
    }
    
    public void setStonecost(float stonecost) {
        this.stonecost = stonecost;
    }

    
    @Column(name="makingcharge", nullable=false, precision=12, scale=0)
    public float getMakingcharge() {
        return this.makingcharge;
    }
    
    public void setMakingcharge(float makingcharge) {
        this.makingcharge = makingcharge;
    }

    
    @Column(name="purity", nullable=false, length=45)
    public String getPurity() {
        return this.purity;
    }
    
    public void setPurity(String purity) {
        this.purity = purity;
    }

    
    @Column(name="certification", nullable=false, length=45)
    public String getCertification() {
        return this.certification;
    }
    
    public void setCertification(String certification) {
        this.certification = certification;
    }

    
    @Column(name="isvisible", nullable=false)
    public boolean isIsvisible() {
        return this.isvisible;
    }
    
    public void setIsvisible(boolean isvisible) {
        this.isvisible = isvisible;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="ornament")
    public Set<Categoryornamentmapping> getCategoryornamentmappings() {
        return this.categoryornamentmappings;
    }
    
    public void setCategoryornamentmappings(Set<Categoryornamentmapping> categoryornamentmappings) {
        this.categoryornamentmappings = categoryornamentmappings;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ornament")
    public Set<Cartornamentmapping> getCartornamentmappings() {
        return this.cartornamentmappings;
    }
    
    public void setCartornamentmappings(Set<Cartornamentmapping> cartornamentmappings) {
        this.cartornamentmappings = cartornamentmappings;
    }




}


