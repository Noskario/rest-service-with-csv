package com.example.restservicewithcsv;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BetriebsstellenController {
    @GetMapping("/betriebsstelle")
    public Betriebsstelle betriebsstelle(@RequestParam(value = "code") String code){

        //look up for the code among all Betriebsstellen and return if found
        for (Betriebsstelle bs: ReadBetriebstellenCSVFile.betriebsstellen){
            if(bs.getCode().equalsIgnoreCase(code)){
                return bs;
            }
        }
        throw new BetriebsstelleNotFoundException(code);
        //return null;
    }
    @GetMapping("/betriebsstelle/{code}")
    public Betriebsstelle betriebsstelle_differentAPI(@PathVariable String code){
        //look up for the code among all Betriebsstellen and return if found
        for (Betriebsstelle bs: ReadBetriebstellenCSVFile.betriebsstellen){
            if(bs.getCode().equalsIgnoreCase(code)){
                return bs;
            }
        }

        return null;
    }
    @GetMapping("/listall")
    public List<Betriebsstelle> allBetriebsstellen(){
        return ReadBetriebstellenCSVFile.betriebsstellen;
    }
}
