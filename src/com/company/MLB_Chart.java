package com.company;

import java.util.LinkedList;

public class MLB_Chart extends AbstractSportChart {


    public MLB_Chart() {
        positionsMap.put("SP", new LinkedList<Player>());
        positionsMap.put("RP", new LinkedList<Player>());
        positionsMap.put("C", new LinkedList<Player>());
        positionsMap.put("1B", new LinkedList<Player>());
        positionsMap.put("2B", new LinkedList<Player>());
        positionsMap.put("3B", new LinkedList<Player>());
        positionsMap.put("SS", new LinkedList<Player>());
        positionsMap.put("LF", new LinkedList<Player>());
        positionsMap.put("RF", new LinkedList<Player>());
        positionsMap.put("CF", new LinkedList<Player>());
        positionsMap.put("DH", new LinkedList<Player>());
    }
}
