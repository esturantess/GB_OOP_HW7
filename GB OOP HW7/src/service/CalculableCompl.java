package service;

public interface CalculableCompl {
    CalculableCompl sum(Double realArg, Double imaginaryArg);
    CalculableCompl multi(Double realArg, Double imaginaryArg);
    CalculableCompl difference(Double realArg, Double imaginaryArg);
    CalculableCompl division(Double realArg, Double imaginaryArg);
    String getResult();
}
