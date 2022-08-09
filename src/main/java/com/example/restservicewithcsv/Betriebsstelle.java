package com.example.restservicewithcsv;

import com.opencsv.bean.CsvBindByName;

public class Betriebsstelle {
    @CsvBindByName(column = "RL100-Code")
    private String code;
    @CsvBindByName(column = "RL100-Langname")
    private String langname;
    @CsvBindByName(column = "RL100-Kurzname")
    private String kurzname;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLangname() {
        return langname;
    }

    public void setLangname(String langname) {
        this.langname = langname;
    }

    public String getKurzname() {
        return kurzname;
    }

    public void setKurzname(String kurzname) {
        this.kurzname = kurzname;
    }

    @Override
    public String toString() {
        return "Betriebsstelle{" +
                "code='" + code + '\'' +
                ", langname='" + langname + '\'' +
                ", kurzname='" + kurzname + '\'' +
                '}';
    }
}

