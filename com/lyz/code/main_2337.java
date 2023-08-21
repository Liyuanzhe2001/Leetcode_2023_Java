package com.lyz.code;

/**
 * @author lkunk
 * @date 2023年08月21日 23:07
 * @description
 */

public class main_2337 {
    public boolean canChange(String start, String target) {
        int startIndex = 0;
        char[] charArray = target.toCharArray();
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
            char c = charArray[i];
            if (c != '_') {
                while (startIndex < start.length() && start.charAt(startIndex) == '_') {
                    startIndex++;
                }
                if ((startIndex == start.length()) ||
                        (start.charAt(startIndex) != c) ||
                        (c == 'L' && i > startIndex) ||
                        (c == 'R' && i < startIndex)) {
                    return false;
                }
                startIndex++;
            }
        }
        for (int i = startIndex; i < start.length(); i++) {
            if (start.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }
}
