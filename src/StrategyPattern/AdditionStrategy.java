package StrategyPattern;

public class AdditionStrategy implements BasicCalculationStrategy {
    @Override
    public int calculation(int a, int b) {
        return a+b;
    }
}
