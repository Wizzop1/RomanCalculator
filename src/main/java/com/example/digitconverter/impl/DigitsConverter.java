package com.example.digitconverter.impl;

import com.example.digitconverter.converter.Converter;

public class DigitsConverter implements Converter {

    @Override
    public String toRoman(int number) {
        int l = arabicToRoman.floorKey(number);
        if (number == l) {
            return arabicToRoman.get(number);
        }
        return arabicToRoman.get(l) + toRoman(number - l);
    }

    @Override
    public int toArabic(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            char letter = s.charAt(i);
            char nextLetter = s.charAt(i + 1);

            if (Validator.isCharacterRoman(letter, romanToArabic) && Validator.isCharacterRoman(nextLetter, romanToArabic) &&
                    romanToArabic.get(letter) < romanToArabic.get(nextLetter)) {
                sum += romanToArabic.get(nextLetter) - romanToArabic.get(letter);
                i++;
            } else {
                sum += romanToArabic.get(letter);
            }
        }
        sum += romanToArabic.get(s.charAt(n - 1));
        return sum;
    }
}
