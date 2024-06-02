package service;

import models.ComplexNumbCalc;
public class CalculableFactoryCompl implements ICalculableFactoryCompl{
    @Override
    public CalculableCompl create(Double realArg, Double imaginaryArg) {
        return new ComplexNumbCalc(realArg, imaginaryArg);
    }
}
