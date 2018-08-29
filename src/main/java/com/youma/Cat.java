/**
 * Copyright (C),2015-2018
 * FileNmae: Cat
 * Author:   Administrator
 * Date:     2018/8/2316:58
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma;

/**
 * @author Administrator
 */
public class Cat implements Animal {
    public String name = "cat";

    @Override
    public void run() {
        System.out.println("猫跑");
    }
}

