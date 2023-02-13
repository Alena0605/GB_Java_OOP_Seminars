package Seminar7.DecoratorFactory;

public class Decorator implements Calculable {
    private final Calculable calc;
    private final Logger logger;

    public Decorator(Calculable calc, Logger logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        Calculable result = calc.sum(arg);
        logger.log("Get sum");
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        Calculable result = calc.multi(arg);
        logger.log("Get multiplication");
        return result;
    }

    @Override
    public int getResult() {
        int result = calc.getResult();
        logger.log("Get result");
        return result;
    }
}
