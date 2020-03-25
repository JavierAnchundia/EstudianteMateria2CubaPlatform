package com.company.prueba2.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|nombre,apellido")
@Table(name = "PRUEBA2_ESTUDIANTE")
@Entity(name = "prueba2_Estudiante")
public class Estudiante extends StandardEntity {
    private static final long serialVersionUID = -1853949066883819421L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @NotNull
    @Column(name = "APELLIDO", nullable = false)
    protected String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}