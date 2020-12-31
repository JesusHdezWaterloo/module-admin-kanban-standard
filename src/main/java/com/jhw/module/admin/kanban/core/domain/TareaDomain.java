/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.kanban.core.domain;

import com.jhw.module.admin.kanban.core.utils.FibonacciNumber;
import com.root101.utils.clean.EntityDomainObjectValidated;
import java.time.LocalDate;
import javax.validation.constraints.*;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
//orden por comparable
public class TareaDomain extends EntityDomainObjectValidated implements Comparable<TareaDomain> {

    private Integer idTarea;

    @NotEmpty(message = "#msg.module.admin.validation.tarea_nombre_vacio#")
    @Size(max = 95, message = "#msg.module.admin.validation.tarea_nombre_largo#")
    private String nombreTarea;

    @NotEmpty(message = "#msg.module.admin.validation.tarea_codigo_vacio#")
    @Size(max = 10, message = "#msg.module.admin.validation.tarea_codigo_largo#")
    private String codigoTarea;

    @NotNull(message = "#msg.module.admin.validation.tarea_prioridad_null#")
    private PrioridadDomain prioridadFk;

    @FibonacciNumber(message = "#msg.module.admin.validation.tarea_puntos_no_fibo#")
    private int puntos;

    @Size(max = 995, message = "#msg.module.contabilidad.validation.descripcion_larga#")
    private String descripcion;

    @NotNull(message = "#msg.module.admin.validation.tarea_columna_null#")
    private ColumnaDomain columnaFk;

    @NotNull(message = "#msg.module.admin.validation.tarea_proyecto_null#")
    private ProyectoDomain proyectoFk;

    private LocalDate lastChange = LocalDate.now();

    public TareaDomain() {
    }

    public TareaDomain(String nombreTarea, String codigoTarea, PrioridadDomain prioridadFk, int puntos, String descripcion, ColumnaDomain columnaFk, ProyectoDomain proyectoFk) {
        this.nombreTarea = nombreTarea;
        this.codigoTarea = codigoTarea;
        this.prioridadFk = prioridadFk;
        this.puntos = puntos;
        this.descripcion = descripcion;
        this.columnaFk = columnaFk;
        this.proyectoFk = proyectoFk;
    }

    public LocalDate getLastChange() {
        return lastChange;
    }

    public void setLastChange(LocalDate lastChange) {
        this.lastChange = lastChange;
    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getCodigoTarea() {
        return codigoTarea;
    }

    public void setCodigoTarea(String codigoTarea) {
        this.codigoTarea = codigoTarea;
    }

    public PrioridadDomain getPrioridadFk() {
        return prioridadFk;
    }

    public void setPrioridadFk(PrioridadDomain prioridadFk) {
        this.prioridadFk = prioridadFk;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ColumnaDomain getColumnaFk() {
        return columnaFk;
    }

    public void setColumnaFk(ColumnaDomain columnaFk) {
        this.columnaFk = columnaFk;
    }

    public ProyectoDomain getProyectoFk() {
        return proyectoFk;
    }

    public void setProyectoFk(ProyectoDomain proyectoFk) {
        this.proyectoFk = proyectoFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarea != null ? idTarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TareaDomain)) {
            return false;
        }
        TareaDomain other = (TareaDomain) object;
        if ((this.idTarea == null && other.idTarea != null) || (this.idTarea != null && !this.idTarea.equals(other.idTarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigoTarea + ": " + nombreTarea;
    }

    @Override
    public int compareTo(TareaDomain o) {// el - para que ordene de mayor a menor
        int prior = -this.prioridadFk.compareTo(o.prioridadFk);
        if (prior == 0) {
            return -Integer.compare(puntos, o.puntos);
        }
        return prior;
    }

}
