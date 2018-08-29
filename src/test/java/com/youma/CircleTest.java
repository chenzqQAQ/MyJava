/**
 * Copyright (C),2015-2018
 * FileNmae: CircleTest
 * Author:   Administrator
 * Date:     2018/8/2314:57
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testCircle1() {
        Circle c = new Circle(2);
        Assert.assertEquals(36, c.generateUniqueKey().length());
    }
}
