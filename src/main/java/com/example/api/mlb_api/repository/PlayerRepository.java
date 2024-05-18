package com.example.api.mlb_api.repository;

import com.example.api.mlb_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {

    List<Player> findByTeam(String team);
    List<Player> findByName(String name);
    List<Player> findByPosition(String position);
    List<Player> findByTeamAndPosition(String team, String position);
    List<Player> findByTeamAndGamePlayedGreaterThanEqual(String team,int gamePlayed);
    List<Player> findByTeamAndHomerunGreaterThanEqual(String team,int homerun);
    List<Player> findByTeamAndHitsGreaterThanEqual(String team,int hits);
    List<Player> findByTeamAndDoubleHitsGreaterThanEqual(String team,int doubleHits);
    List<Player> findByTeamAndTripleHitsGreaterThanEqual(String team,int tripleHits);
    List<Player> findByTeamAndAVGGreaterThanEqual(String team,float AVG);
    List<Player> findByTeamAndOPSGreaterThanEqual(String team,float OPS);

    List<Player> findByPositionAndHomerunGreaterThanEqual(String position,int homerun);
    List<Player> findByPositionAndHitsGreaterThanEqual(String position,int hits);
    List<Player> findByPositionAndDoubleHitsGreaterThanEqual(String position,int doubleHits);
    List<Player> findByPositionAndTripleHitsGreaterThanEqual(String position,int tripleHits);

    List<Player> findByGamePlayedGreaterThanEqual(int game_played);
    List<Player> findPlayerByHitsGreaterThanEqual(int hits);
    List<Player> findByDoubleHitsGreaterThanEqual(int doubleHits);
    List<Player> findByTripleHitsGreaterThanEqual(int tripleHits);
    List<Player> findPlayerByHomerunGreaterThanEqual(int homerun);
    List<Player> findByAVGGreaterThanEqual(float AVG);
    List<Player> findByOPSGreaterThanEqual(float OPS);
}