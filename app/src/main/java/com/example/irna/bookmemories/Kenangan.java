package com.example.irna.bookmemories;

import java.io.Serializable;
import java.util.List;

public class Kenangan implements Serializable{
    private List<Member> kenangan;


    public List<Member> getKenangan() {
        return kenangan;
    }

    public void setKenangan(List<Member> kenangan) {
        this.kenangan = kenangan;
    }


}


