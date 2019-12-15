package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

abstract class AbstractSportChart {
    //Variables
    protected Map<String, LinkedList<Player>> positionsMap = new HashMap<>();


    //Methods
    protected void addPlayerToDepthChart(Player player, String position, int position_depth){
          if(positionsMap.get(position) != null) { //Check first if position in applicable for sport
              if (positionsMap.get(position).isEmpty() == true || position_depth > positionsMap.get(position).size()) {
                  if (positionsMap.get(position).contains(player) == false) {
                      positionsMap.get(position).add(player); //Add player to end if depth chart for that pos is empty pos > size of array
                  }
              } else {
                  if (positionsMap.get(position).contains(player) == false) {
                      positionsMap.get(position).add(position_depth, player);
                  }
              }
          }else{
              System.out.println("Position not correct for this sport");
          }
    }

    //If no position depth is specified then add to end of the depth chart
    protected void addPlayerToDepthChart(Player player, String position){
        positionsMap.get(position).add(player);
    }

    //Function to remove payer from depth chart
    protected void removePlayerFromDepthChart(Player player, String position){
        int removeIndex = 0;
        boolean okToRemove = false;
        //find the index of the player we are removing
        for(int i = 0; i < positionsMap.get(position).size(); i++) {
            if (positionsMap.get(position).get(i).getId() == player.getId()){
                //Store the index
                removeIndex = i;
                okToRemove = true;
            }
        }



        if (okToRemove == true){
            positionsMap.get(position).remove(removeIndex);
        }
    }

    protected void getFullDepthChart() {
        int printFlag = 0; //Flag to make sure that title only prints once
        if (depthChartEmpty()){
            System.out.println("Depth Chart is empty");
            return;
        }

        System.out.println("Full Depth Chart:");
        for (String key : positionsMap.keySet()) {
            if (positionsMap.get(key).isEmpty() != true) {
                for (int i = 0; i < positionsMap.get(key).size(); i++) {
                    if (printFlag == 0) {
                        //Handling when there is only one player at the position
                        if(positionsMap.get(key).size() == 1){
                            System.out.print(key + ": [" + positionsMap.get(key).get(i).getId() + "]");
                        //Handling when there is more than one player at the position
                        }else{
                            System.out.print(key + ": [" + positionsMap.get(key).get(i).getId() + ",");
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

    protected void getPlayersUnderPlayerInDepthChart(Player player, String position){
        //Find the index of the player
        int playerIndex = 0;
        boolean playerExists = false;
        //Find the player under the passed in position
        if(positionsMap.get(position) != null) {
            for (int i = 0; i < positionsMap.get(position).size(); i++) {
                if (positionsMap.get(position).get(i).getId() == player.getId()) {
                    playerIndex = i; //Store the found player index
                    playerExists = true;
                }
            }
        }

        if(playerExists) {
            int printFlag = 0;
            if ((playerIndex + 1)  < positionsMap.get(position).size()) {
                System.out.println("Players in Depth Chart under " + player.getName() + ":");
                //Start at the index of the found player and then loop from there
                for (int i = playerIndex + 1; i < positionsMap.get(position).size(); i++) {
                    if (printFlag == 0) {
                        System.out.print(position + ": [" + positionsMap.get(position).get(i).getId() + ",");

                        if (positionsMap.get(position).size() == 1) {
                            System.out.print("]");
                        }
                        printFlag = 1;
                    } else {
                        if (i < positionsMap.get(position).size() - 1) {
                            System.out.print(positionsMap.get(position).get(i).getId() + ",");
                        } else {
                            System.out.print(positionsMap.get(position).get(i).getId() + "]");
                        }
                    }

                }

            }else{
                System.out.print("There is no one underneath " + player.getName() + " in the depth chart at the " + position + " position");
            }
        }else {
            System.out.print(player.getName() + " is not in the depth chart at the " + position + " position");
        }
        System.out.println();
    }

    boolean depthChartEmpty() {
        int emptyCount = 0;
        for (String key : positionsMap.keySet()) {
            if (positionsMap.get(key).isEmpty() == true)
                emptyCount += 1;
        }

        if (emptyCount == positionsMap.size()){
            return true;
        }else{
            return false;
        }
    }
}
