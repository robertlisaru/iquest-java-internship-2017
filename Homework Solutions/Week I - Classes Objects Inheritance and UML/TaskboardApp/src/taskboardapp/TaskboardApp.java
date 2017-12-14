/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

/**
 * @author Robert
 */
public class TaskboardApp {

    public static void main(String[] args) {

        Taskboard taskboard = new Taskboard(1);
        taskboard.addCard(new Story("yellow", "cleanup configuration",
                "this is the description",
                5));

        Developer me = new Developer();
        me.setDevName("Robert");

        Task task1 = new Task("clear project", "clear the project", 6,
                TaskState.PLANNED, me, me);
        task1.addTag("important");

        taskboard.addCard(task1);


        taskboard.print();
    }

}
