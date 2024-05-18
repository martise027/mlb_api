package com.example.api.mlb_api.model;

import jakarta.persistence.*;

@Entity
@Table (name = "player_stats")
public class Player {

    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "player_sequence"
    )

    private String name;
    private String team;
    private String position;
    private int gamePlayed;
    private int at_bats;
    private int runs;
    private int hits;
    private Integer doubleHits;
    private Integer tripleHits;
    private int homerun;
    private int RBI;
    private int BB;
    private int SO;
    private int SB;
    private int CS;
    private float AVG;
    private float OBP;
    private float SLG;
    private float OPS;

    public Player(String name){
        this.name=name;
    }

    public Player(String name,String team,String position,int gamePlayed,int at_bats,int runs,int hits, int doubleHits, int tripleHits,int homerun,int RBI,int BB,int SO,int SB,int CS,float AVG, float OBP,float SLG,float OPS){
        this.name = name;
        this.team = team;
        this.position = position;
        this.gamePlayed = gamePlayed;
        this.at_bats = at_bats;
        this.runs = runs;
        this.hits = hits;
        this.doubleHits = doubleHits;
        this.tripleHits = tripleHits;
        this.homerun = homerun;
        this.RBI = RBI;
        this.BB = BB;
        this.SO = SO;
        this.SB = SB;
        this.CS = CS;
        this.AVG = AVG;
        this.OBP = OBP;
        this.SLG = SLG;
        this.OPS = OPS;
    }

    public Player() {}

    public int getRBI() {
        return RBI;
    }

    public void setRBI(int RBI) {
        this.RBI = RBI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGameNum() {
        return gamePlayed;
    }

    public void setGameNum(int gamePlayed) {
        this.gamePlayed= gamePlayed;
    }

    public int getAt_bats() {
        return at_bats;
    }

    public void setAt_bats(int at_bats) {
        this.at_bats = at_bats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDouble_hits() {
        return doubleHits;
    }

    public void setDouble_hits(int doubleHits) {
        this.doubleHits = doubleHits;
    }

    public int getTriple_hits() {
        return tripleHits;
    }

    public void setTriple_hits(int triple_hits) {
        this.tripleHits = triple_hits;
    }

    public int getHomerun() {
        return homerun;
    }

    public void setHomerun(int homerun) {
        this.homerun = homerun;
    }

    public int getBB() {
        return BB;
    }

    public void setBB(int BB) {
        this.BB = BB;
    }

    public int getSO() {
        return SO;
    }

    public void setSO(int SO) {
        this.SO = SO;
    }

    public int getSB() {
        return SB;
    }

    public void setSB(int SB) {
        this.SB = SB;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public float getAVG() {
        return AVG;
    }

    public void setAVG(float AVG) {
        this.AVG = AVG;
    }

    public float getOBP() {
        return OBP;
    }

    public void setOBP(float OBP) {
        this.OBP = OBP;
    }

    public float getSLG() {
        return SLG;
    }

    public void setSLG(float SLG) {
        this.SLG = SLG;
    }

    public float getOPS() {
        return OPS;
    }

    public void setOPS(float OPS) {
        this.OPS = OPS;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", game_played=" + gamePlayed +
                ", at_bats=" + at_bats +
                ", runs=" + runs +
                ", hits=" + hits +
                ", double_hits=" + doubleHits +
                ", triple_hits=" + tripleHits +
                ", homerun=" + homerun +
                ", RBI=" + RBI +
                ", BB=" + BB +
                ", SO=" + SO +
                ", SB=" + SB +
                ", CS=" + CS +
                ", AVG=" + AVG +
                ", OBP=" + OBP +
                ", SLG=" + SLG +
                ", OPS=" + OPS +
                '}';
    }
}
