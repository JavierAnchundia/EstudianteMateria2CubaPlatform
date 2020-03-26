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

}