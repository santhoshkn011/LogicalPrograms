/*
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.

The java.lang.System.currentTimeMillis() method returns the current time in milliseconds.
The unit of time of the return value is a millisecond, the granularity of the value depends on the underlying operating system and may be larger.
 */
package com.bridgelabz;
import java.util.Scanner; //importing the Scanner
public class StopWatch {
    //Declaring variables
    private static long stopWatchStartTime = 0;
    private static long stopWatchStopTime = 0;
    private static boolean stopWatchRunning = false;
    //Start method
    public void start() {
        this.stopWatchStartTime = System.currentTimeMillis();
        this.stopWatchRunning = true;
    }
    //Stop method
    public void stop() {
        this.stopWatchStopTime = System.currentTimeMillis();
        this.stopWatchRunning = false;
    }
    //Method for calculating the elapsed time
    public static long getElapsedSeconds() {
        long elapsedTime;
        if (stopWatchRunning)
            elapsedTime = (System.currentTimeMillis() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);
        return elapsedTime / 1000;  //Converting milliseconds to seconds.
    }

    public static void main(String args[]) {
        StopWatch watch1 = new StopWatch(); // Creating an object for class StopWatch
        //Start the StopWatch.
        System.out.println("Enter 's' or 'S' to start the stop watch");
        Scanner sc = new Scanner(System.in);
        char start = sc.next().charAt(0);
        watch1.start(); //Calling the method start()
        //Stopping
        System.out.println("Enter 's' or 'S' again to stop the stop watch");
        char stop = sc.next().charAt(0);
        watch1.stop(); //Calling the method stop()
        System.out.println("Elapsed time: " + watch1.getElapsedSeconds() + " Seconds."); //calling getElapsedSeconds().
        }
}

