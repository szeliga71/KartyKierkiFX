package com.example.kartyszalonefx.Elements;

public class Ruch extends Frame{



        protected  byte currentSprite;

        protected int []frameXCoordinates =new int[10];
        protected int []frameYCoordinates =new int[10];

        public static int FRAME_CHANGE=10;
        protected byte currentFrameChange;



        public Ruch(int width, int height) {

            super(width, height);


            currentSprite =0;
            currentFrameChange=10;

        }

        public void animate(){
            currentFrameChange++;
            if(currentFrameChange>=FRAME_CHANGE)
            {
                currentFrameChange=0;
                currentSprite =(byte)((currentSprite+1)% frameXCoordinates.length);

                updateSpriteCoordinates();
            }}

        protected void updateSpriteCoordinates(){

           // frameX = frameXCoordinates[currentSprite];
            //frameY = frameYCoordinates[currentSprite];
        }

    }

