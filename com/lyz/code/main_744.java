package com.lyz.code;

public class main_744 {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        System.out.println(new main_744().nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
}
