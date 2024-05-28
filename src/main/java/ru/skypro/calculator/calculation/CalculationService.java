package ru.skypro.calculator.calculation;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public int sum(int a, int b) {

        return a + b;
    }
    public int diff(int a, int b) {

        return a - b;
    }
    public int multiply (int a, int b) {

        return a * b;
    }
    public int divide (int a, int b) {

        return a / b;
    }
}
