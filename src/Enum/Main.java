package Enum;

import abstractClass.Cabrio.Animal;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {

        for (Voicable voicable : Example.values()) {
            System.out.println(voicable + " " + voicable.giveVoice() );
        }
        
    }

}
