import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Board {
    GUI_Field field;
        GUI_Field[] fields = {
                new GUI_Start(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Tax(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),

        };

        GUI gui = new GUI(fields);
        int[] cards = new int[100];
        GUI_Player player;

        void createPlayer() {
            gui.showMessage("Hvor mange spillere?");
            int numberOfPlayers = gui.getUserInteger("Indtast et tal.");
            int[] players = new int[numberOfPlayers];

            for(int i = 0; i < players.length; i++) {
                gui.showMessage("Vælg en spiller: ");
                String name = gui.getUserString("");
                player = new GUI_Player(name, 2000);
                gui.addPlayer(player);
            }
        }/*
        String getPlayer() {

        }
        String getPlayers() {

        }
        String getFields() {

        }
        void shuffleCard() {

        }
        String getCard() {

        }*/

    /**
     * Sætter
     */
    void setBoard() {
        //titler
        fields[0].setTitle("Start");
        fields[1].setTitle("Burgerbaren");
        fields[2].setTitle("Pizzahuset");
        fields[3].setTitle("Chance");
        fields[4].setTitle("Slikbutik");
        fields[5].setTitle("Iskiosk");
        fields[6].setTitle("Fængsel");
        fields[7].setTitle("Museeum");
        fields[8].setTitle("Bibliotek");
        fields[9].setTitle("Chance");
        fields[10].setTitle("Skateparken");
        fields[11].setTitle("Swimmingpool");
        fields[12].setTitle("Fri parkering");
        fields[13].setTitle("Spillehal");
        fields[14].setTitle("Kinobiograf");
        fields[15].setTitle("Chance");
        fields[16].setTitle("Legetøjsbutik");
        fields[17].setTitle("Dyrehandel");
        fields[18].setTitle("Gå i fængsel");
        fields[19].setTitle("Bowlinghal");
        fields[20].setTitle("Zoologisk have");
        fields[21].setTitle("Chance");
        fields[22].setTitle("Vandland");
        fields[23].setTitle("Strandpromenade");

        //baggrundsfarve
        fields[0].setBackGroundColor(Color.WHITE);
        fields[1].setBackGroundColor(Color.GRAY);
        fields[2].setBackGroundColor(Color.GRAY);
        fields[3].setBackGroundColor(Color.WHITE);
        fields[4].setBackGroundColor(Color.CYAN);
        fields[5].setBackGroundColor(Color.CYAN);
        fields[6].setBackGroundColor(Color.WHITE);
        fields[7].setBackGroundColor(Color.PINK);
        fields[8].setBackGroundColor(Color.PINK);
        fields[9].setBackGroundColor(Color.WHITE);
        fields[10].setBackGroundColor(Color.ORANGE);
        fields[11].setBackGroundColor(Color.ORANGE);
        fields[12].setBackGroundColor(Color.WHITE);
        fields[13].setBackGroundColor(Color.RED);
        fields[14].setBackGroundColor(Color.RED);
        fields[15].setBackGroundColor(Color.WHITE);
        fields[16].setBackGroundColor(Color.YELLOW);
        fields[17].setBackGroundColor(Color.YELLOW);
        fields[18].setBackGroundColor(Color.WHITE);
        fields[19].setBackGroundColor(Color.GREEN);
        fields[20].setBackGroundColor(Color.GREEN);
        fields[21].setBackGroundColor(Color.WHITE);
        fields[22].setBackGroundColor(Color.BLUE);
        fields[23].setBackGroundColor(Color.BLUE);

        //priser
        fields[1].setSubText("$1");
        fields[2].setSubText("$1");
        fields[4].setSubText("$2");
        fields[5].setSubText("$2");
        fields[7].setSubText("$2");
        fields[8].setSubText("$2");
        fields[10].setSubText("$2");
        fields[11].setSubText("$2");
        fields[13].setSubText("$3");
        fields[14].setSubText("$3");
        fields[16].setSubText("$3");
        fields[17].setSubText("$3");
        fields[19].setSubText("$4");
        fields[20].setTitle("$4");
        fields[22].setTitle("$5");
        fields[23].setTitle("$5");


    }
}