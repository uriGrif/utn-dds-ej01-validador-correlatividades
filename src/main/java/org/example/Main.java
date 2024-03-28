package org.example;

import java.util.ArrayList;

class Inscripcion {
    private Alumno alumno;
    private ArrayList<Materia> materias;

    public Inscripcion(Alumno alumno, ArrayList<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias; // seria mejor q lo inicialice vacio y q haya un metodo "agregarMateriaAprobada()", pero como no lo pusimos en clase en el diagrama de clases, por las dudas lo dejo asi
    }

    public boolean aprobada() {
        return this.materias.stream().allMatch(m -> this.alumno.puedeCursar(m));
    }
}

class Alumno {
    private String nombre;
    private String legajo;
    private ArrayList<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo, ArrayList<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean puedeCursar(Materia materia) {
        return this.materiasAprobadas.containsAll(materia.getCorrelativas());
    }
}

class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre, ArrayList<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}