/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.admin.kanban.core;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class ModuleAdminKanbanConstants {

    public static final String KANBAN_GENERAL_PATH = "/kanban";

    public static final String SEARCH = "search";
    public static final String COL_PROY = "columna_proyecto";
    public static final String TAREA = "tarea";
    public static final String COLUMNA = "columna";

    //-----------------------COLUMNS-----------------------\\
    public static final String COLUMMA_GENERAL_PATH = KANBAN_GENERAL_PATH + "/columna";

    public static final String COLUMNS_FIND_FIRST_PATH = "/first";
    public static final RequestMethod COLUMNS_FIND_FIRST_METHOD = RequestMethod.GET;

    public static final String COLUMNS_FIND_LAST_PATH = "/last";
    public static final RequestMethod COLUMNS_FIND_LAST_METHOD = RequestMethod.GET;

    //-----------------------PRIORIDAD-----------------------\\
    public static final String PRIORIDAD_GENERAL_PATH = KANBAN_GENERAL_PATH + "/prioridad";

    public static final String PRIORIDAD_FIND_ALL_SEARCH_PATH = "/find_all/{" + SEARCH + "}";
    public static final RequestMethod PRIORIDAD_FIND_ALL_SEARCH_METHOD = RequestMethod.GET;

    //-----------------------PROYECTO-----------------------\\
    public static final String PROYECTO_GENERAL_PATH = KANBAN_GENERAL_PATH + "/proyecto";

    //-----------------------TAREA-----------------------\\
    public static final String TAREA_GENERAL_PATH = KANBAN_GENERAL_PATH + "/tarea";

    public static final String TAREA_FIND_PATH = "/find/{" + COL_PROY + "}";
    public static final RequestMethod TAREA_FIND_METHOD = RequestMethod.GET;

    public static final String TAREA_MOVE_PATH = "/move/{" + TAREA + "}/{" + COLUMNA + "}";
    public static final RequestMethod TAREA_MOVE_METHOD = RequestMethod.GET;

}
