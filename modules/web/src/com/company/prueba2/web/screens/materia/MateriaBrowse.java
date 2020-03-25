package com.company.prueba2.web.screens.materia;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.prueba2.entity.Materia;

import javax.inject.Inject;

@UiController("prueba2_Materia.browse")
@UiDescriptor("materia-browse.xml")
@LookupComponent("materiasTable")
@LoadDataBeforeShow
public class MateriaBrowse extends StandardLookup<Materia> {

    @Inject
    private Notifications notifications;
    @Inject
    private GroupTable<Materia> materiasTable;

    @Subscribe("prueba")
    public void onPruebaClick(Button.ClickEvent event) {
        System.out.println("HolDDRTRi");

        Materia materia = materiasTable.getSingleSelected();
        if(materia==null){
            notifications.create(Notifications.NotificationType.WARNING)
                    .withCaption("Por favor seleccione primero un Estudiante para ver sus Materias").show();
            System.out.println("Holi");
            System.out.println(materia.getNombreMateria());
        }
        else{
            System.out.println("Holiwiwiwiws");
            System.out.println(materia.getNombreMateria()+ " " +
                    materia.getId());
            System.out.println(materia.getEstudiante() + " " + materia.getEstudiante().getNombre());
            /*Estudiante estudiante2 = dataManager.getReference(Estudiante.class,estudiante.getId());
            materia.setEstudiante(estudiante2);
            dataManager.commit(materia);*/


        }
    }
    
    
}