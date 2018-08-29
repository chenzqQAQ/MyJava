/**
 * Copyright (C),2015-2018
 * FileNmae: UserTest
 * Author:   Administrator
 * Date:     2018/8/289:44
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma;

import com.youma.his.dao.UsersDao;
import com.youma.his.dao.impl.UsersDaoImpl;
import com.youma.his.vo.Users;

import java.util.Iterator;
import java.util.List;

public class UserTest implements Test {
    static UsersDao usersDao = null;

    public UserTest() {
        usersDao = new UsersDaoImpl();
    }


    @Override
    public void findAll() {
        System.out.println("全查结果");
        List<Users> list = usersDao.findAllUsers();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Users user = (Users) it.next();
            System.out.print("用户id:" + user.getUserID() + "\t");
            System.out.print("用户名:" + user.getUserName() + "\t");
            System.out.print("用户密码:" + user.getUserPassword() + "\t");
            System.out.print("修改时间:" + user.getModifyTime() + "\n");
        }
    }

    @Override
    public void add() {
        Users users = new Users();
        users.setUserName("沉住气");
        users.setUserPassword("沉住气");
        int i = usersDao.userAdd(users);
        if (i != 0) {
            System.out.println("增加成功");
        }
    }

    @Override
    public void find(int id) {
        Users user = usersDao.findUsers(id);
        if (user.getUserName() != null) {
            System.out.print("用户id:" + user.getUserID() + "\t");
            System.out.print("用户名:" + user.getUserName() + "\t");
            System.out.print("用户密码:" + user.getUserPassword() + "\t");
            System.out.print("修改时间:" + user.getModifyTime() + "\n");
        } else {
            System.out.println("没有此用户");
        }
    }

    @Override
    public void del(int id) {
        int i = usersDao.delUsers(id);
        if (i != 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("没有此用户");
        }
    }

    @Override
    public void update() {
        Users user = usersDao.findUsers(4);
        user.setUserName("修改");
        user.setUserPassword("修改");
        int i = usersDao.updateUsers(user);
        if (i != 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("没有此用户");
        }


    }

    public static void main(String[] args) {
    }
}