package com.example.restservicewithcsv;

public class BetriebsstelleNotFoundException extends RuntimeException{
    BetriebsstelleNotFoundException(String code) {
        super("Could not find Betriebsstelle that fits to your given code: "+code);
    }
}
