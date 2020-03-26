package com.company.prueba2.web.screens.materiaestudiante;

import com.company.prueba2.entity.Estudiante;
import com.company.prueba2.entity.Materia;
import com.company.prueba2.service.MateriasEstudianteService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;

@UiController("prueba2_Materiaestudiante")
@UiDescriptor("materiaestudiante.xml")
@DialogMode(forceDialog = true, width = "900px", height = "800px")
@LoadDataBeforeShow
public class Materiaestudiante extends Screen {

    private Estudiante estudiante;

    @Inject
    private MateriasEstudianteService materiasEstudianteService;

    @Inject
    private GroupTable<Materia> materiasTable;

    @Inject
    private TextArea<String> materiasTomadas;

    @Inject
    private Button anadirMaterias;
    @Inject
    private Notifications notifications;

    public Materiaestudiante() {
    }

    public Materiaestudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        mostrarMateriasEstudiante();
    }

    private void mostrarMateriasEstudiante() {
        String info = "";
        if (estudiante == null) System.out.println("No se puede mostrar");
        else {
            List<Materia> materias = materiasEstudianteService.obtenerMaterias(estudiante);
            if (materias.size() == 0) {
                info = "Este estudiante no tiene materias registradas";
            } else {
                for (Materia materia : materias) {
                    info = info + materia.getNombreMateria() + "\n";
                }
            }

            materiasTomadas.setValue(info);

        }
    }

    @Subscribe("anadirMaterias")
    public void onAnadirMateriasClick(Button.ClickEvent event) {
        Materia materia = materiasTable.getSingleSelected();
        if (materia == null) {
            notifications.create(Notifications.NotificationType.WARNING)
                    .withCaption("Por favor seleccione primero una Materia que desee anadir").show();
            System.out.println(estudiante.getNombre());
        } else {

            materiasEstudianteService.anadirMaterias(materiasTable.getSingleSelected(), estudiante);
            getScreenData().loadAll();
            mostrarMateriasEstudiante();

        }


    }

}