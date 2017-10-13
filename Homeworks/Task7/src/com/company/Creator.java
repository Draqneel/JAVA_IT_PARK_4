package com.company;

public class Creator {
    private static final int MIN_DIGIT_NUMBER = 48;
    private static final int MAX_DIGIT_NUMBER = 57;
    private static final int MIN_ENGLISH_CAPITAL_LETTER_NUMBER = 65;
    private static final int MAX_ENGLISH_CAPITAL_LETTER_NUMBER = 90;
    private static final int MIN_ENGLISH_LOWERCASE_LETTER_NUMBER = 97;
    private static final int MAX_ENGLISH_LOWERCASE_LETTER_NUMBER = 122;
    private char A;
    private int aCode;


    boolean isDigit(char c) {
        this.aCode = (int) c;
        if (aCode >= MIN_DIGIT_NUMBER && aCode <= MAX_DIGIT_NUMBER) {
            return true;
        } else {
            return false;
        }
    }

    boolean isLetter(char c) {
        if (aCode >= MIN_ENGLISH_CAPITAL_LETTER_NUMBER && aCode <= MAX_ENGLISH_CAPITAL_LETTER_NUMBER || aCode >= MIN_ENGLISH_LOWERCASE_LETTER_NUMBER && aCode <= MAX_ENGLISH_LOWERCASE_LETTER_NUMBER) {
            return true;
        } else {
            return false;
        }
    }

    boolean isUpper(char c) {
        if (aCode >= MIN_ENGLISH_CAPITAL_LETTER_NUMBER && aCode <= MAX_ENGLISH_CAPITAL_LETTER_NUMBER) {
            return true;
        } else {
            return false;
        }

    }

    boolean isLower(char c) {
        if (aCode >= MIN_ENGLISH_LOWERCASE_LETTER_NUMBER && aCode <= MAX_ENGLISH_LOWERCASE_LETTER_NUMBER) {
            return true;
        } else {
            return false;
        }

    }


}
