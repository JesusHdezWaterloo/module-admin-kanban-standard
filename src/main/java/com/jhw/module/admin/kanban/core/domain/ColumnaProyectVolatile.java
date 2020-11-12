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

    public static ColumnaProyectVolatile from(ProyectoDomain proyecto, ColumnaDomain columna) {
        return new ColumnaProyectVolatile(proyecto, columna);
    }

    private final ProyectoDomain proyecto;
    private final ColumnaDomain columna;

    public ColumnaProyectVolatile(ProyectoDomain proyecto, ColumnaDomain columna) {
        this.proyecto = proyecto;
        this.columna = columna;
    }

    public ProyectoDomain getProyecto() {
        return proyecto;
    }

    public ColumnaDomain getColumna() {
        return columna;
    }

    public LightWeigth lightweigth() {
        return LightWeigth.from(this);
    }

    public static class LightWeigth {

        public static LightWeigth from(ProyectoDomain proyecto, ColumnaDomain columna) {
            return new LightWeigth(proyecto.getIdProyecto(), columna.getIdColumna());
        }

        public static LightWeigth from(ColumnaProyectVolatile colProy) {
            return new LightWeigth(colProy.getProyecto().getIdProyecto(), colProy.getColumna().getIdColumna());
        }

        public static LightWeigth from(Integer idProyecto, Integer idColumna) {
            return new LightWeigth(idProyecto, idColumna);
        }
        
        public final Integer idProyecto;
        public final Integer idColumna;

        public LightWeigth(Integer idProyecto, Integer idColumna) {
            this.idProyecto = idProyecto;
            this.idColumna = idColumna;
        }

    }
}
