/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Taskboard {

    private Integer taskBoardID;
    private Map<String, Card> cards;

    Taskboard(Integer taskBoardID) {
        this.taskBoardID = taskBoardID;
        cards = new HashMap<>();
    }

    public void addCard(Card card) {
        cards.put(card.getTitle(), card);
    }

    public void removeCard(String key){
        cards.remove(key);
    }

    public void setState(int index, TaskState state){

    }

    public void print() {
        System.out.println("Cards: \n");
        for (String key : cards.keySet()) {
            System.out.println(cards.get(key));
        }
    }
}
