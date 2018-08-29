/**
 * Copyright (C),2015-2018
 * FileNmae: RegisterTest
 * Author:   Administrator
 * Date:     2018/8/2817:09
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma;

import com.youma.his.dao.RegisterDao;
import com.youma.his.dao.impl.RegisterDaoImpl;
import com.youma.his.vo.Register;

import java.util.Iterator;
import java.util.List;

public class RegisterTest implements Test {
    static RegisterDao registerDao = null;

    public RegisterTest() {
        registerDao = new RegisterDaoImpl();
    }


    @Override
    public void findAll() {

        List<Register> list=registerDao.findAllRegister();
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            Register register= (Register) it.next();
            System.out.println(register.toString());
        }


    }

    @Override
    public void add() {
        Register register = new Register();
        register.setMedicalNum(201452524);
        register.setRegisterName("撒大声地");
        register.setIdentifierType(0);
        register.setSocialSecurityNum("253255");
        register.setIdentifierNum("854220");
        register.setPhoneNum("145278");
        register.setExpenseFlag(0);
        register.setSex(1);
        register.setAge(25);
        register.setProfession("老师");
        register.setCzFlag("初诊");
        register.setDoctorID(1);
        register.setFlag(1);
        register.setRemark("这是个傻逼备注");
        int i = registerDao.registerAdd(register);
        if (i != 0) {
            System.out.println("增加成功");
        }

    }

    @Override
    public void find(int id) {
        Register register = registerDao.findRegister(id);
        System.out.println(register.toString());
        // System.out.println(register.getMedicalNum());
        // System.out.println(register.getRegisterName());
        // System.out.println(register.getIdentifierType());
        // System.out.println(register.getIdentifierNum());
        // System.out.println(register.getSocialSecurityNum());
        // System.out.println(register.getPhoneNum());
        // System.out.println(register.getExpenseFlag());
        // System.out.println(register.getSex());
        // System.out.println(register.getAge());
        // System.out.println(register.getProfession());
        // System.out.println(register.getCzFlag());
        // System.out.println(register.getDoctorID());
        // System.out.println(register.getFlag());
        // System.out.println(register.getRemark());
    }

    @Override
    public void del(int id) {

    }

    @Override
    public void update() {
        Register register=registerDao.findRegister(2014524);
        register.setRegisterName("修改");
        registerDao.updateRegister(register);

    }

    public static void main(String[] args) {

    }

}
