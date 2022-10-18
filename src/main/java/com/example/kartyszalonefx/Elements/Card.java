package com.example.kartyszalonefx.Elements;

import javafx.scene.image.Image;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Card extends Frame{

    public static final String[]suits= new String[]{"trefl","karo","kier","pik"};
    public static final String[]ranks = new String[]{"as","2","3","4","5","6","7","8","9","10","walet","dama","krol"};
    public static String BACK_CARD = "playing_cards_images/card_back.png";
    public String FRONT_CARD;
    private int suit;
    private int rank;
    private  Image imageFront;
    private static Image back;
    public static int KARTA_WIDTH=150;
    public static int KARTA_HEIGHT =215;

    static {
        try {
            back = new Image(Files.newInputStream((Paths.get(BACK_CARD))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public Card(int suit, int rank) throws IOException {

        super(KARTA_WIDTH,KARTA_HEIGHT);

        this.suit=suit;
        this.rank=rank;
        FRONT_CARD = makeAdress();
        imageFront=new Image(Files.newInputStream((Paths.get(FRONT_CARD))));




    }


    public String toString(){
        String s;
        s= ranks[rank]+" "+suits[suit];
        return s; }


    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public static Image getBack() {
        return back;
    }



    public Image getImageFront() {
        return imageFront;
    }



    public String makeAdress(){

        String adress="playing_cards_images/";

        if(suit==0){
            adress=adress+"clubs";

            switch (rank){

            case 0:
                adress=adress+"1.png";
                break;
                case 1:
                    adress=adress+"2.png";
                    break;
                case 2:
                    adress=adress+"3.png";
                    break;
                case 3:
                    adress=adress+"3.png";
                    break;
                case 4:
                    adress=adress+"4.png";
                    break;
                case 5:
                    adress=adress+"5.png";
                    break;
                case 6:
                    adress=adress+"6.png";
                    break;
                case 7:
                    adress=adress+"7.png";
                    break;
                case 8:
                    adress=adress+"8.png";
                    break;
                case 9:
                    adress=adress+"9.png";
                    break;
                case 10:
                    adress=adress+"10.png";
                    break;
                case 11:
                    adress=adress+"11.png";
                    break;
                case 12:
                    adress=adress+"12.png";
                    break;
                case 13:
                    adress=adress+"13.png";
                    break;

        }
        }
        else if(suit == 1){
            adress=adress+"diamonds";

            switch (rank){

                case 0:
                    adress=adress+"1.png";
                    break;
                case 1:
                    adress=adress+"2.png";
                    break;
                case 2:
                    adress=adress+"3.png";
                    break;
                case 3:
                    adress=adress+"3.png";
                    break;
                case 4:
                    adress=adress+"4.png";
                    break;
                case 5:
                    adress=adress+"5.png";
                    break;
                case 6:
                    adress=adress+"6.png";
                    break;
                case 7:
                    adress=adress+"7.png";
                    break;
                case 8:
                    adress=adress+"8.png";
                    break;
                case 9:
                    adress=adress+"9.png";
                    break;
                case 10:
                    adress=adress+"10.png";
                    break;
                case 11:
                    adress=adress+"11.png";
                    break;
                case 12:
                    adress=adress+"12.png";
                    break;
                case 13:
                    adress=adress+"13.png";
                    break;

            }
        }
        else if(suit==2){
            adress=adress+"hearts";

            switch (rank){

                case 0:
                    adress=adress+"1.png";
                    break;
                case 1:
                    adress=adress+"2.png";
                    break;
                case 2:
                    adress=adress+"3.png";
                    break;
                case 3:
                    adress=adress+"3.png";
                    break;
                case 4:
                    adress=adress+"4.png";
                    break;
                case 5:
                    adress=adress+"5.png";
                    break;
                case 6:
                    adress=adress+"6.png";
                    break;
                case 7:
                    adress=adress+"7.png";
                    break;
                case 8:
                    adress=adress+"8.png";
                    break;
                case 9:
                    adress=adress+"9.png";
                    break;
                case 10:
                    adress=adress+"10.png";
                    break;
                case 11:
                    adress=adress+"11.png";
                    break;
                case 12:
                    adress=adress+"12.png";
                    break;
                case 13:
                    adress=adress+"13.png";
                    break;

            }
        }

        else if(suit==3){
            adress=adress+"spades";

            switch (rank){

                case 0:
                    adress=adress+"1.png";
                    break;
                case 1:
                    adress=adress+"2.png";
                    break;
                case 2:
                    adress=adress+"3.png";
                    break;
                case 3:
                    adress=adress+"3.png";
                    break;
                case 4:
                    adress=adress+"4.png";
                    break;
                case 5:
                    adress=adress+"5.png";
                    break;
                case 6:
                    adress=adress+"6.png";
                    break;
                case 7:
                    adress=adress+"7.png";
                    break;
                case 8:
                    adress=adress+"8.png";
                    break;
                case 9:
                    adress=adress+"9.png";
                    break;
                case 10:
                    adress=adress+"10.png";
                    break;
                case 11:
                    adress=adress+"11.png";
                    break;
                case 12:
                    adress=adress+"12.png";
                    break;
                case 13:
                    adress=adress+"13.png";
                    break;

            }
        }
        return adress;}




}

