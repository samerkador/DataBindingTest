package com.example.samerkador.androiddatabindingtest;

/**
 * Created by Samer.kador on 10/17/2017.
 */

public class User {

private String name;
private String pass;

    User()
    {
        this.name= "Enter user Name";
        this.pass= "Enter user Password ";
    }

    User(String name, String pass)
    {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
