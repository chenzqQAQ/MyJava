/**
 * Copyright (C),2015-2018
 * FileNmae: RegisterDaoImpl
 * Author:   Administrator
 * Date:     2018/8/2816:46
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package com.youma.his.dao.impl;

import com.youma.his.dao.RegisterDao;
import com.youma.his.util.ConnectionDB;
import com.youma.his.vo.Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegisterDaoImpl extends BaseDao implements RegisterDao {
    @Override
    public int registerAdd(Register register) {
        conn = ConnectionDB.getConnection();
        String sql = "insert into register(medicalNum,registerName,identifierType,identifierNum,socialSecurityNum,phoneNum,expenseFlag,sex,age,profession,czFlag,doctorID,flag,remark)\n" +
                " value(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int col = 0;
        try {
            ps = conn.prepareStatement(sql);
            int i = 1;
            ps.setObject(i++, register.getMedicalNum());
            ps.setObject(i++, register.getRegisterName());
            ps.setObject(i++, register.getIdentifierType());
            ps.setObject(i++, register.getIdentifierNum());
            ps.setObject(i++, register.getSocialSecurityNum());
            ps.setObject(i++, register.getPhoneNum());
            ps.setObject(i++, register.getExpenseFlag());
            ps.setObject(i++, register.getSex());
            ps.setObject(i++, register.getAge());
            ps.setObject(i++, register.getProfession());
            ps.setObject(i++, register.getCzFlag());
            ps.setObject(i++, register.getDoctorID());
            ps.setObject(i++, register.getFlag());
            ps.setObject(i++, register.getRemark());
            col = ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return col;
    }

    @Override
    public int updateRegister(Register register) {
        conn = ConnectionDB.getConnection();
        String sql = "UPDATE register SET medicalNum = ?, registerName = ?, identifierType = ?, " +
                "identifierNum = ?, socialSecurityNum = ?, phoneNum =?, expenseFlag = ?, " +
                "sex = ?, age = ?, profession = ?, czFlag = ?, doctorID = ?, flag = ?, " +
                "remark = ? WHERE medicalNum =?";
        int col = 0;
        try {
            ps = conn.prepareStatement(sql);
            int i = 1;
            ps.setObject(i++, register.getMedicalNum());
            ps.setObject(i++, register.getRegisterName());
            ps.setObject(i++, register.getIdentifierType());
            ps.setObject(i++, register.getIdentifierNum());
            ps.setObject(i++, register.getSocialSecurityNum());
            ps.setObject(i++, register.getPhoneNum());
            ps.setObject(i++, register.getExpenseFlag());
            ps.setObject(i++, register.getSex());
            ps.setObject(i++, register.getAge());
            ps.setObject(i++, register.getProfession());
            ps.setObject(i++, register.getCzFlag());
            ps.setObject(i++, register.getDoctorID());
            ps.setObject(i++, register.getFlag());
            ps.setObject(i++, register.getRemark());
            ps.setObject(i++, register.getMedicalNum());
            col = ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return col;
    }

    @Override
    public int delRegister(int id) {
        conn=ConnectionDB.getConnection();
        String sql="delete from register\n" +
                "where medicalNum=?";
        int col=0;
        try {
            ps=conn.prepareStatement(sql);
            ps.setObject(1,id);
            col=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return col;
    }

    @Override
    public List<Register> findAllRegister() {
        List<Register> list = new ArrayList<Register>();
        conn = ConnectionDB.getConnection();
        String sql = "SELECT \n" +
                "    medicalNum,\n" +
                "    registerName,\n" +
                "    identifierType,\n" +
                "    identifierNum,\n" +
                "    socialSecurityNum,\n" +
                "    phoneNum,\n" +
                "    expenseFlag,\n" +
                "    sex,\n" +
                "    age,\n" +
                "    profession,\n" +
                "    czFlag,\n" +
                "    doctorID,\n" +
                "    flag,\n" +
                "    remark\n" +
                "FROM\n" +
                "    register\n";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Register register = new Register();
                register.setMedicalNum(rs.getInt("medicalNum"));
                register.setRegisterName(rs.getString("registerName"));
                register.setIdentifierType(rs.getInt("identifierType"));
                register.setIdentifierNum(rs.getString("identifierNum"));
                register.setSocialSecurityNum(rs.getString("socialSecurityNum"));
                register.setPhoneNum(rs.getString("phoneNum"));
                register.setExpenseFlag(rs.getInt("expenseFlag"));
                register.setSex(rs.getInt("sex"));
                register.setAge(rs.getInt("age"));
                register.setProfession(rs.getString("profession"));
                register.setCzFlag(rs.getString("czFlag"));
                register.setDoctorID(rs.getInt("doctorID"));
                register.setFlag(rs.getInt("flag"));
                register.setRemark(rs.getString("remark"));
                list.add(register);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Register findRegister(int id) {
        conn = ConnectionDB.getConnection();
        Register register = null;
        String sql = "SELECT \n" +
                "    medicalNum,\n" +
                "    registerName,\n" +
                "    identifierType,\n" +
                "    identifierNum,\n" +
                "    socialSecurityNum,\n" +
                "    phoneNum,\n" +
                "    expenseFlag,\n" +
                "    sex,\n" +
                "    age,\n" +
                "    profession,\n" +
                "    czFlag,\n" +
                "    doctorID,\n" +
                "    flag,\n" +
                "    remark\n" +
                "FROM\n" +
                "    register\n" +
                "WHERE\n" +
                "    medicalNum = ?";
        try {
            register = new Register();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                register.setMedicalNum(rs.getInt("medicalNum"));
                register.setRegisterName(rs.getString("registerName"));
                register.setIdentifierType(rs.getInt("identifierType"));
                register.setIdentifierNum(rs.getString("identifierNum"));
                register.setSocialSecurityNum(rs.getString("socialSecurityNum"));
                register.setPhoneNum(rs.getString("phoneNum"));
                register.setExpenseFlag(rs.getInt("expenseFlag"));
                register.setSex(rs.getInt("sex"));
                register.setAge(rs.getInt("age"));
                register.setProfession(rs.getString("profession"));
                register.setCzFlag(rs.getString("czFlag"));
                register.setDoctorID(rs.getInt("doctorID"));
                register.setFlag(rs.getInt("flag"));
                register.setRemark(rs.getString("remark"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return register;
    }
}
