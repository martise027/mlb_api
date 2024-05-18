package com.example.api.service;

import com.example.api.mlb_api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api.mlb_api.model.Player;


import java.util.List;

@Service
public class PlayerService {


    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }
    public List<Player> findByName(String name){
        return playerRepository.findByName(name);
    }
    public List<Player> getByTeam(String team){
        return playerRepository.findByTeam(team);
    }

    public List<Player> findByTeamAndPosition(String team,String position){
        return playerRepository.findByTeamAndPosition(team,position);
    }

    public List<Player> findByTeamAndGamePlayedGreaterThanEqual(String team,int gamePlayed){
        return  playerRepository.findByTeamAndGamePlayedGreaterThanEqual(team,gamePlayed);
    }

    public List<Player> findByTeamAndHomerunGreaterThanEqual(String team,int homerun){
        return playerRepository.findByTeamAndHomerunGreaterThanEqual(team,homerun);
    }
    public List<Player> findByTeamAndHitsGreaterThanEqual(String team,int hits){
        return playerRepository.findByTeamAndHitsGreaterThanEqual(team,hits);
    }
    public List<Player> findByTeamAndDoubleHitsGreaterThanEqual(String team,int doubleHits){
        return playerRepository.findByTeamAndDoubleHitsGreaterThanEqual(team,doubleHits);
    }
    public List<Player> findByTeamAndTripleHitsGreaterThanEqual(String team,int tripleHits){
        return playerRepository.findByTeamAndTripleHitsGreaterThanEqual(team,tripleHits);
    }

    public List<Player> findByTeamAndAVGGreaterThanEqual(String team,float AVG){
        return  playerRepository.findByTeamAndAVGGreaterThanEqual(team,AVG);
    }

    public List<Player> findByTeamAndOPSGreaterThanEqual(String team,float OPS){
        return playerRepository.findByTeamAndOPSGreaterThanEqual(team,OPS);
    }

    //-----findByPosition-----
    public List<Player> findByPositionAndHomerunGreaterThanEqual(String position,int homerun){
        return playerRepository.findByPositionAndHomerunGreaterThanEqual(position,homerun);
    }

    public List<Player> findByPositionAndHitsGreaterThanEqual(String position ,int hits){
        return  playerRepository.findByPositionAndHitsGreaterThanEqual(position,hits);
    }

    public List<Player> findByPositionAndDoubleHitsGreaterThanEqual(String position,int doubleHits){
        return  playerRepository.findByPositionAndDoubleHitsGreaterThanEqual(position,doubleHits);
    }
    public List<Player> findByPositionAndTripleHitsGreaterThanEqual(String position,int tripleHits){
        return playerRepository.findByPositionAndTripleHitsGreaterThanEqual(position,tripleHits);
    }



    public List<Player> getByPosition(String position){
        return playerRepository.findByPosition(position);
    }

    public List<Player> findPlayerByGamePlayedGreaterThanEqual(int gameNum){
        return playerRepository.findByGamePlayedGreaterThanEqual(gameNum);
    }

    public List<Player> findPlayerByHitsGreaterThanEqual(int hits){
        return playerRepository.findPlayerByHitsGreaterThanEqual(hits);
    }

    public List<Player> findPlayerByDoubleHitsGreaterThanEqual(int doubleHits){
        return playerRepository.findByDoubleHitsGreaterThanEqual(doubleHits);
    }

    public List<Player> findPlayerByTripleHitsGreaterThanEqual(int tripleHits){
       return playerRepository.findByTripleHitsGreaterThanEqual(tripleHits);
    }

    public List<Player> findPlayerByHomerunGreaterThanEqual(int homerun){
        return playerRepository.findPlayerByHomerunGreaterThanEqual(homerun);
    }

    public List<Player> findByAVGGreaterThanEqual(float AVG){
        return playerRepository.findByAVGGreaterThanEqual(AVG);
    }

    public List<Player> findByOPSGreaterThanEqual(float OPS){
        return playerRepository.findByOPSGreaterThanEqual(OPS);
    }

}
