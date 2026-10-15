package pro.sky.calculator;

public interface CalculatorService {

    public String hello ();
    public String plus (int oneNum, int twoNum);
    public String minus (int oneNum, int twoNum);
    public String multiply (int oneNum, int twoNum);
    public String divide (int oneNum, int twoNum);
    public String valueError ();
    public String nullError ();

}
