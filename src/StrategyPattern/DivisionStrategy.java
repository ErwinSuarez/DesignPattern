package StrategyPattern;

public class DivisionStrategy implements BasicCalculationStrategy {
    @Override
    public int calculation(int a, int b) {
        if(a == 0)
            return 0;
        else if(b == 0)
            return 0;
        else
            return a/b;
    }
}
