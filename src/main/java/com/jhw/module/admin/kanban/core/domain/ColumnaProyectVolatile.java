/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.kanban.core.domain;

import com.clean.core.domain.VolatileDomainObject;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class ColumnaProyectVolatile extends VolatileDomainObject {

    private final Integer idProyecto;
    private final Integer idColumna;

    public ColumnaProyectVolatile(ProyectoDomain proyecto, ColumnaDomain columna) {
        this.idProyecto = proyecto.getIdProyecto();
        this.idColumna = columna.getIdColumna();
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public Integer getIdColumna() {
        return idColumna;
    }

}
