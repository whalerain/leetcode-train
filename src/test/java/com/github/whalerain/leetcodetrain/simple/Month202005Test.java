package com.github.whalerain.leetcodetrain.simple;

import org.junit.Assert;
import org.junit.Test;

/**
 * 2020年5月测试
 * @author ZhangXi
 */
public class Month202005Test {

    @Test
    public void testCanThreePartsEqualSum() {
        int[] array = {0,2,1,-6,6,7,9,-1,2,0,1};
        boolean result = Month202005.canThreePartsEqualSum(array);
        Assert.assertFalse("预期=false", result);
    }





}
