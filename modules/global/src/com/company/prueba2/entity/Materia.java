package com.company.prueba2.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|nombreMateria")
@Table(name = "PRUEBA2_MATERIA")
@Entity(name = "prueba2_Materia")
public class Materia extends StandardEntity {
    private static final long serialVersionUID = 4711957039832055587L;

    @NotNull
    @Column(name = "NOMBRE_MATERIA", nullable = false, unique = true)
    protected String nombreMateria;

    @Column(name = "CODIGO")
    protected String codigo;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTUDIANTE_ID")
    protected Estudiante estudiante;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
}