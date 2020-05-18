package com.github.whalerain.leetcodetrain.exerciseUp0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZhangXi
 */
public class Exercise3Test {

    @Test
    public void testLengthOfLongestSubstring() {
        String input1 = "abcabcbb";
        int length = Exercise3.lengthOfLongestSubstring(input1);
        Assertions.assertEquals(3, length);
        String input2 = "au";
        length = Exercise3.lengthOfLongestSubstring(input2);
        Assertions.assertEquals(2, length);
    }



}
