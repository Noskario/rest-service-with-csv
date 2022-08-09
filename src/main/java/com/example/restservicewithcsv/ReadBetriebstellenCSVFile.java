package com.example.restservicewithcsv;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadBetriebstellenCSVFile {
    static String fileName = "src/main/resources/static/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv";
    public static List<Betriebsstelle> betriebsstellen;

    static {
        try {
            betriebsstellen = new CsvToBeanBuilder(new FileReader(fileName))
                    .withType(Betriebsstelle.class).withSeparator(';').build().parse();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}