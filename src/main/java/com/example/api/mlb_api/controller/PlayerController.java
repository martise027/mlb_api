package com.example.api.mlb_api.controller;

import com.example.api.service.PlayerService;
import com.example.api.mlb_api.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> filterPlayers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String position,
            @RequestParam(required = false,defaultValue = "-1") int gamePlayed,
            @RequestParam(required = false, defaultValue = "-1") int hits,
            @RequestParam(required = false, defaultValue = "-1") int doubleHits,
            @RequestParam(required = false, defaultValue = "-1") int tripleHits,
            @RequestParam(required = false, defaultValue = "-1") int homerun,
            @RequestParam(required = false, defaultValue = "-0.1") float AVG,
            @RequestParam(required = false, defaultValue = "-0.1") float OPS){
        if(name!=null){ return playerService.findByName(name);}
        else if(team!=null && position!=null) {return playerService.findByTeamAndPosition(team,position);}
        else if(team!=null && gamePlayed!= -1){return playerService.findByTeamAndGamePlayedGreaterThanEqual(team,gamePlayed);}
        else if (team!= null && homerun != -1) {return playerService.findByTeamAndHomerunGreaterThanEqual(team,homerun);}
        else if (team!=null && hits != -1) {return playerService.findByTeamAndHitsGreaterThanEqual(team,hits);}
        else if (team != null && doubleHits != -1) {return  playerService.findByTeamAndDoubleHitsGreaterThanEqual(team,doubleHits);}
        else if (team != null && tripleHits != -1) {return  playerService.findByTeamAndTripleHitsGreaterThanEqual(team,tripleHits);}
        else if (team != null && AVG !=-0.1){return playerService.findByTeamAndAVGGreaterThanEqual(team,AVG);}
        else if (team != null && OPS !=-0.1){return playerService.findByTeamAndOPSGreaterThanEqual(team,OPS);}

        else if (position != null && homerun != -1) {return playerService.findByPositionAndHomerunGreaterThanEqual(position,homerun);}
        else if (position != null && hits != -1) {return  playerService.findByPositionAndHitsGreaterThanEqual(position,hits);}
        else if (position != null && doubleHits != -1) {return playerService.findByPositionAndDoubleHitsGreaterThanEqual(position ,doubleHits);}
        else if (position != null && tripleHits != -1) {return playerService.findByPositionAndTripleHitsGreaterThanEqual(position,tripleHits);}

        else if (team!=null) {return playerService.getByTeam(team);}
        else if(position!=null) {return playerService.getByPosition(position);}
        else if(hits!= -1) {return playerService.findPlayerByHitsGreaterThanEqual(hits);}
        else if(doubleHits != -1){ return playerService.findPlayerByDoubleHitsGreaterThanEqual(doubleHits);}
        else if(tripleHits != -1) {return playerService.findPlayerByTripleHitsGreaterThanEqual(tripleHits);}
        else if(homerun != -1) {return playerService.findPlayerByHomerunGreaterThanEqual(homerun);}
        else if(gamePlayed != -1) {return playerService.findPlayerByGamePlayedGreaterThanEqual(gamePlayed);}
        else if(AVG != -0.1){return playerService.findByAVGGreaterThanEqual(AVG);}
        else if(OPS != -0.1){return playerService.findByOPSGreaterThanEqual(OPS);}

        return playerService.getPlayers();

    }



}
