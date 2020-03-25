package com.company.prueba2.web.screens.estudiante;

import com.haulmont.cuba.gui.screen.*;
import com.company.prueba2.entity.Estudiante;

@UiController("prueba2_Estudiante.edit")
@UiDescriptor("estudiante-edit.xml")
@EditedEntityContainer("estudianteDc")
@LoadDataBeforeShow
public class EstudianteEdit extends StandardEditor<Estudiante> {
}