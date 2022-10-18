package com.example.kartyszalonefx.Elements;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Random;

public class CardCollection {

    String name;
ArrayList<Card>cards;
    //private Image imageFront;
    //private static Image back;

    public CardCollection(String name) {
        this.name = name;
        cards = new ArrayList<>();

    }

    public void addCard(Card card) {

        cards.add(card);
    }

    public void shuffle() {
        Random random = new Random();
        Card temp;

        for (int i = 0; i < cards.size(); i++) {
            temp = cards.get(i);
            int n = random.nextInt(cards.size() - 1);
            cards.set(i, cards.get(n));
            cards.set(n, temp);
        }
    }

    public void typeOfCard(Hand hand) {

        if (cards.size() >=hand.size) {
            for (int i = 0; i < hand.size; i++) {
                hand.cards.add(cards.get(i));
            }
         cards.removeAll(hand.cards);
        }


    }
    public Card popCardIndex(int n){
        Card card=cards.get(n);
        cards.remove(card);
        return card;}

    public Card popCard(Card card){

        //cards.remove(card);
    return card;
    }

    public void addCardCollection(ArrayList<Card>hand){
        cards.addAll(hand);
        hand.clear();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


}



