package com.example.kartyszalonefx.Elements;

import javafx.scene.image.Image;

import java.io.IOException;
import java.util.ArrayList;

public class Deck extends CardCollection{




    public Deck(String name) throws IOException {
        super(name);
        //cards = new ArrayList<>();
        fillDeck();
    }


    public void fillDeck() throws IOException {

        for(int i = 0; i<Card.ranks.length; i++){
            for(int j = 0; j< Card.suits.length; j++){
                cards.add(new Card(j,i));
            }
        }
    }

    //public ArrayList<Card> getCards() {
        //return cards;
    //}

    //public static Image getBack() {
      //  return cards.get(n).back;
    //}
    //public Image getImageFront() {
      //  return imageFront;
    //}

}
