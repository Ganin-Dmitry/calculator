package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello () {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String plus (int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus (int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply (int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide (int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + ((float)num1 / num2);
        } else {
            return nullError();
        }
    }

    public String nullError () {
        return "<b>На ноль делить нельзя!</b>";
    }

    public String valueError () {
        return "<b>Не указано значение!</b>";
    }
}
