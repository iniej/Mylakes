package com.Iniebiyo;

        import java.util.ArrayList;
        import java.util.Collections;

/**
 * Created by Iniebiyo  on 3/11/2017.
 */
public class lakes {

    /**
     * Store data about lakes.
     */
    //Data that an lake object needs to store.
    private String name;
    private ArrayList<Double> times;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructor
    public lakes(String lakeName) {
        this.name = lakeName;
        // Set up the times to run around a lake.
        this.times = new ArrayList<Double>();

    }

    void addTime(double runTime) {
        times.add(runTime);

    }

    void writeLakeInfo() {
        System.out.println(name + "; " + Collections.min(times));
    }
}

