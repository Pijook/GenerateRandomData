package pl.pijok.generator;

public class Data {

    private double min;
    private double max;
    private String group;

    public Data(double min, double max, String group) {
        this.min = min;
        this.max = max;
        this.group = group;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
