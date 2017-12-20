/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Week I - Homework.docx:
 * The task card has a title, detailed description of the task (acceptance criteria),
 * estimation, color (‘green’ - normal, ‘red’ - blocked) and
 * multiple tags (name of the developer working on the task, name of the
 * developer reviewing the task,  * reason of the blocking state, etc.).
 * This type of card can be moved between columns (other than the ‘Stories’ column where it cannot be present).
 */

public class Task extends Card {

    private Integer hoursLeft;
    private Boolean blocked;
    private String blockReason;
    private TaskState state;
    private List<String> tags = new ArrayList<>();
    private Developer devWorking;
    private Developer devReviewing;

    public void block(String blockReason) {
        blocked = true;
        this.blockReason = blockReason;
    }

    public void unblock() {
        blocked = false;
        blockReason = null;
    }

    public void setState(TaskState state) {
        if (!isBlocked()) {
            this.state = state;
        }
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    @Override
    public String toString() {
        String returnString;
        returnString = "Task title: " + title + "\n" + "Description: " + description + "\n"
                + "Hours left: " + hoursLeft + "\n";
        returnString += "Developer: ";
        returnString += (devWorking.getName() + "\n");
        if (blocked) {
            returnString += (blockReason + "\n");
        }
        returnString += "Tags: ";
        for (String tag : tags) {
            returnString += (tag + " ");
        }
        return returnString + "\n";
    }

    public Task(String title, String description, Integer hoursLeft,
                TaskState state, Developer devWorking, Developer devReviewing) {
        super(title, description);
        this.hoursLeft = hoursLeft;
        this.state = state;
        this.devWorking = devWorking;
        this.devReviewing = devReviewing;
        tags = new ArrayList<>();
        blocked = false;
    }

    public Task() {
    }

    public Integer getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(Integer hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    public Boolean isBlocked() {
        return blocked;
    }

    public TaskState getState() {
        return state;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Developer getDevWorking() {
        return devWorking;
    }

    public void setDevWorking(Developer devWorking) {
        this.devWorking = devWorking;
    }

    public Developer getDevReviewing() {
        return devReviewing;
    }

    public void setDevReviewing(Developer devReviewing) {
        this.devReviewing = devReviewing;
    }
}
