package rvt;

import java.util.ArrayList;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (double) sum / count;
    }
}
