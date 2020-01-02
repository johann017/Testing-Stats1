import java.util.ArrayList;

public class Storage {
    private int size;
    public ArrayList<Double> arr;

    public Storage(){
    }
    public Storage(ArrayList<Double> a){
        arr = new ArrayList<>(a);
    }
    public void setSize(int i) {
        size = i;
    }
    public int getSize() {
        return size;
    }
    public ArrayList<Double> getArr() {
        return arr;
    }
    public void sort(){
        for(int i = 0; i < arr.size(); i++){
            for (int j = i+1; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)){
                    double hold = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,hold);
                }
            }
        }
    }
    public void sort(ArrayList<Double> a){
        for(int i = 0; i < a.size(); i++){
            for (int j = i+1; j < a.size(); j++){
                if(a.get(i) > a.get(j)){
                    double hold = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,hold);
                }
            }
        }
    }
    public String toString(){
        String s = arr.get(0) +"";
        for(int i = 1; i < arr.size(); i++){
            s += "," + arr.get(i);
        }
        return s;
    }

}
