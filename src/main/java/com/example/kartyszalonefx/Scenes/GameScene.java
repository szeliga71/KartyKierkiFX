package com.example.kartyszalonefx.Scenes;


import com.example.kartyszalonefx.Elements.Deck;
import com.example.kartyszalonefx.Elements.Hand;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import java.io.IOException;
import java.security.Key;

import static com.example.kartyszalonefx.Elements.Card.*;


public class GameScene extends GeneralScene {



      Deck deck;
      Hand p1;
      Hand p2;
      Hand stos;
      Hand dobieranie;


    public GameScene() throws IOException {
        super();

        deck = new Deck("talia");
        deck.shuffle();
        //System.out.println(deck.getCards().stream().count()+ " to ilosc kart w talii");
        p1=new Hand("player 1",5);
        p2=new Hand("player 2",5);
        stos=new Hand("stosik",52);
        dobieranie=new Hand("dobieranie",52);

        deck.typeOfCard(p1);
        deck.typeOfCard(p2);
        dobieranie.addCardCollection(deck.getCards());

        System.out.println(dobieranie.getCards().stream().count());
//for(int i=0;i<p1.getCards().size();i++){
  //  System.out.println(p1.getCards().get(i));
//}



    }


    public void draw() {

        activeKeys.clear();
       // while (!p1.getCards().isEmpty() && !p2.getCards().isEmpty()) {
        new AnimationTimer() {
            @Override
            public void handle(long currentNanoTime) {


                gc.setFill(Color.GREEN);
                gc.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);

                int p = 100;
                int w = 100;


                if (!p1.getCards().isEmpty()) {


                    for (int i = 0; i < p1.getCards().size(); i++) {
                        p1.getCards().get(i).x = p;
                        p1.getCards().get(i).y = w;
                        gc.drawImage(p1.getCards().get(i).getImageFront(), p, w);
                        p = p + 155;
                    }
                }


                if (!p2.getCards().isEmpty()) {
                    p = 100;
                    w = 700;

                    for (int i = 0; i < p2.getCards().size(); i++) {
                        gc.drawImage(p2.getCards().get(i).getBack(), p, w);
                        p = p + 155;
                    }
                }


                p = 900;
                w = 400;
                for (int i = 0; i < stos.getCards().size(); i++) {
                    gc.drawImage(stos.getCards().get(i).getImageFront(), p, w);
                    if (i % 2 > 0) {
                        p = p + 60;

                        w = w + 60;
                    } else {
                        p = p - 60;
                        if (p < 960)
                            w = w - 60;
                    }
                }

                p = 1400;
                w = 100;
                for (int i = 0; i < dobieranie.getCards().size(); i++) {
                    dobieranie.getCards().get(i).x = p;
                    dobieranie.getCards().get(i).y = w;

                    gc.drawImage(dobieranie.getCards().get(i).getBack(), p, w);
                    if (i % 2 > 0) {
                        p = p + 4;
                    }
                }




                setOnMouseClicked(
                        new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {




                                for (int i = 0; i < p1.getCards().size(); i++) {
                                    if (p1.getCards().get(i).containsPoint(p1.getCards().get(i).getX(), p1.getCards().get(i).getY(), mouseEvent.getX(), mouseEvent.getY())) {
                                        stos.addCard(p1.popCard(p1.getCards().get(i)));
                                        p1.getCards().remove(i);
                                        //for(int d=0;d<p1.getCards().size();d++){
                                        //  System.out.println(p1.getCards().get(d));}
                                        break;
                                    }
                                }

                                if (dobieranie.getCards().get(0).containsPoint(dobieranie.getCards().get(0).getX(), dobieranie.getCards().get(0).getY(), mouseEvent.getX(), mouseEvent.getY())) {
                                    p1.addCard(dobieranie.popCard(dobieranie.getCards().get(0)));
                                    dobieranie.getCards().remove(0);
                                }






                                int a = p2.getCards().size();

                                for (int i = 0; i < p2.getCards().size(); i++) {
                                    if (p2.porownajKarty(p2.getCards().get(i), stos.getCards().get(stos.getCards().size() - 1))) {
                                        stos.addCard(p2.getCards().get(i));
                                        p2.getCards().remove(i);
                                        break;
                                    }
                                }

                                if (a == p2.getCards().size()) {

                                    if (dobieranie.getCards().isEmpty()) {
                                        dobieranie.addCardCollection(stos.getCards());
                                        stos.addCard(dobieranie.getCards().get(dobieranie.getCards().size()));
                                        dobieranie.getCards().remove(dobieranie.getCards().size());
                                        dobieranie.shuffle();
                                    } else {

                                        p2.getCards().add(dobieranie.getCards().get(0));
                                        dobieranie.getCards().remove(0);

                                    }
                                }


                            }

                        });


                setOnKeyPressed(
                        new EventHandler<KeyEvent>() {
                            @Override
                            public void handle(KeyEvent keyEvent) {


                            }
                        });





            }

            }.start();

        }

}
