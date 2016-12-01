/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.jr.simple;

/**
 *
 * @author vasil
 */
import java.util.ArrayList; 
 
public class DAOStub { 
 
    public ArrayList<DataBean> getDataBeanList() { 
        ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>(); 
        DataBean tempBean = new DataBean(); 
        tempBean.setName("Петя"); 
        tempBean.setDiscipline("Физика"); 
        tempBean.setAbsence(2); 
        dataBeanList.add(tempBean); 
 
        tempBean = new DataBean(); 
        tempBean.setName("Вася"); 
        tempBean.setDiscipline("История"); 
        tempBean.setAbsence(3); 
        dataBeanList.add(tempBean); 
 
        tempBean = new DataBean(); 
        tempBean.setName("Ира"); 
        tempBean.setDiscipline("English"); 
        tempBean.setAbsence(5); 
        dataBeanList.add(tempBean); 
 
        return dataBeanList; 
    } 
} 