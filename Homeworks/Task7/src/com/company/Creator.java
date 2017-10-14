package com.company;

public class Creator {
    private static final int MIN_DIGIT_NUMBER = 48;
    private static final int MAX_DIGIT_NUMBER = 57;
    private static final int MIN_ENGLISH_CAPITAL_LETTER_NUMBER = 65;
    private static final int MAX_ENGLISH_CAPITAL_LETTER_NUMBER = 90;
    private static final int MIN_ENGLISH_LOWERCASE_LETTER_NUMBER = 97;
    private static final int MAX_ENGLISH_LOWERCASE_LETTER_NUMBER = 122;
    private static final int CREATE_DIGIT = 48;
    private int back =0;
    private int aCode;
    private int multiplier = 1;
    private int[] parser = new int[100];

    public void setACode(int aCode) {
        this.aCode = aCode;
    }

    boolean isDigit(char c) {
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

    int parse(char number[],int count){

        for (int i=count-1; i>-1 ;i--){
            setACode(number[i]);
            if (aCode>=MIN_DIGIT_NUMBER && aCode<=MAX_DIGIT_NUMBER){
                aCode = aCode - CREATE_DIGIT;
            }
            aCode = aCode * multiplier;
            multiplier *= 10;
            parser[i] = aCode;
        }
        for (int i=0; i<count ;i++){
            back += parser[i];
        }
        multiplier = 1;
        return back;
    }


}
