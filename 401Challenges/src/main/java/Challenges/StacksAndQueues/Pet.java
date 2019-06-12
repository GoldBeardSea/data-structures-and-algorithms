package Challenges.StacksAndQueues;

import java.util.Date;

public class Pet {
    public String name;
    public Date date;


    public Pet(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String toString() {
        return this.name;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}