package com.github.whalerain.leetcodetrain;

import com.github.whalerain.leetcodetrain.Exercise1000To1100;
import org.junit.Assert;
import org.junit.Test;

/**
 * 2020年5月测试
 * @author ZhangXi
 */
public class Exercise1000To1100Test {

    @Test
    public void testCanThreePartsEqualSum() {
        int[] array = {0,2,1,-6,6,7,9,-1,2,0,1};
        boolean result = Exercise1000To1100.canThreePartsEqualSum(array);
        Assert.assertFalse("预期=false", result);
    }





}
