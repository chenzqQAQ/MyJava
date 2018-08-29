/**
 * Copyright (C),2015-2018
 * FileNmae: TestRun
 * Author:   Administrator
 * Date:     2018/8/2819:07
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma;

public class TestRun {
    public static void main(String[] args) {
        // Test test=new RegisterTest();
        // test.add();
        // test.find(2014524);
        // test.findAll();
        // test.update();
        // Test ut = new UserTest();
        // ut.find(8);
        // ut.add();
        // ut.findAll();
        // ut.update();
        // ut.findAll();
        // ut.del(9);
        Test test=new RoleTest();
        // test.add();
        // test.update();
        test.findAll();
        test.del(1);
        test.findAll();
        // test.find(1);

    }
}
