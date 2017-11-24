/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

/**
 * Week I - Homework.docx:
 * A story card always has the ‘yellow’ color and has a title,
 * short description of the story and estimation in story points.
 * This card can be present only on the ‘Stories’ column.
 */
public class Story implements ICard {

    private String color;
    private String storyTitle;
    private String storyDescription;
    private Integer storyPoints;

    @Override
    public String toString() {
        return "Story title: " + storyTitle + "\n" + "Description: " + storyDescription + "\nSP: "
                + storyPoints.toString() + "\nColor: " + color + "\n";
    }

    public Story(String color, String storyTitle, String storyDescription, Integer storyPoints) {
        this.color = color;
        this.storyTitle = storyTitle;
        this.storyDescription = storyDescription;
        this.storyPoints = storyPoints;
    }

    public Story() {
    }
}
