package controller;

import service.CalculableFactoryCompl;
import service.ICalculableFactoryCompl;
import view.ViewComplexCalculator;


public class Controller {

    private ICalculableFactoryCompl calculableFactoryCompl;

    public Controller() {
        calculableFactoryCompl = new CalculableFactoryCompl();
    }

    public void start() {
            try {
                ViewComplexCalculator view = new ViewComplexCalculator(calculableFactoryCompl);
                view.run();
            } catch (Exception E) {
                System.out.println("Ошибка входных данных!");
            }
    }
}

