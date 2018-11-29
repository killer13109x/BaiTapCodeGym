package OOP.stopwatch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class StopWatchTest {
    @Test
    void getElapsedTime() {
        int[] arr = new int[10000];
        Random rd = new Random(10000);
        for (int i=0; i<10000; i++){
            arr[i] = rd.nextInt(1000);
        }

        StopWatch sw = new StopWatch();
        System.out.println(sw.getStartTime());

        sw.start();
        System.out.println(sw.getStartTime());

        sw.sort(arr);

        sw.stop();
        System.out.println(sw.getEndTime());

        System.out.println(sw.getElapsedTime());
    }
}