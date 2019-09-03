package StrategyPattern;

public class SubtractionStrategy implements BasicCalculationStrategy {
    @Override
    public int calculation(int a, int b) {
        return a-b;
    }
}
