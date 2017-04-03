package com.so.dal.core.model.game;
// Generated 27.2.2017 18:41:18 by Hibernate Tools 4.3.1

import com.so.dal.core.model.season.SeasonTournamentGroup;
import com.so.dal.core.model.season.SeasonTournamentRound;
import com.so.dal.core.model.season.SeasonTournamentLocation;
import com.so.dal.floorball.model.game.SportFlorbalGameActivity;
import com.so.dal.floorball.model.game.SportFlorbalGameShots;
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

/**
 * Game generated by hbm2java
 */
@Entity
@Table(name = "game", catalog = "sport_app_dev"
)
public class Game implements java.io.Serializable {

    private Integer id;
    private CompetitorTeam competitorTeamByIdAwayTeam;
    private CompetitorTeam competitorTeamByIdHomeTeam;
    private SeasonTournamentGroup seasonTournamentGroup;
    private SeasonTournamentLocation seasonTournamentLocation;
    private SeasonTournamentRound seasonTournamentRound;
    private String name;
    private Date startTime;
    private Date realStart;
    private boolean overtime;
    private boolean finished;
    private boolean contumated;
    private Set<SportFlorbalGameActivity> sportFlorbalGameActivities = new HashSet<>(0);
    private Set<SportFlorbalGameShots> sportFlorbalGameShotses = new HashSet<>(0);
    private Set<GamePlayer> gamePlayers = new HashSet<>(0);

    public Game() {
    }

    public Game(CompetitorTeam competitorTeamByIdAwayTeam, CompetitorTeam competitorTeamByIdHomeTeam, SeasonTournamentGroup seasonTournamentGroup, SeasonTournamentLocation seasonTournamentLocation, SeasonTournamentRound seasonTournamentRound, String name, Date startTime, Date realStart, boolean overtime, boolean finished, boolean contumated) {
        this.competitorTeamByIdAwayTeam = competitorTeamByIdAwayTeam;
        this.competitorTeamByIdHomeTeam = competitorTeamByIdHomeTeam;
        this.seasonTournamentGroup = seasonTournamentGroup;
        this.seasonTournamentLocation = seasonTournamentLocation;
        this.seasonTournamentRound = seasonTournamentRound;
        this.name = name;
        this.startTime = startTime;
        this.realStart = realStart;
        this.overtime = overtime;
        this.finished = finished;
        this.contumated = contumated;
    }

    public Game(CompetitorTeam competitorTeamByIdAwayTeam, CompetitorTeam competitorTeamByIdHomeTeam, SeasonTournamentGroup seasonTournamentGroup, SeasonTournamentLocation seasonTournamentLocation, SeasonTournamentRound seasonTournamentRound, String name, Date startTime, Date realStart, boolean overtime, boolean finished, boolean contumated, Set<SportFlorbalGameActivity> sportFlorbalGameActivities, Set<SportFlorbalGameShots> sportFlorbalGameShotses, Set<GamePlayer> gamePlayers) {
        this.competitorTeamByIdAwayTeam = competitorTeamByIdAwayTeam;
        this.competitorTeamByIdHomeTeam = competitorTeamByIdHomeTeam;
        this.seasonTournamentGroup = seasonTournamentGroup;
        this.seasonTournamentLocation = seasonTournamentLocation;
        this.seasonTournamentRound = seasonTournamentRound;
        this.name = name;
        this.startTime = startTime;
        this.realStart = realStart;
        this.overtime = overtime;
        this.finished = finished;
        this.contumated = contumated;
        this.sportFlorbalGameActivities = sportFlorbalGameActivities;
        this.sportFlorbalGameShotses = sportFlorbalGameShotses;
        this.gamePlayers = gamePlayers;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAwayTeam", nullable = false)
    public CompetitorTeam getCompetitorTeamByIdAwayTeam() {
        return this.competitorTeamByIdAwayTeam;
    }

    public void setCompetitorTeamByIdAwayTeam(CompetitorTeam competitorTeamByIdAwayTeam) {
        this.competitorTeamByIdAwayTeam = competitorTeamByIdAwayTeam;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idHomeTeam", nullable = false)
    public CompetitorTeam getCompetitorTeamByIdHomeTeam() {
        return this.competitorTeamByIdHomeTeam;
    }

    public void setCompetitorTeamByIdHomeTeam(CompetitorTeam competitorTeamByIdHomeTeam) {
        this.competitorTeamByIdHomeTeam = competitorTeamByIdHomeTeam;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idGroup", nullable = false)
    public SeasonTournamentGroup getSeasonTournamentGroup() {
        return this.seasonTournamentGroup;
    }

    public void setSeasonTournamentGroup(SeasonTournamentGroup seasonTournamentGroup) {
        this.seasonTournamentGroup = seasonTournamentGroup;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idLocation", nullable = false)
    public SeasonTournamentLocation getSeasonTournamentLocation() {
        return this.seasonTournamentLocation;
    }

    public void setSeasonTournamentLocation(SeasonTournamentLocation seasonTournamentLocation) {
        this.seasonTournamentLocation = seasonTournamentLocation;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRound", nullable = false)
    public SeasonTournamentRound getSeasonTournamentRound() {
        return this.seasonTournamentRound;
    }

    public void setSeasonTournamentRound(SeasonTournamentRound seasonTournamentRound) {
        this.seasonTournamentRound = seasonTournamentRound;
    }

    @Column(name = "name", nullable = false, length = 2500)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startTime", nullable = false, length = 19)
    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "realStart", nullable = true, length = 19)
    public Date getRealStart() {
        return this.realStart;
    }

    public void setRealStart(Date realStart) {
        this.realStart = realStart;
    }

    @Column(name = "overtime", nullable = true)
    public boolean isOvertime() {
        return this.overtime;
    }

    public void setOvertime(boolean overtime) {
        this.overtime = overtime;
    }

    @Column(name = "finished", nullable = false)
    public boolean isFinished() {
        return this.finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Column(name = "contumated", nullable = true)
    public boolean isContumated() {
        return this.contumated;
    }

    public void setContumated(boolean contumated) {
        this.contumated = contumated;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "game", orphanRemoval = true)
    public Set<SportFlorbalGameActivity> getSportFlorbalGameActivities() {
        return this.sportFlorbalGameActivities;
    }

    public void setSportFlorbalGameActivities(Set<SportFlorbalGameActivity> sportFlorbalGameActivities) {
        this.sportFlorbalGameActivities = sportFlorbalGameActivities;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "game", orphanRemoval = true)
    public Set<SportFlorbalGameShots> getSportFlorbalGameShotses() {
        return this.sportFlorbalGameShotses;
    }

    public void setSportFlorbalGameShotses(Set<SportFlorbalGameShots> sportFlorbalGameShotses) {
        this.sportFlorbalGameShotses = sportFlorbalGameShotses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "game", orphanRemoval = true)
    public Set<GamePlayer> getGamePlayers() {
        return this.gamePlayers;
    }

    public void setGamePlayers(Set<GamePlayer> gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

}
