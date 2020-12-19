/**
 * Class Time
 */
public class Time {
    /**
     * method that time from the coming into location
     *
     * @param start time of starting the way
     * @return long time
     */


    public long mainn(long start) {
        long time = System.currentTimeMillis() - start;
        return time;
    }

    /**
     * method that write information about time
     */

    public void running(long time) {
        System.out.printf("%s%d%s", "Time since entering the tunnel:", time, " milliseconds.");
        System.out.println("\n");
    }

}