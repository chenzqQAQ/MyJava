/**
 * Copyright (C),2015-2018
 * FileNmae: Circle
 * Author:   Administrator
 * Date:     2018/8/2310:45
 * History:
 * <author> <Time> <version> <desc>
 * 作者名字  时间    版本号  描述
 */
package com.youma;

import java.util.UUID;

public class Circle {
    private double radius;
    public static int count = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    class Draw {
        public void drawSahpe() {
            System.out.println(radius);
            System.out.println(count);
        }
    }

    public String generateUniqueKey() {
        String id = UUID.randomUUID().toString();
        return id;
    }


    class a {
        int k = 1;
        public void write() {
            System.out.println(k);
        }
    }

}