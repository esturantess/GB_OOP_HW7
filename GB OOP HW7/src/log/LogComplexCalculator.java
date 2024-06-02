package log;

import service.CalculableCompl;

public class LogComplexCalculator implements CalculableCompl {
    private Logable logger;
    private CalculableCompl calculableCompl;

    public LogComplexCalculator(CalculableCompl calculableCompl, Logable logger) {
        this.logger = logger;
        this.calculableCompl = calculableCompl;
    }

    @Override
    public CalculableCompl sum(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Сложение первого значения " + calculableCompl.toString() + "i" +
                    " со вторым " + realArg + "+" + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.sum(realArg, imaginaryArg) + "i");
        } else {
            logger.log("Сложение первого значения " + calculableCompl.toString() + "i" +
                    " со вторым " + realArg + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.sum(realArg, imaginaryArg) + "i");
        }
        return calculableCompl.sum(realArg, imaginaryArg);
    }

    @Override
    public CalculableCompl multi(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Умножение первого значения " + calculableCompl.toString() + "i" +
                    " на второе " + realArg + "+" + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.multi(realArg, imaginaryArg) + "i");
        } else {
            logger.log("Умножение первого значения " + calculableCompl.toString() + "i" +
                    " на второе " + realArg + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.multi(realArg, imaginaryArg) + "i");
        }
        return calculableCompl.multi(realArg, imaginaryArg);
    }

    @Override
    public CalculableCompl difference(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Вычитание из первого значения " + calculableCompl.toString() + "i" +
                    " второго " + realArg + "+" + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.difference(realArg, imaginaryArg) + "i");
        } else {
            logger.log("Вычитание из первого значения " + calculableCompl.toString() + "i" +
                    " второго " + realArg + imaginaryArg + "i");
            logger.log("Результат: "+ calculableCompl.difference(realArg, imaginaryArg) + "i");
        }
        return calculableCompl.difference(realArg, imaginaryArg);
    }

    @Override
    public CalculableCompl division(Double realArg, Double imaginaryArg) {
        if (imaginaryArg > 0) {
            logger.log("Деление первого значения " + calculableCompl.toString() + "i" +
                    " на второе " + realArg + "+" + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.division(realArg, imaginaryArg) + "i");
        } else {
            logger.log("Деление первого значения " + calculableCompl.toString() + "i" +
                    " на второе " + realArg + imaginaryArg + "i");
            logger.log("Результат: " + calculableCompl.division(realArg, imaginaryArg) + "i");
        }
        return calculableCompl.division(realArg, imaginaryArg);
    }

    @Override
    public String getResult() {
        return calculableCompl.getResult();
    }
}
