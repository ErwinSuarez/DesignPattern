package StrategyPattern;

public class MultiplicationStrategy implements BasicCalculationStrategy {
    @Override
    public int calculation(int a, int b) {
        if((a == 0)|(b==0))
            return 0;
        else
            return a*b;
    }
}
