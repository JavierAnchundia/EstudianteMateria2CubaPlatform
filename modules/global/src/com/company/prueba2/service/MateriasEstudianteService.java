package com.company.prueba2.service;

import com.company.prueba2.entity.Estudiante;
import com.company.prueba2.entity.Materia;

import java.util.List;

public interface MateriasEstudianteService {
    String NAME = "prueba2_MateriasEstudianteService";

    List<Materia> obtenerMaterias(Estudiante e);
    Boolean anadirMaterias(Materia materia,Estudiante e);
}