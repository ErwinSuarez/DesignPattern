package StrategyPattern;

public class CalcuatorDriver {

    public static void main(String[] args) {
        Calculation calculaton;
        System.out.println("Welcome");
        System.out.println("Simulating numbers to ADD");
        calculaton = new Calculation(new AdditionStrategy());
        System.out.println("12 + 4 = " + calculaton.performCalculation(12,4));

        System.out.println("Simulating numbers to MULTIPLY");
        calculaton = new Calculation(new MultiplicationStrategy());
        System.out.println("12 * 4 = " + calculaton.performCalculation(12,4));

        System.out.println("Simulating numbers to SUBTRACT");
        calculaton = new Calculation(new SubtractionStrategy());
        System.out.println("12 - 4 = " + calculaton.performCalculation(12,4));

        System.out.println("Simulating numbers to DIVIDE");
        calculaton = new Calculation(new DivisionStrategy());
        System.out.println("12 / 4 = " + calculaton.performCalculation(12,4));

        System.out.println("Thank you... Good bye!!!");
    }
}
