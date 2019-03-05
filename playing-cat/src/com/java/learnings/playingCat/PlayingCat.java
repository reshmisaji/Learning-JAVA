package com.java.learnings.playingCat;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying());
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
        if(!summer && (temperature >=25 && temperature <= 35)){
            return true;
        }
        if(summer &&(temperature >=25 && temperature <= 45)){
            return true;
        }

        return false;
    }
}
