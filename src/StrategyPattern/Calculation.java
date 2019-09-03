package StrategyPattern;

public class Calculation {
    private BasicCalculationStrategy basicCalculationStrategy;

    public Calculation(BasicCalculationStrategy calculationStrategy){
        this.basicCalculationStrategy = calculationStrategy;
    }

    public int performCalculation(int a, int b){
        return basicCalculationStrategy.calculation(a,b);
    }
}
