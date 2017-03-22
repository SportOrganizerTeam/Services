package com.so.dal.core.model.season;
// Generated 27.2.2017 18:41:18 by Hibernate Tools 4.3.1


import com.so.dal.core.model.game.Game;
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

/**
 * SeasonTournamentRound generated by hbm2java
 */
@Entity
@Table(name="seasonTournamentRound"
    ,catalog="sport_app_dev"
)
public class SeasonTournamentRound  implements java.io.Serializable {


     private Integer id;
     private SeasonTournament seasonTournament;
     private String name;
     private Set<Game> games = new HashSet<Game>(0);

    public SeasonTournamentRound() {
    }

	
    public SeasonTournamentRound(SeasonTournament seasonTournament, String name) {
        this.seasonTournament = seasonTournament;
        this.name = name;
    }
    public SeasonTournamentRound(SeasonTournament seasonTournament, String name, Set<Game> games) {
       this.seasonTournament = seasonTournament;
       this.name = name;
       this.games = games;
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
    @JoinColumn(name="idSeasonTournament", nullable=false)
    public SeasonTournament getSeasonTournament() {
        return this.seasonTournament;
    }
    
    public void setSeasonTournament(SeasonTournament seasonTournament) {
        this.seasonTournament = seasonTournament;
    }

    
    @Column(name="name", nullable=false, length=1000)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="seasonTournamentRound")
    public Set<Game> getGames() {
        return this.games;
    }
    
    public void setGames(Set<Game> games) {
        this.games = games;
    }




}

