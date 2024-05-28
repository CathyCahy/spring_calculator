package ru.skypro.calculator.calculation;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public int sum(int a, int b) {

        return a + b;
    }
}
