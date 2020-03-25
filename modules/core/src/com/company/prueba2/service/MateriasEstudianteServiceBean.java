package com.company.prueba2.service;

import com.company.prueba2.entity.Estudiante;
import com.company.prueba2.entity.Materia;
import org.springframework.stereotype.Service;

import com.company.prueba2.entity.Estudiante;
import com.company.prueba2.entity.Materia;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;


@Service(MateriasEstudianteService.NAME)
public class MateriasEstudianteServiceBean implements MateriasEstudianteService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<Materia> obtenerMaterias(Estudiante estudiante) {
        List<Materia> materias  = dataManager.load(Materia.class)
                .query("select s from prueba1_Materia s where"+
                        " s.estudiante = :estudiante").parameter("estudiante",estudiante).list();

        return materias;
    }

    @Override
    public Boolean anadirMaterias(Materia materia, Estudiante estudiante) {
        System.out.println(estudiante.getId()+ " " + estudiante.getNombre());
        System.out.println(materia.getId()+ " " + materia.getNombreMateria());
        Estudiante estudiante2 = dataManager.getReference(Estudiante.class,estudiante.getId());
        System.out.println(estudiante2.getId()+ " " + estudiante2.getNombre());
        System.out.println(estudiante.getId()+ " " + estudiante.getNombre());

        if(estudiante2 instanceof Estudiante){
            if(materia.getEstudiante() == null){System.out.println("Esto es un null");}
            else{System.out.println(materia.getEstudiante());}
            materia.setEstudiante(estudiante);
            dataManager.commit(materia);
            return true;}
        else{return false;}

    }
}