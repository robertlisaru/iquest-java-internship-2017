/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

import java.util.ArrayList;

public class Taskboard {

    private Integer taskBoardID;
    private ArrayList<ICard> cardList;

    Taskboard(Integer taskBoardID) {
        this.taskBoardID = taskBoardID;
        cardList = new ArrayList<>();
    }

    public void addCard(ICard card) {
        cardList.add(card);
    }

    public void print() {
        System.out.println("Cards: \n");
        for (ICard card : cardList) {
            System.out.println(card);
        }
    }

}
