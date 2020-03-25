create table PRUEBA2_MATERIA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE_MATERIA varchar(255) not null,
    CODIGO varchar(255),
    ESTUDIANTE_ID uuid,
    --
    primary key (ID)
);