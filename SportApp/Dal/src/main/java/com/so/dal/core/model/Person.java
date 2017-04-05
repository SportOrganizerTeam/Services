package com.so.dal.core.model;
// Generated 27.2.2017 18:41:18 by Hibernate Tools 4.3.1


import com.so.dal.core.model.game.CompetitorTeamPlayer;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name="person"
    ,catalog="sport_app_dev"
)
public class Person  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String surname;
     private Date birthDate;
     private String mail;
     private String phone;
     private boolean isStudent;
     private String sex;
     private Set<CompetitorTeamPlayer> competitorTeamPlayers = new HashSet<>(0);

    public Person() {
    }

	
    public Person(String name, String surname, boolean isStudent, String sex) {
        this.name = name;
        this.surname = surname;
        this.isStudent = isStudent;
        this.sex = sex;
    }
    public Person(String name, String surname, Date birthDate, String mail, String phone, boolean isStudent, String sex, Set<CompetitorTeamPlayer> competitorTeamPlayers) {
       this.name = name;
       this.surname = surname;
       this.birthDate = birthDate;
       this.mail = mail;
       this.phone = phone;
       this.isStudent = isStudent;
       this.sex = sex;
       this.competitorTeamPlayers = competitorTeamPlayers;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=1500)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="surname", nullable=false, length=1500)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="birthDate", length=10)
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    
    @Column(name="mail", length=1500)
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }

    
    @Column(name="phone", length=1500)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="isStudent", nullable=false)
    public boolean isIsStudent() {
        return this.isStudent;
    }
    
    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    
    @Column(name="sex", nullable=false)
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="person")
    public Set<CompetitorTeamPlayer> getCompetitorTeamPlayers() {
        return this.competitorTeamPlayers;
    }
    
    public void setCompetitorTeamPlayers(Set<CompetitorTeamPlayer> competitorTeamPlayers) {
        this.competitorTeamPlayers = competitorTeamPlayers;
    }




}


