package com.example.kartyszalonefx.Elements;

public class Player extends CardCollection {

    Hand hand;

    public Player(String name, Hand hand) {
        super(name);
        this.hand = hand;


    }

    //metoda porownania kart

   /* public Card porownajKarty( Card cardS) {
        Card card = null;
        for (int i = 0; i < cards.size(); i++) {

            if (cards.get(i).getRank() == cardS.getRank() || cards.get(i).getSuit() == cardS.getSuit() || cards.get(i).getRank() == 7) {
                return cards.get(i);
            }
        }

        return card;}*/


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
