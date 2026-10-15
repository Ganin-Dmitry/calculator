package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello () {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam (value = "num1", required = false) Integer oneNum, @RequestParam (value = "num2", required = false) Integer twoNum) {
        if (oneNum != null && twoNum != null) {
            return calculatorService.plus(oneNum, twoNum);
        } else {
            return calculatorService.valueError();
        }
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam (value = "num1", required = false) Integer oneNum, @RequestParam (value = "num2", required = false) Integer twoNum) {
        if (oneNum != null && twoNum != null) {
            return calculatorService.minus(oneNum, twoNum);
        } else {
            return calculatorService.valueError();
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam (value = "num1", required = false) Integer oneNum, @RequestParam (value = "num2", required = false) Integer twoNum) {
        if (oneNum != null && twoNum != null) {
            return calculatorService.multiply(oneNum, twoNum);
        } else {
            return calculatorService.valueError();
        }
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam (value = "num1", required = false) Integer oneNum, @RequestParam (value = "num2", required = false) Integer twoNum) {
        if (oneNum != null && twoNum != null) {
            return calculatorService.divide(oneNum, twoNum);
        } else {
            return calculatorService.valueError();
        }
    }
}
