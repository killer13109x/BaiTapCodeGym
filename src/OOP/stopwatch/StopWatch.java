package OOP.stopwatch;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    private String startTime, endTime;

    public StopWatch() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
        startTime = simpleDateFormat.format(date);
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void start() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
        startTime = simpleDateFormat.format(date);
    }

    public void stop() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
        endTime = simpleDateFormat.format(date);
    }

    public int getElapsedTime() {
        return convertToMiliSecond(endTime) - convertToMiliSecond(startTime);
    }

    public int convertToMiliSecond(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 3600000
                + Integer.parseInt(s.substring(3, 5)) * 60000
                + Integer.parseInt(s.substring(6, 8)) * 1000
                + Integer.parseInt(s.substring(9, 12));
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
