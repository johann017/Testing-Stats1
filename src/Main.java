import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Storage st = new Storage();
        System.out.print("Please enter how many values you would like to enter:");
        int n = sc.nextInt();
        st.setSize(n);
        for(int i = 0; i < n; i++){
            boolean bool = true;
            while(bool) {
                System.out.print("Please enter the next positive value:");
                double k = sc.nextDouble();
                if (k >= 0) {
                    st.arr.add(k);
                    bool = false;
                }
            }
        }
        st.sort();
        System.out.println(st.toString());
        System.out.print("What would you like to calculate?: Mean, Median, Mode, Min, Max, Q1, Q3, IQR, or Fast Stats(Press Space)");
        String input = sc.next();
        BoxPlot bp = new BoxPlot(st);
        if(input.equals("Mean")){
            System.out.println(bp.mean());
        }
        else if(input.equals("Median")){
            System.out.println(bp.median());
        }
        else if(input.equals("Mode")){
            System.out.println(bp.mode());
        }
        else if(input.equals("Min")){
            System.out.println(bp.min());
        }
        else if(input.equals("Max")){
            System.out.println(bp.max());
        }
        else if(input.equals("Q1")){
            System.out.println(bp.Q1());
        }
        else if(input.equals("Q3")){
            System.out.println(bp.Q3());
        }
        else if(input.equals("IQR")){
            System.out.println(bp.IQR());
        }
        else{
            System.out.print("Mean:" + bp.mean() + ", Median:" + bp.median() + ",  Mode:" + bp.mode() +
                    ", Min: " + bp.min() + ", Max:" + bp.max() + ", Q1:" + bp.Q1() + ", Q3:" + bp.Q3()+
                    ", IQR:" + bp.IQR());
        }
    }
}
