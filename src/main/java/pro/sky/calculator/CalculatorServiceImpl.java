package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String hello () {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String plus (int oneNum, int twoNum) {
        return oneNum + " + " + twoNum + " = " + (oneNum + twoNum);
    }

    public String minus (int oneNum, int twoNum) {
        return oneNum + " - " + twoNum + " = " + (oneNum - twoNum);
    }

    public String multiply (int oneNum, int twoNum) {
        return oneNum + " * " + twoNum + " = " + (oneNum * twoNum);
    }

    public String divide (int oneNum, int twoNum) {
        if (twoNum != 0) {
            return oneNum + " / " + twoNum + " = " + ((float)oneNum / twoNum);
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
