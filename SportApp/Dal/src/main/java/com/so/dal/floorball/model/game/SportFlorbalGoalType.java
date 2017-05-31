package com.so.dal.floorball.model.game;
// Generated 27.2.2017 18:41:18 by Hibernate Tools 4.3.1


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

/**
 * SportFlorbalGoalType generated by hbm2java
 */
@Entity
@Table(name="sportFlorbalGoalType"
    ,catalog="sport_app_dev"
)
public class SportFlorbalGoalType  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set<SportFlorbalGameActivity> sportFlorbalGameActivities = new HashSet<>(0);
     private Boolean cancelPenalty;
     

    public SportFlorbalGoalType() {
    }

	
    public SportFlorbalGoalType(String name) {
        this.name = name;
    }
    public SportFlorbalGoalType(String name, Set<SportFlorbalGameActivity> sportFlorbalGameActivities) {
       this.name = name;
       this.sportFlorbalGameActivities = sportFlorbalGameActivities;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="sportFlorbalGoalType")
    public Set<SportFlorbalGameActivity> getSportFlorbalGameActivities() {
        return this.sportFlorbalGameActivities;
    }
    
    public void setSportFlorbalGameActivities(Set<SportFlorbalGameActivity> sportFlorbalGameActivities) {
        this.sportFlorbalGameActivities = sportFlorbalGameActivities;
    }

    @Column(name="cancelPenalty", nullable=false)
    public Boolean getCancelPenalty() {
        return cancelPenalty;
    }

    public void setCancelPenalty(Boolean cancelPenalty) {
        this.cancelPenalty = cancelPenalty;
    }


}


