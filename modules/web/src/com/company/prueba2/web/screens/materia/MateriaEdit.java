package com.company.prueba2.web.screens.materia;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.prueba2.entity.Materia;

import javax.inject.Inject;
import java.util.List;

@UiController("prueba2_Materia.edit")
@UiDescriptor("materia-edit.xml")
@EditedEntityContainer("materiaDc")
@LoadDataBeforeShow
public class MateriaEdit extends StandardEditor<Materia> {
    /*
    @Inject
    private DataManager dataManager;
    @Inject
    private Notifications notifications;

    @Subscribe("pruebaba")
    public void onPruebabaClick(Button.ClickEvent event) {
        Materia materia  = dataManager.load(Materia.class)
                .query("select s from prueba2_Materia s").view("materia-view").one();
        System.out.println("Hola we");

        if(materia==null){
            System.out.println("Hola we 3");

            notifications.create(Notifications.NotificationType.WARNING)
                    .withCaption("Por favor seleccione primero un Estudiante para ver sus Materias").show();
            System.out.println("Holi");
            System.out.println(materia.getNombreMateria());
        }
        else{
            System.out.println("Hola we 2");

            System.out.println("Holiwiwiwiws");
            System.out.println(materia.getNombreMateria()+ " " +
                    materia.getId());
            System.out.println(materia.getEstudiante() + " " + materia.getEstudiante().getNombre());
            Estudiante estudiante2 = dataManager.getReference(Estudiante.class,estudiante.getId());
            materia.setEstudiante(estudiante2);
            dataManager.commit(materia);


        }
    }*/
    
}