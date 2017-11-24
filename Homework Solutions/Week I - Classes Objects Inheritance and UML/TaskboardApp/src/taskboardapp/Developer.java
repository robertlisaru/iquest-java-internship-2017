/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskboardapp;

/**
 * @author Robert
 */
public class Developer {

    private String devName;

    public String getName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public Developer(String devName) {
        this.devName = devName;
    }

    public Developer() {
    }
}
