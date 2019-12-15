package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //NFL PLayers
        Player Bob = new Player(1,"Bob", "QB");
        Player Jerry = new Player(2,"Jerry", "WR");
        Player James = new Player(3,"James", "RB");
        Player Jimmy = new Player(4,"Jimmy", "TE");
        Player Eli = new Player(5,"Eli", "QB");
        Player Daniel = new Player(6,"Daniel", "QB");

        //MLB PLayers
        Player Noah = new Player(1,"Noah", "SP");
        Player Jake = new Player(2,"Jake", "SP");
        Player Seth = new Player(3,"Seth", "RP");
        Player Pete = new Player(4,"Pete", "1B");
        Player Mike = new Player(5,"Mike", "CF");


        //NFL Tests

        //Test case 1

        System.out.println("NFL Test 1");
        System.out.println("==========");

        NFL_Chart NFLDepthChart = new NFL_Chart();

        NFLDepthChart.addPlayerToDepthChart(Bob, "QB", 0);
        NFLDepthChart.addPlayerToDepthChart(Eli, "QB", 0);
        NFLDepthChart.addPlayerToDepthChart(Daniel, "QB", 0);
        NFLDepthChart.addPlayerToDepthChart(Jimmy, "WR", 0);
        NFLDepthChart.addPlayerToDepthChart(Jimmy, "TE", 1);
        NFLDepthChart.addPlayerToDepthChart(Jimmy, "TE", 1);

        //Output Functions
        NFLDepthChart.getFullDepthChart();
        System.out.println();
        NFLDepthChart.getPlayersUnderPlayerInDepthChart(Daniel, "QB");

        System.out.println();
        System.out.println();


        //Test case 2

        System.out.println("NFL Test 2");
        System.out.println("==========");

        NFLDepthChart = new NFL_Chart();

        NFLDepthChart.addPlayerToDepthChart(Bob, "QB", 0);
        NFLDepthChart.addPlayerToDepthChart(Eli, "QB", 0);
        NFLDepthChart.addPlayerToDepthChart(Daniel, "QB", 0);
        NFLDepthChart.addPlayerToDepthChart(Jimmy, "WR", 0);

        NFLDepthChart.removePlayerFromDepthChart(Daniel, "QB");

        //Output Functions
        NFLDepthChart.getFullDepthChart();
        System.out.println();
        NFLDepthChart.getPlayersUnderPlayerInDepthChart(Daniel, "QB");

        System.out.println();
        System.out.println();

        //Baseball Tests


        //Test Case 1
        System.out.println("Baseball Test 1");
        System.out.println("===============");

        MLB_Chart MLBDepthChart = new MLB_Chart();

        MLBDepthChart.addPlayerToDepthChart(Noah, "SP", 0);
        MLBDepthChart.addPlayerToDepthChart(Jake, "SP", 2);
        MLBDepthChart.addPlayerToDepthChart(Seth, "RP", 0);
        MLBDepthChart.addPlayerToDepthChart(Pete, "SP");

        MLBDepthChart.addPlayerToDepthChart(Mike, "1B", 0);

        MLBDepthChart.getFullDepthChart();

        System.out.println();

        MLBDepthChart.getPlayersUnderPlayerInDepthChart(Seth, "RP");

        System.out.println();
        System.out.println();

        //Test Case 2
        System.out.println("Baseball Test 2");
        System.out.println("===============");

        MLBDepthChart = new MLB_Chart();

        MLBDepthChart.addPlayerToDepthChart(Pete, "SP");
        MLBDepthChart.removePlayerFromDepthChart(Pete, "SP");

        MLBDepthChart.getFullDepthChart();



    }


}
