/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.kanban.core.domain;

import com.root101.clean.core.domain.VolatileDomainObject;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class MoveTarea extends VolatileDomainObject {

    public static MoveTarea from(TareaDomain tarea, ColumnaDomain columna) {
        return new MoveTarea(tarea, columna);
    }

    public static MoveTarea from(Integer idTarea, Integer idColumna) {
        return new MoveTarea(idTarea, idColumna);
    }

    private Integer idTarea;
    private Integer idColumna;

    public MoveTarea() {
    }

    public MoveTarea(TareaDomain tarea, ColumnaDomain columna) {
        this.idTarea = tarea.getIdTarea();
        this.idColumna = columna.getIdColumna();
    }

    public MoveTarea(Integer idTarea, Integer idColumna) {
        this.idTarea = idTarea;
        this.idColumna = idColumna;
    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public Integer getIdColumna() {
        return idColumna;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public void setIdColumna(Integer idColumna) {
        this.idColumna = idColumna;
    }

}
