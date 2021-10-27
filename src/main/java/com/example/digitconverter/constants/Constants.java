package com.example.digitconverter.constants;

import java.util.function.BiFunction;

public class Constants {

    public static final String APP_TITLE = "Converter";
    public static final Integer WINDOW_WIDTH = 313;
    public static final Integer WINDOW_HEIGHT = 399;
    public static final String FXML_NAME = "hello-view.fxml";


    public static final String INVALID_CHARACTER_DETECTED = "Invalid character (%s) detected!";
    public static final String DIGIT_GRATER_THAN_OR_EQUALS_100 = "Digit (%s) is greater than or equals 100!";
    public static final String DIGIT_LENGTH_LARGER_THAN_OR_EQUALS_8 = "Digit (%s) length is larger than or equals 8!";
    public static final String DIFF_IS_BELOW_OR_EQUAL_ZERO = "Diff (%s) is below or equal to 0!";
    public static final String INVALID_NUMBER_FORMAT_DETECTED = "Invalid number (%s) detected!";


    public static final BiFunction<String, String, String> ERROR_MESSAGE_GENERATOR = String::format;
}
