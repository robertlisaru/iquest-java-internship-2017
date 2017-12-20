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
public class Story extends Card {

    private String color = "yellow";
    private Integer points;

    @Override
    public String toString() {
        return "Story title: " + title + "\n" + "Description: " + description + "\nSP: "
                + points.toString() + "\nColor: " + color + "\n";
    }

    public Story(String color, String title, String description, Integer points) {
        super(title, description);
        this.color = color;
        this.points = points;
    }

    public Story() {
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
