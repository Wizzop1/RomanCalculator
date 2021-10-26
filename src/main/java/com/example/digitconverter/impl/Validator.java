package com.example.digitconverter.impl;


import com.example.digitconverter.exceptions.WrongNumberException;

import java.util.Map;

import static com.example.digitconverter.constants.Constants.*;

public class Validator {

    private static final Integer MAX_INPUT_LENGTH = 8;
    private static final Integer MAX_DIGIT_VALUE = 100;
    private static final Integer MIN_INVALID_DIGIT_VALUE = 0;

    public static boolean isInputValid(String input) {
        if (input.length() > MAX_INPUT_LENGTH) {
            throw new WrongNumberException(ERROR_MESSAGE_GENERATOR.apply(DIGIT_LENGTH_LARGER_THAN_OR_EQUALS_8, input));
        }
        return true;
    }

    public static boolean isDigitValid(int num) {
        if (num > MAX_DIGIT_VALUE) {
            throw new WrongNumberException(ERROR_MESSAGE_GENERATOR.apply(DIGIT_GRATER_THAN_OR_EQUALS_100, String.valueOf(num)));
        }
        return true;
    }

    public static boolean isNumberValid(int num) {
        if (num <= MIN_INVALID_DIGIT_VALUE) {
            throw new WrongNumberException(ERROR_MESSAGE_GENERATOR.apply(DIFF_IS_BELOW_OR_EQUAL_ZERO, String.valueOf(num)));
        }
        return true;
    }

    public static boolean isNumberValid(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                throw new WrongNumberException(ERROR_MESSAGE_GENERATOR.apply(INVALID_NUMBER_FORMAT_DETECTED, num));
            }
        }
        return true;
    }

    public static boolean isCharacterRoman(char letter, Map<Character, Integer> map) {
        if (!map.containsKey(letter)) {
            throw new WrongNumberException(ERROR_MESSAGE_GENERATOR.apply(INVALID_CHARACTER_DETECTED, String.valueOf(letter)));
        }
        return true;
    }
}
