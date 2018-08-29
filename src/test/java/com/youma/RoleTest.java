/**
 * Copyright (C),2015-2018
 * FileNmae: RoleTest
 * Author:   Administrator
 * Date:     2018/8/2819:45
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma;

import com.youma.his.dao.RoleDao;
import com.youma.his.dao.impl.RoleDaoImpl;
import com.youma.his.vo.Role;

import java.util.Iterator;
import java.util.List;

public class RoleTest implements Test {
    static RoleDao roleDao = null;

    public RoleTest() {
        roleDao = new RoleDaoImpl();
    }

    @Override
    public void findAll() {
        List<Role> list = roleDao.findAllRole();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Role role = (Role) it.next();
            System.out.println(role.toString());
        }
    }

    @Override
    public void add() {
        Role role = new Role();
        role.setRoleID(2);
        role.setRoleNum("54228");
        role.setRoleName("医生");
        int i = roleDao.roleAdd(role);
        if (i != 0) {
            System.out.println("增加成功");
        } else {
            System.out.println("角色已存在");
        }

    }

    @Override
    public void find(int id) {
        System.out.println(roleDao.findRole(1));
    }

    @Override
    public void del(int id) {

        int i = roleDao.delRole(id);
        if (i != 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("没有该用户");
        }
    }

    @Override
    public void update() {
        Role role = roleDao.findRole(1);
        role.setRoleName("Asdasd");
        int i = roleDao.updateRole(role);
        if (i != 0) System.out.println("修改成功");
    }
}
