package com.Iniebiyo;

public class lakesManager {

    public static void main(String args[]) {

        //This program enables you to enter
        // the names of lakes and times, and
        // prints out the fastest times for each lake.

        //Create a Cedar lake object.
        lakes cedar = new lakes("Cedar");

        //Add the times to Cedar lake.
        cedar.addTime(45.15);
        cedar.addTime(43.32);

        //Print out the fastest times to
        // run around Cedar lake.
        cedar.writeLakeInfo();

        //Create a Harriet lake object.
        lakes harriet = new lakes("Harriet");

        //Add the times to Harriet lake.
        harriet.addTime(49.34);
        harriet.addTime(44.43);
        harriet.addTime(46.22);

        //Print out the fastest time to
        // run around Harriet lake.
        harriet.writeLakeInfo();

        //Create a Como lake object.
        lakes como = new lakes("Como");

        //Add times to como.
        como.addTime(32.11);
        como.addTime(28.14);

        como.writeLakeInfo();

    }

}
