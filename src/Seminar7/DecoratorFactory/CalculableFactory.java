package Seminar7.DecoratorFactory;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Decorator(new Calculator(primaryArg), new LogInTerminal());
    }
}
