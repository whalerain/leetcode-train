package com.github.whalerain.leetcodetrain.exerciseUp500;

import com.github.whalerain.leetcodetrain.support.TagConst;
import org.junit.jupiter.api.*;

/**
 * 560. 和为K的子数组
 * @author ZhangXi
 */
@DisplayName("560. 和为K的子数组")
@Tags({
        @Tag(TagConst.ALL),
        @Tag(TagConst.MIDDLE)
})
class TestExercise560 {

    /**
     *
     */
    @Test
    @DisplayName("默认思路：暴力枚举")
    void testSubarraySum() {
        int count = Exercise560.subarraySum(new int[]{2,3,7,0,-6,9,1}, 10);
        Assertions.assertEquals(4, count);
    }

    @Test
    @DisplayName("官方思路：前缀和")
    void testSubarraySumOfficial() {
        int count = Exercise560.subarraySumOfficial(new int[]{1,2,2,3,0,0,5,2}, 5);
        Assertions.assertEquals(7, count);
    }


}
