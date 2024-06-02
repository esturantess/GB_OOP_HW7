package view;

import com.sun.tools.javac.Main;
import controller.Controller;
import log.ConsoleLogger;
import log.LogCalculableFactoryCompl;
import service.CalculableCompl;
import service.ICalculableFactoryCompl;

import java.util.Scanner;

public class ViewComplexCalculator {
    private ICalculableFactoryCompl calculableFactoryCompl;
    String INPUT1 = "Введите вещественное число второго комплексного числа: ";
    String INPUT2 = "Введите мнимое число второго комплексного числа: ";
    Boolean start = true;

    public ViewComplexCalculator(ICalculableFactoryCompl calculableFactory) {
        this.calculableFactoryCompl = new LogCalculableFactoryCompl(new ConsoleLogger());
    }

    public void run() {
            Double primaryArgReal = promptDouble("Введите вещественное число комплексного числа: ");
            Double primaryArgImaginary = promptDouble("Введите мнимое число комплексного числа: ");
            CalculableCompl calculator = calculableFactoryCompl.create(primaryArgReal, primaryArgImaginary);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /) : ");
                if (cmd.equals("*")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.multi(realArg, imagionaryArg);
                    break;
                }
                if (cmd.equals("+")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.sum(realArg, imagionaryArg);
                    break;
                }
                if (cmd.equals("-")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.difference(realArg, imagionaryArg);
                    break;
                }
                if (cmd.equals("/")) {
                    Double realArg = promptDouble(INPUT1);
                    Double imagionaryArg = promptDouble(INPUT2);
                    calculator.division(realArg, imagionaryArg);
                    break;
                }
            }
            String cmd = prompt("Новый расчет (Y/N)? ");
            System.out.println(cmd);
            if (cmd.equalsIgnoreCase(("y"))){
                run();
            }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
