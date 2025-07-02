package pro.sky.homework23.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите все аргументы для выполнения действия";

        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите все аргументы для выполнения действия";

        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите все аргументы для выполнения действия";

        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите все аргументы для выполнения действия";
        } else if (num2 == 0) {
            return "Делить на ноль нельзя";
        } else {
            return num1 + " / " + num2 + " = " + (Double.valueOf(num1) / Double.valueOf(num2));
        }
    }
}
