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
    public String plus (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.plus(num1, num2);
        } else {
            return calculatorService.valueError();
        }
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.minus(num1, num2);
        } else {
            return calculatorService.valueError();
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.multiply(num1, num2);
        } else {
            return calculatorService.valueError();
        }
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam (value = "num1", required = false) Integer num1, @RequestParam (value = "num2", required = false) Integer num2) {
        if (num1 != null && num2 != null) {
            return calculatorService.divide(num1, num2);
        } else {
            return calculatorService.valueError();
        }
    }
}
