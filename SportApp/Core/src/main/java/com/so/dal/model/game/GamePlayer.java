package com.so.dal.model.game;
// Generated 24.2.2017 14:54:46 by Hibernate Tools 4.3.1



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GamePlayer generated by hbm2java
 */
@Entity
@Table(name="gamePlayer"
    ,catalog="sport_app_dev"
)
public class GamePlayer  implements java.io.Serializable {


     private Integer id;
     private CompetitorTeamPlayer competitorTeamPlayer;
     private SportFlorbalGame sportFlorbalGame;
//     private Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdAssistPlayer = new HashSet<SportFlorbalGameActivity>(0);
//     private Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdGoalPlayer = new HashSet<SportFlorbalGameActivity>(0);
//     private Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdAssist2player = new HashSet<SportFlorbalGameActivity>(0);
//     private Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdPenaltyPlayer = new HashSet<SportFlorbalGameActivity>(0);

    public GamePlayer() {
    }

	
    public GamePlayer(CompetitorTeamPlayer competitorTeamPlayer,SportFlorbalGame sportFlorbalGame) {
        this.competitorTeamPlayer = competitorTeamPlayer;
        this.sportFlorbalGame = sportFlorbalGame;
    }
//    public GamePlayer(CompetitorTeamPlayer competitorTeamPlayer, Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdAssistPlayer, Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdGoalPlayer, Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdAssist2player, Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdPenaltyPlayer) {
//       this.competitorTeamPlayer = competitorTeamPlayer;
//     //  this.sportFlorbalGame = sportFlorbalGame;
//       this.sportFlorbalGameActivitiesForIdAssistPlayer = sportFlorbalGameActivitiesForIdAssistPlayer;
//       this.sportFlorbalGameActivitiesForIdGoalPlayer = sportFlorbalGameActivitiesForIdGoalPlayer;
//       this.sportFlorbalGameActivitiesForIdAssist2player = sportFlorbalGameActivitiesForIdAssist2player;
//       this.sportFlorbalGameActivitiesForIdPenaltyPlayer = sportFlorbalGameActivitiesForIdPenaltyPlayer;
//    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCompetitorTeamPlayer", nullable=false)
    public CompetitorTeamPlayer getCompetitorTeamPlayer() {
        return this.competitorTeamPlayer;
    }
    
    public void setCompetitorTeamPlayer(CompetitorTeamPlayer competitorTeamPlayer) {
        this.competitorTeamPlayer = competitorTeamPlayer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idGame", nullable=false)
    public SportFlorbalGame getSportFlorbalGame() {
        return this.sportFlorbalGame;
    }
    
    public void setSportFlorbalGame(SportFlorbalGame sportFlorbalGame) {
        this.sportFlorbalGame = sportFlorbalGame;
    }

//@OneToMany(fetch=FetchType.LAZY, mappedBy="gamePlayerByIdAssistPlayer")
//    public Set<SportFlorbalGameActivity> getSportFlorbalGameActivitiesForIdAssistPlayer() {
//        return this.sportFlorbalGameActivitiesForIdAssistPlayer;
//    }
//    
//    public void setSportFlorbalGameActivitiesForIdAssistPlayer(Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdAssistPlayer) {
//        this.sportFlorbalGameActivitiesForIdAssistPlayer = sportFlorbalGameActivitiesForIdAssistPlayer;
//    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="gamePlayerByIdGoalPlayer")
//    public Set<SportFlorbalGameActivity> getSportFlorbalGameActivitiesForIdGoalPlayer() {
//        return this.sportFlorbalGameActivitiesForIdGoalPlayer;
//    }
//    
//    public void setSportFlorbalGameActivitiesForIdGoalPlayer(Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdGoalPlayer) {
//        this.sportFlorbalGameActivitiesForIdGoalPlayer = sportFlorbalGameActivitiesForIdGoalPlayer;
//    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="gamePlayerByIdAssist2player")
//    public Set<SportFlorbalGameActivity> getSportFlorbalGameActivitiesForIdAssist2player() {
//        return this.sportFlorbalGameActivitiesForIdAssist2player;
//    }
//    
//    public void setSportFlorbalGameActivitiesForIdAssist2player(Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdAssist2player) {
//        this.sportFlorbalGameActivitiesForIdAssist2player = sportFlorbalGameActivitiesForIdAssist2player;
//    }
//
//@OneToMany(fetch=FetchType.LAZY, mappedBy="gamePlayerByIdPenaltyPlayer")
//    public Set<SportFlorbalGameActivity> getSportFlorbalGameActivitiesForIdPenaltyPlayer() {
//        return this.sportFlorbalGameActivitiesForIdPenaltyPlayer;
//    }
//    
//    public void setSportFlorbalGameActivitiesForIdPenaltyPlayer(Set<SportFlorbalGameActivity> sportFlorbalGameActivitiesForIdPenaltyPlayer) {
//        this.sportFlorbalGameActivitiesForIdPenaltyPlayer = sportFlorbalGameActivitiesForIdPenaltyPlayer;
//    }




}


