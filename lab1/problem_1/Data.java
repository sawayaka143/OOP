package problem_1;

import java.util.ArrayList;

public class Data {
    private ArrayList<Double> values;

    public Data() {
        values = new ArrayList<>();
    }

    public void add(double value) {
        values.add(value);
    }

    public double getAverage() {
        if (values.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0;
        for (double val : values) {
            sum += val;
        }
        
        return sum / values.size();
    }
    
    public double getMaximum() {
        if (values.isEmpty()) {
            return 0.0; 
        }

        double max = values.get(0);
        for (double val : values) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public int getCount() {
        return values.size();
    }
}