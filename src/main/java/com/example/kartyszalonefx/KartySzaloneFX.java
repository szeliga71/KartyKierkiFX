package com.example.kartyszalonefx;


import com.example.kartyszalonefx.Scenes.GeneralScene;
import com.example.kartyszalonefx.Scenes.GameScene;
import javafx.application.Application;
import javafx.stage.Stage;


public class KartySzaloneFX extends Application {


    public static final int TOTAL_SCENES = 1;
    public static final int START_SCENE = 0;
    /*public static final int GAME_SCENE =1;
    public static final int GAME_SCENE1 =4;
    public static final int GAME_SCENE2 =5;
    public static  final int GAME_OVER_SCENE= 2;
    public static  final int LEVEL_SCENE= 3;
    public static  final int LEVEL_1= 6;
    public static  final int LEVEL_2= 7;
    public static  final int LEVEL_3= 8;
    public static  final int ADDHALLOFFAME_SCENE= 9;
    public static  final int HALLOFFAME_SCENE= 10;*/

    public static GeneralScene[] scenes = new GeneralScene[TOTAL_SCENES];

    private static Stage stage;

    String background;
    String background1;
    String background2;


    @Override

    public void start(Stage stage) throws Exception {


        //background = "Images/jezioro5a.png";
        //background1 = "Images/jez1a.png";
        //background2 = "Images/jeziorko541.png";

        KartySzaloneFX.stage = stage;


        scenes[0] = new GameScene();
        //scenes[1]=new GameScene(background,ptaki,chmurki2,0);
        //scenes[4]=new GameScene(background1,ptaki1,chmurki1,1);
        //scenes[5]=new GameScene(background2,ptaki2,chmurki,2);
        //scenes[2]=new ExitScene();
        //scenes[3]=new LevelScene();
        //scenes[6]=new Level1();
        //scenes[7]=new Level2();
        //scenes[8]=new Level3();
        //scenes[9]=new AddToHallOfFame();
        //scenes[10]=new HallOfFame();


        stage.setTitle(" CARDS  ");
        setScene(START_SCENE);
        stage.show();

    }
        public static void setScene ( int numScene){

            stage.setScene(scenes[numScene]);
            scenes[numScene].draw();
        }

        public static void exit() throws Exception {

            stage.hide();


        }


    public static void main(String[] args) {
        launch(args);

    }

}
