package com.example.kartyszalonefx.Elements;

import java.util.ArrayList;

public class Hand extends CardCollection{



    int size;

    public Hand(String name, int size) {
        super(name);
        this.size=size;
        cards=new ArrayList<>();
    }
    public boolean porownajKarty( Card card1,Card card2) {

        boolean pasuja=false;

        if(card1.getRank()==card2.getRank())
            pasuja=true;
        if(card1.getSuit()==card2.getSuit())
            pasuja=true;
        if(card1.getRank()==7)
            pasuja=true;

        return pasuja;}
}
