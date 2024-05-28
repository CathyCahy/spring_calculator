package ru.skypro.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.calculator.calculation.CalculationService;

@RestController
@RequestMapping("/calculator")


public class CalculatorController {
    private final CalculationService calculationService;

    public CalculatorController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping
    public String hello (){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping ("/plus")
    public String sum (@RequestParam int num1, @RequestParam int num2){

        return num1 +" + " + num2 + " = "+ calculationService.sum(num1,num2);

    }

    @GetMapping ("/minus")
    public String diff (@RequestParam int num1, @RequestParam int num2){

        return num1 +" - " + num2 + " = "+ calculationService.diff(num1,num2);

    }
    @GetMapping ("/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2){

        return num1 +" * " + num2 + " = "+ calculationService.multiply(num1,num2);

    }
    @GetMapping ("/divide")
    public String divide (@RequestParam int num1, @RequestParam int num2){
        if (num2==0){
            return "Ошибка: деление на 0!";
        }

        return num1 +" / " + num2 + " = "+ calculationService.divide(num1,num2);

    }
}
