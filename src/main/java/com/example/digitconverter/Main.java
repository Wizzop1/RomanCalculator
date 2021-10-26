package com.example.digitconverter;

import com.example.digitconverter.converter.Converter;
import com.example.digitconverter.exceptions.WrongNumberException;
import com.example.digitconverter.impl.DigitsConverter;
import com.example.digitconverter.impl.Validator;

public class Main {

    private static final Converter converter = new DigitsConverter();

    public static void main(String[] args) {
        Main main = new Main();
        main.romanToArabic();
        main.arabicToRoman();
        main.subtract();
        main.sum();
    }

    private void romanToArabic() {
        String inputThree = "XI";
        int numThree;

        try {
            if (Validator.isInputValid(inputThree) && Validator.isDigitValid(numThree = converter.toArabic(inputThree))) {
                System.out.println(numThree);
            }
        } catch (WrongNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void arabicToRoman() {
        String inputThree = "99";
        String numThree;

        try {
            if (Validator.isNumberValid(inputThree) && Validator.isInputValid(numThree = converter.toRoman(Integer.parseInt(inputThree)))) {
                System.out.println(numThree);
            }
        } catch (WrongNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void subtract() {
        String inputOne = "XII";
        String inputTwo = "XI";
        int numOne;
        int numTwo;

        try {
            if (Validator.isInputValid(inputOne) && Validator.isInputValid(inputTwo)
                    && Validator.isDigitValid(numOne = converter.toArabic(inputOne))
                    && Validator.isDigitValid(numTwo = converter.toArabic(inputTwo))) {

                int diff = numOne - numTwo;
                if (Validator.isNumberValid(diff)) {
                    System.out.println(converter.toRoman(diff));
                }
            }
        } catch (WrongNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void sum() {
        String inputOne = "XI";
        String inputTwo = "X";
        int numOne;
        int numTwo;

        try {
            if (Validator.isInputValid(inputOne) && Validator.isInputValid(inputTwo)
                    && Validator.isDigitValid(numOne = converter.toArabic(inputOne))
                    && Validator.isDigitValid(numTwo = converter.toArabic(inputTwo))) {

                int sum = numOne + numTwo;
                System.out.println(converter.toRoman(sum));
            }
        } catch (WrongNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
