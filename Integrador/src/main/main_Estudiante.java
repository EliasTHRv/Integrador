package main;

import servicio.EstudianteServicio;

/**
 *
 * @author elias
 */
public class main_Estudiante {
    public static void main(String[] args) {

        EstudianteServicio n1 = new EstudianteServicio();
        
        n1.crearEstudiantes();
        n1.calcularPromedio();
        n1.mostrarPromedio();
        n1.compararNotas();
        n1.mostrarAlumnos();
        
    }
    
}
