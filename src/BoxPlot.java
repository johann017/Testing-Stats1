import java.util.ArrayList;

public class BoxPlot extends Storage {
    public BoxPlot(){
        super();
    }
    public BoxPlot(Storage storage){
        super(storage.arr);
    }
    public double mean(){
        ArrayList<Double> shadow = new ArrayList<>(arr);
        double sum = 0;
        for(Double d : shadow){
            sum += d;
        }
        return sum/arr.size();
    }
    public double mean(ArrayList<Double> val){
        ArrayList<Double> shadow = new ArrayList<>(val);
        double sum = 0;
        for(Double d : shadow){
            sum += d;
        }
        return sum/val.size();
    }
    public double median(){
        sort();
        if(arr.size() % 2 ==0){
            return (arr.get((arr.size()/2)-1)+arr.get(arr.size()/2))/2;
        }
        return arr.get(arr.size()/2);
    }
    public double median(ArrayList<Double> a){
        sort(a);
        if(a.size() % 2 ==0){
            return (a.get((a.size()/2)-1)+a.get(a.size()/2))/2;
        }
        return a.get(a.size()/2);
    }
    public String mode(){
        int[] sto = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            int counter = 0;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    counter++;
                }
            }
            sto[i] = counter;
        }
        int max = sto[0];
        int hold = 0;
        for(int i = 1; i < arr.size(); i++){
            if(max<sto[i]){
                max = sto[i];
                hold = i;
            }
        }
        if(sto[hold] == 0.0 && !arr.contains(0.0)){
            return "None";
        }
        return sto[hold] + "";
    }
    public String mode(ArrayList<Double> a){
        int[] sto = new int[a.size()];
        for(int i = 0; i < a.size(); i++) {
            int counter = 0;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    counter++;
                }
            }
            sto[i] = counter;
        }
        int max = sto[0];
        int hold = 0;
        for(int i = 1; i < a.size(); i++){
            if(max<sto[i]){
                max = sto[i];
                hold = i;
            }
        }
        if(sto[hold] == 0.0 && !a.contains(0.0)){
            return "None";
        }
        return sto[hold] + "";
    }
    public double min(ArrayList<Double> a){
        sort(a);
        return a.get(0);
    }
    public double min(){
        sort();
        return arr.get(0);
    }
    public double max(){
        sort();
        return arr.get(arr.size()-1);
    }
    public double max(ArrayList<Double> a){
        sort(a);
        return a.get(a.size()-1);
    }
    public double Q1(){
        sort();
        ArrayList<Double> semi = new ArrayList<>();
        for(int i = 0; i < arr.size()/2; i++){
            semi.add(arr.get(i));
        }
        return median(semi);
    }
    public double Q1(ArrayList<Double> a){
        sort(a);
        ArrayList<Double> semi = new ArrayList<>();
        for(int i = 0; i < a.size()/2; i++){
            semi.add(a.get(i));
        }
        return median(semi);
    }
    public double Q3(){
        sort();
        ArrayList<Double> semi = new ArrayList<>();
        if(arr.size()%2==0){
            for(int i = arr.size()/2; i < arr.size(); i++){
                semi.add(arr.get(i));
            }
        }
        else{
            for(int i = (arr.size()/2) + 1; i < arr.size(); i++){
                semi.add(arr.get(i));
            }
        }
        return median(semi);
    }
    public double Q3(ArrayList<Double> a){
        sort(a);
        ArrayList<Double> semi = new ArrayList<>();
        if(a.size()%2==0){
            for(int i = a.size()/2; i < a.size(); i++){
                semi.add(a.get(i));
            }
        }
        else{
            for(int i = (arr.size()/2) + 1; i < arr.size(); i++){
                semi.add(arr.get(i));
            }
        }
        return median(semi);
    }
    public double IQR(){
        return Q3()-Q1();
    }
    public double IQR(ArrayList<Double> a){
        return Q3(a)-Q1(a);
    }
}
