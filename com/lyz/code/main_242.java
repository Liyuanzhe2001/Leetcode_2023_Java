package com.lyz.code;

import java.util.HashMap;
import java.util.Objects;

public class main_242 {

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(new main_242().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (Character character : sMap.keySet()) {
            if (!Objects.equals(sMap.get(character), tMap.get(character))) {
                return false;
            }
        }
        return true;
    }

}
