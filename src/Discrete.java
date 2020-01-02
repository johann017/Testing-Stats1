import java.util.ArrayList;

public class Discrete extends BoxPlot{
    public Discrete(){
        super();
    }
    public double expectedValue(ArrayList<Double> val, ArrayList<Double> prob) {
        double expected = 0.0;
        for(int i = 0; i < val.size(); i++){
            expected += (val.get(i)*prob.get(i));
        }
        return expected;
    }
    public double variance(ArrayList<Double> val, ArrayList<Double> prob){
        ArrayList<Double> twice = new ArrayList<>(val);
        for(int i = 0; i < val.size(); i++){
            twice.set(i,Math.pow(val.get(i),2));
        }
        return expectedValue(twice,prob) - Math.pow(expectedValue(val,prob),2);
    }
    public double variance(ArrayList<Double> val){
        double sum = 0;
        for(int i = 0; i < val.size(); i++){
            sum += Math.pow((val.get(i)-mean(val)),2);
        }
        if(getSize() < 30){
            return sum/(getSize()-1);
        }
        return sum/getSize();
    }
    public double standardDeviation(ArrayList<Double> val, ArrayList<Double> prob){
        return Math.pow(variance(val,prob),0.5);
    }
    public double standardDeviation(ArrayList<Double> val){
        double sum = 0;
        for(int i = 0; i < val.size(); i++){
            sum += Math.pow((val.get(i)-mean(val)),2);
        }
        if(getSize() < 30){
            return Math.pow(sum/(getSize()-1),0.5);
        }
        return Math.pow(sum/(getSize()),0.5);
    }
}
