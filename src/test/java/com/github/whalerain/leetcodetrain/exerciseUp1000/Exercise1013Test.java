package com.github.whalerain.leetcodetrain.exerciseUp1000;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 2020年5月测试
 * @author ZhangXi
 */
class Exercise1013Test {

    @Test
    void testCanThreePartsEqualSum() {
        int[] array = {0,2,1,-6,6,7,9,-1,2,0,1};
        boolean result = Exercise1013.canThreePartsEqualSum(array);
        Assertions.assertFalse(result, "预期=false");
    }

}
