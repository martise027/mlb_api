package com.example.api;

import com.example.api.mlb_api.model.Player;
import com.example.api.mlb_api.repository.PlayerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class ApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getUserByPosition() throws Exception{
        String position = "DH";

        ResultActions result = mockMvc.perform(get("/api/v1/player?position={position}",position));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].position").value(hasItem("DH")));
    }

    @Test
    public void getUserByHits() throws  Exception{
        int hits = 100;

        ResultActions result = mockMvc.perform(get("/api/v1/player?hits={hits}",hits));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].hits",everyItem(greaterThanOrEqualTo(hits))));
    }

    @Test
    public void getPlayerByDoubleHits() throws  Exception{
        int doubleHits = 20;

        ResultActions result = mockMvc.perform(get("/api/v1/player?doubleHits={doubleHits}",doubleHits));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].double_hits",everyItem(greaterThanOrEqualTo(doubleHits))));


    }

    @Test
    public void getPlayerByTripleHits() throws Exception{
        int tripleHits = 1;

        ResultActions result = mockMvc.perform(get("/api/v1/player?tripleHits={tripleHits}",tripleHits));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].triple_hits",everyItem(greaterThanOrEqualTo(tripleHits))));
    }

    @Test
    public void getPlayerByHomerun() throws  Exception{

        int homerun = 30;

        ResultActions result = mockMvc.perform(get("/api/v1/player?homerun={homerun}",homerun));
        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].homerun",everyItem(greaterThanOrEqualTo(homerun))));


    }

    @Test
    public void getPlayerByGamePlayed() throws Exception{
        int gamePlayed = 100;
        ResultActions result = mockMvc.perform(get("/api/v1/player?gamePlayed={gamePlayed}",gamePlayed));
        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].gamePlayed",everyItem(greaterThanOrEqualTo(gamePlayed))));

    }

    @Test
    public void getPlayerByAVG() throws Exception{
        float avg = 0.3f;

        ResultActions result = mockMvc.perform(get("/api/v1/player?AVG={avg}",avg));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].AVG",everyItem(greaterThanOrEqualTo(avg))));

    }

    @Test
    public void getPlayerByOPS() throws Exception{
        float ops = 0.7f;

        ResultActions result = mockMvc.perform(get("/api/v1/player?OPS={ops}",ops));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].OPS",everyItem(greaterThanOrEqualTo(ops))));


    }

    @Test
    public void getPlayerByTeamAndHits() throws Exception{
        String team = "LAD";
        int hits = 98;

        ResultActions result = mockMvc.perform(get("/api/v1/player?team={team}&hits={hits}",team,hits));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].hits",everyItem(greaterThanOrEqualTo(hits))))
                .andExpect(jsonPath("$[*].team").value(hasItem(team)));

    }

    @Test
    public void getPlayersByPositionAndHomerun() throws Exception{
        String position = "SS";
        int homerun = 30;

        ResultActions result = mockMvc.perform(get("/api/v1/player?position={position}&homerun={homerun}",position,homerun));

        result.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[*].homerun",everyItem(greaterThanOrEqualTo(homerun))))
                .andExpect(jsonPath("$[*].position").value(hasItem(position)));


    }




}
