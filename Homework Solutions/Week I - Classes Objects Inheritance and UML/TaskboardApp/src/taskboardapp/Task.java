/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

import java.util.ArrayList;

/**
 * Week I - Homework.docx:
 * The task card has a title, detailed description of the task (acceptance criteria),
 * estimation, color (‘green’ - normal, ‘red’ - blocked) and
 * multiple tags (name of the developer working on the task, name of the
 * developer reviewing the task,  * reason of the blocking state, etc.).
 * This type of card can be moved between columns (other than the ‘Stories’ column where it cannot be present).
 */

public class Task implements ICard {

    private String taskTitle;
    private String taskDescription;
    private Integer hoursLeft;
    private Boolean isBlocked;
    private String blockReason;
    private TaskState taskState;
    private ArrayList<String> tags;
    private Developer devWorking;
    private Developer devReviewing;

    public void Block(String blockReason) {
        isBlocked = true;
        this.blockReason = blockReason;
    }

    public void Unblock() {
        isBlocked = false;
        blockReason = null;
    }

    public void changeState(TaskState taskState) {
        this.taskState = taskState;
    }

    public void addTag(String taskTag) {
        tags.add(taskTag);
    }

    @Override
    public String toString() {
        String returnString;
        returnString = "Task title: " + taskTitle + "\n" + "Description: " + taskDescription + "\n"
                + "Hours left: " + hoursLeft + "\n";
        returnString += "Developer: ";
        returnString += (devWorking.getName() + "\n");
        if (isBlocked) {
            returnString += (blockReason + "\n");
        }
        returnString += "Tags: ";
        for (String tag : tags) {
            returnString += (tag + " ");
        }
        return returnString + "\n";
    }

    public Task(String taskTitle, String taskDescription, Integer hoursLeft,
                TaskState taskState, Developer devWorking, Developer devReviewing) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.hoursLeft = hoursLeft;
        this.taskState = taskState;
        this.devWorking = devWorking;
        this.devReviewing = devReviewing;
        tags = new ArrayList<>();
        isBlocked = false;
    }

    public Task() {
    }
}
