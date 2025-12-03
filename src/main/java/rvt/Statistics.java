package rvt;

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

    public String toString() {
        return "Count: " + count + "\n" +
                "Sum: " + sum + "\n" +
                "Average: " + average();
    }
}
