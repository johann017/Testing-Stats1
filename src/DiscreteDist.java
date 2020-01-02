public class DiscreteDist extends Discrete {
    public double factorial(int i){
        if(i < 2)
            return 1;
        else
            return i * factorial(i-1);
    }
    public double combination(int total, int choose){
        return factorial(total)/(factorial(total-choose) * factorial(choose));
    }
    public double Binomial(int pop, int sample, double wantedProb, double unwantedProb){
        return combination(pop,sample) * Math.pow(wantedProb,sample) * Math.pow(unwantedProb,pop-sample);
    }
    public double HyperGeometric(int pop, int sample, int successPop, int successSample){
        return (combination(successPop,successSample) * combination(pop-successPop,sample-successSample)) / combination(pop,sample);
    }
    public double Poisson(int mean, int num){
        return (Math.pow(Math.E,-mean) * Math.pow(mean,num))/factorial(num);
    }
    public double NegativeBinomial(int pop, int trialNum, double wantedProb){
        return combination(pop-1,trialNum-1) * Math.pow(wantedProb,trialNum-1) * Math.pow(1-wantedProb,pop-trialNum);
    }
}
