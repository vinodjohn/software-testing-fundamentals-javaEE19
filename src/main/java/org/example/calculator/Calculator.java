package org.example.calculator;

public class Calculator {
    public float addArray(float[] inputArray) {
        float result = 0;

        for (float input : inputArray) {  // {1, 2, 3}
            result += input; // result = result + input
        }

        return result;
    }
}
