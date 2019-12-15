package com.company;

import java.util.LinkedList;

public class NFL_Chart extends AbstractSportChart {
    //Map<String, LinkedList<Player>> positionsMap = new HashMap<>();

    public NFL_Chart() {
        positionsMap.put("QB", new LinkedList<Player>());
        positionsMap.put("WR", new LinkedList<Player>());
        positionsMap.put("RB", new LinkedList<Player>());
        positionsMap.put("TE", new LinkedList<Player>());
        positionsMap.put("K", new LinkedList<Player>());
        positionsMap.put("P", new LinkedList<Player>());
        positionsMap.put("KR", new LinkedList<Player>());
        positionsMap.put("PR", new LinkedList<Player>());
    }


    //Methods

    /*public void addPlayerToDepthChart(Player player, String position, int position_depth){
        if (positionsMap.get(position).isEmpty() == true || position_depth > positionsMap.get(position).size()) {
            positionsMap.get(position).add(player);
        }else{
            positionsMap.get(position).add(position_depth, player);
        }
    }

    public void addPlayerToDepthChart(Player player, String position){
        positionsMap.get(position).add(player);
    }

    public void removePlayerToDepthChart(Player player, String position){
        int removeIndex = 0;
        boolean okToRemove = false;
        for(int i = 0; i < positionsMap.get(position).size(); i++) {
            if (positionsMap.get(position).get(i).getId() == player.getId()){
                removeIndex = i;
                okToRemove = true;
            }
        }
        if (okToRemove == true){
            positionsMap.get(position).remove(removeIndex);
        }
    }

    public void getFullDepthChart() {
        int printFlag = 0;
        for (String key : positionsMap.keySet()) {
            if (positionsMap.get(key).isEmpty() != true) {
                for (int i = 0; i < positionsMap.get(key).size(); i++) {
                    if (printFlag == 0) {
                        System.out.print(key + ": [" + positionsMap.get(key).get(i).getId() + ",");

                        if(positionsMap.get(key).size() == 1){
                            System.out.print("]");
                        }
                        printFlag = 1;
                    } else {
                        if (i < positionsMap.get(key).size() - 1) {
                            System.out.print(positionsMap.get(key).get(i).getId() + ",");
                        }else{
                            System.out.print(positionsMap.get(key).get(i).getId() + "]");
                        }
                    }

                }
                System.out.println();
                printFlag = 0;
            }

        }

    }

    public void getPlayersUnderPlayerInDepthChart(String player, String position){

    }
*/
}
