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
public class DataBean {

    private String name;
    private String discipline;
    private Integer absence;

    public DataBean(String name, String discipline, Integer absence) {
        this.name = name;
        this.discipline = discipline;
        this.absence = absence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Integer getAbsence() {
        return absence;
    }

    public void setAbsence(Integer absence) {
        this.absence = absence;
    }
}
