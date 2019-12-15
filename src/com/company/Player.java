package com.company;

public class Player {
    //Variables
    int player_id;
    String name = "";
    String position = "";


    //Constructor
    public Player(int id, String playerName, String playerPos) {
        player_id = id;
        name = playerName;
        position = playerPos;

    }

    //Methods
    public int getId(){
        return player_id;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

}
